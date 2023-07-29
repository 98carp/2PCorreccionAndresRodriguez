package ec.edu.espe.arquitectura.examen_andres_rodriguez.service;

import ec.edu.espe.arquitectura.examen_andres_rodriguez.controller.dto.ValidationRS;
import ec.edu.espe.arquitectura.examen_andres_rodriguez.model.Employee;
import ec.edu.espe.arquitectura.examen_andres_rodriguez.model.EmployeePayment;
import ec.edu.espe.arquitectura.examen_andres_rodriguez.model.Enterprise;
import ec.edu.espe.arquitectura.examen_andres_rodriguez.model.PaymentRoll;
import ec.edu.espe.arquitectura.examen_andres_rodriguez.repository.EnterpriseRepository;
import ec.edu.espe.arquitectura.examen_andres_rodriguez.repository.PaymentRollRepository;
import org.springframework.stereotype.Service;

@Service
public class ValidationService {
    private final EnterpriseRepository enterpriseRepository;
    private final PaymentRollRepository paymentRollRepository;

    public ValidationService(EnterpriseRepository enterpriseRepository, PaymentRollRepository paymentRollRepository) {
        this.enterpriseRepository = enterpriseRepository;
        this.paymentRollRepository = paymentRollRepository;
    }

    public ValidationRS validate(String month, String enterpriseRuc){
        Enterprise enterprise = enterpriseRepository.findByRuc(enterpriseRuc);
        PaymentRoll paymentRoll = paymentRollRepository.findByMonth(month);

        for (EmployeePayment employeePayment : paymentRoll.getEmployeePayments()){
            employeePayment.setState("BAD");
            for(Employee employee : enterprise.getEmployees()){
                if (employee.getAccountNumber().equals(employeePayment.getAccountNumber())){
                    employeePayment.setState("VAL");
                }
            }
        }

        Float sumVal = 0.0f;
        Integer transactions = 0;
        Integer errors = 0;
        for(EmployeePayment employeePayment : paymentRoll.getEmployeePayments()){
            if (employeePayment.getState().equals("VAL")){
                transactions+=1;
                sumVal+=employeePayment.getValue();
            }else{
                errors+=1;
            }
        }
        paymentRoll.setRealValue(sumVal);
        paymentRollRepository.save(paymentRoll);

        ValidationRS validationRS = new ValidationRS(month, enterpriseRuc, paymentRoll.getTotalValue(), paymentRoll.getRealValue(), transactions, errors);

        return validationRS;
    }
}