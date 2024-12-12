package com.example.paymentservicenov24.controllers;

import com.example.paymentservicenov24.dtos.IntiatePaymentDto;
import com.example.paymentservicenov24.services.PaymentService;
import com.razorpay.RazorpayException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentController {
    private PaymentService paymentService;
    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
    @PostMapping
    public String initiatePayment(@RequestBody IntiatePaymentDto initiatePaymentDto) throws RazorpayException {
        return paymentService.initiatePayment(initiatePaymentDto.getEmail(),initiatePaymentDto.getOrderId(),initiatePaymentDto.getPhoneNumber(),initiatePaymentDto.getAmount());
    }
    @PostMapping("/webhook")
    public String listenToWebhook(@RequestBody String webhookEvent) throws RazorpayException {
        System.out.println(webhookEvent);
        return "OK";
    }
}
