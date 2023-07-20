package ec.edu.espe.arquitectura.examen_andres_rodriguez.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ValidationRS {
    private String MES;
    private String RUC_EMPRESA;
    private Float VALOR_TOTAL;
    private Float VALOR_REAL;
    private Integer TOTAL_TRANSACCIONES;
    private Integer ERRORES;
}
