package ec.edu.espe.arquitectura.examen_andres_rodriguez.service;

import ec.edu.espe.arquitectura.examen_andres_rodriguez.controller.dto.PaymentRollRQ;
import ec.edu.espe.arquitectura.examen_andres_rodriguez.model.EmployeePayment;
import ec.edu.espe.arquitectura.examen_andres_rodriguez.model.PaymentRoll;
import ec.edu.espe.arquitectura.examen_andres_rodriguez.repository.PaymentRollRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PaymentRollService {
    private final PaymentRollRepository paymentRollRepository;

    public PaymentRollService(PaymentRollRepository paymentRollRepository) {
        this.paymentRollRepository = paymentRollRepository;
    }

    public void createPaymentRoll(PaymentRollRQ paymentRollRQ){
        PaymentRoll paymentRoll = new PaymentRoll();
        paymentRoll.setMonth(paymentRollRQ.getMonth());
        paymentRoll.setProcessDate(paymentRollRQ.getProcessDate());
        paymentRoll.setEnterpriseRuc(paymentRoll.getEnterpriseRuc());
        paymentRoll.setMainAccount(paymentRollRQ.getMainAccount());
        paymentRoll.setRealValue(0.0f);

        Float sum = 0.0f;
        for(EmployeePayment employeePayment: paymentRollRQ.getEmployeePayments()){
            System.out.println("EMPLOYEE: " + employeePayment);
            sum+=employeePayment.getValue();
            employeePayment.setState("PEN");
        }
        paymentRoll.setTotalValue(sum);
        paymentRoll.setEmployeePayments(paymentRollRQ.getEmployeePayments());

        this.paymentRollRepository.save(paymentRoll);
    }

}
