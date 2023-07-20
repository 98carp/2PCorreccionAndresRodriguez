package ec.edu.espe.arquitectura.examen_andres_rodriguez.controller;

import ec.edu.espe.arquitectura.examen_andres_rodriguez.model.Enterprise;
import ec.edu.espe.arquitectura.examen_andres_rodriguez.service.EnterpriseService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/enterprise")
public class EnterpriseController {
    private final EnterpriseService enterpriseService;

    public EnterpriseController(EnterpriseService enterpriseService) {
        this.enterpriseService = enterpriseService;
    }

    @PostMapping
    public ResponseEntity createEnterprise(@RequestBody Enterprise enterprise){
        this.enterpriseService.createEnterprise(enterprise);
        return ResponseEntity.ok().build();
    }
}
