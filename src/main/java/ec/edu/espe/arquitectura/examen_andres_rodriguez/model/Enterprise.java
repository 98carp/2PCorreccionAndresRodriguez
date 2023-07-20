package ec.edu.espe.arquitectura.examen_andres_rodriguez.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Document(collection = "empresas")
@CompoundIndex(name = "idx_empresas_ruc_razSocial", def="{'ruc': 1, 'enterpriseName': 1}", unique = true)
public class Enterprise {
    @Id
    private String id;
    private String ruc;
    private String enterpriseName;
    private String mainAccount;
    private List<Employee> employees;
}
