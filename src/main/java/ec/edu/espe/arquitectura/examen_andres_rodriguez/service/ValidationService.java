package ec.edu.espe.arquitectura.examen_andres_rodriguez.service;

import ec.edu.espe.arquitectura.examen_andres_rodriguez.repository.EnterpriseRepository;
import ec.edu.espe.arquitectura.examen_andres_rodriguez.repository.PaymentRollRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class ValidationService {
    private final EnterpriseRepository enterpriseRepository;
    private final PaymentRollRepository paymentRollRepository;

    public ValidationService(EnterpriseRepository enterpriseRepository, PaymentRollRepository paymentRollRepository) {
        this.enterpriseRepository = enterpriseRepository;
        this.paymentRollRepository = paymentRollRepository;
    }

    public validate(@RequestParam String month, @RequestParam String enterpriseRuc){
        
    }
}
