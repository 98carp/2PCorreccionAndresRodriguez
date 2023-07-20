package ec.edu.espe.arquitectura.examen_andres_rodriguez.controller;

import ec.edu.espe.arquitectura.examen_andres_rodriguez.controller.dto.PaymentRollRQ;
import ec.edu.espe.arquitectura.examen_andres_rodriguez.model.Enterprise;
import ec.edu.espe.arquitectura.examen_andres_rodriguez.service.PaymentRollService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/paymentRoll")
public class PaymentRollController {
    private final PaymentRollService paymentRollService;

    public PaymentRollController(PaymentRollService paymentRollService) {
        this.paymentRollService = paymentRollService;
    }

    @PostMapping
    public ResponseEntity createPaymentRoll(@RequestBody PaymentRollRQ paymentRollRQ){
        this.paymentRollService.createPaymentRoll(paymentRollRQ);
        return ResponseEntity.ok().build();
    }
}
