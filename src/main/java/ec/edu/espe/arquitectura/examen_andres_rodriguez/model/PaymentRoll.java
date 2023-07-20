package ec.edu.espe.arquitectura.examen_andres_rodriguez.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Document(collection = "rolPago")
public class PaymentRoll {
    @Id
    private String id;
    private String month;
    private Date processDate;
    private String enterpriseRuc;
    private String mainAccount;
    private Float totalValue;
    private Float realValue;
    List<EmployeePayment> employeePayments;
}
