package ec.edu.espe.arquitectura.examen_andres_rodriguez.service;

import ec.edu.espe.arquitectura.examen_andres_rodriguez.model.Enterprise;
import ec.edu.espe.arquitectura.examen_andres_rodriguez.repository.EnterpriseRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EnterpriseService {
    private final EnterpriseRepository enterpriseRepository;

    public EnterpriseService(EnterpriseRepository enterpriseRepository) {
        this.enterpriseRepository = enterpriseRepository;
    }

    public void createEnterprise(Enterprise enterprise){
        this.enterpriseRepository.save(enterprise);
    }

    public Enterprise obtainEnterpriseByRuc(String ruc){
        return this.enterpriseRepository.findByRuc(ruc);
    }


}
