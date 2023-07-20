package ec.edu.espe.arquitectura.examen_andres_rodriguez.controller;

import ec.edu.espe.arquitectura.examen_andres_rodriguez.controller.dto.ValidationRS;
import ec.edu.espe.arquitectura.examen_andres_rodriguez.service.ValidationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/validation")
public class ValidationController {

    private final ValidationService validationService;

    public ValidationController(ValidationService validationService) {
        this.validationService = validationService;
    }


    @GetMapping
    public ResponseEntity<ValidationRS> validation(@RequestParam String month, @RequestParam String enterpriseRuc){
        ValidationRS rs = this.validationService.validate(month, enterpriseRuc);
        return ResponseEntity.ok(rs);
    }
}
