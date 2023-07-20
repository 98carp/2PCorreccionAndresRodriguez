package ec.edu.espe.arquitectura.examen_andres_rodriguez.controller.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ValidationRS {
    private String MES;
    private String RUC_EMPRESA;
    private Float VALOR_TOTAL;
    private Float VALOR_REAL;
    private Integer TOTAL_TRANSACCIONES;
    private Integer ERRORES;
}
