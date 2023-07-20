package ec.edu.espe.arquitectura.examen_andres_rodriguez.repository;

import ec.edu.espe.arquitectura.examen_andres_rodriguez.model.PaymentRoll;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PaymentRollRepository extends MongoRepository<PaymentRoll, String> {
}
