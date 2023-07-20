package ec.edu.espe.arquitectura.examen_andres_rodriguez.repository;

import ec.edu.espe.arquitectura.examen_andres_rodriguez.model.Enterprise;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EnterpriseRepository extends MongoRepository<Enterprise, String> {
    Enterprise findByRuc(String ruc);
}
