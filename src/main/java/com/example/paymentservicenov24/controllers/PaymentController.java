package com.example.paymentservicenov24.controllers;

import com.example.paymentservicenov24.dtos.IntiatePaymentDto;
import com.example.paymentservicenov24.services.PaymentService;
import com.example.paymentservicenov24.services.ProductService;
import com.razorpay.RazorpayException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
public class PaymentController {
    private PaymentService paymentService;
    private ProductService productService;
    public PaymentController(PaymentService paymentService, ProductService productService) {
        this.paymentService = paymentService;
        this.productService = productService;
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
    @GetMapping("/product/{id}")
    public String getProductDetails(@PathVariable String id) {
        return productService.getProductDetails(id);
    }
}
