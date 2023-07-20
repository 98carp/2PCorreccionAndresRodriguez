package ec.edu.espe.arquitectura.examen_andres_rodriguez.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EmployeePayment {
    private String accountNumber;
    private Float value;
    private String state;
}
