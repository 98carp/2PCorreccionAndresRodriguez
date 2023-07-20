package ec.edu.espe.arquitectura.examen_andres_rodriguez.controller.dto;

import ec.edu.espe.arquitectura.examen_andres_rodriguez.model.EmployeePayment;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Builder
public class PaymentRollRQ {
    private String month;
    private Date processDate;
    private String enterpriseRuc;
    private String mainAccount;
    List<EmployeePayment> employeePayments;
}
