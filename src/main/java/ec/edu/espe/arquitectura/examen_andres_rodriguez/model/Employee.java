package ec.edu.espe.arquitectura.examen_andres_rodriguez.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Employee {
    private String ci;
    private String lastNames;
    private String firstNames;
    private String accountNumber;
}
