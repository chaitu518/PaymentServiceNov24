package com.example.paymentservicenov24.services;

import com.example.paymentservicenov24.adapters.PaymentGateWay;
import com.razorpay.RazorpayException;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    private PaymentGateWay paymentGateWay;
    public PaymentService(PaymentGateWay paymentGateWay) {
        this.paymentGateWay = paymentGateWay;
    }
    public String initiatePayment(String email, String orderId, String phoneNumber, int amount) throws RazorpayException {
        return paymentGateWay.createPaymentLink(email,phoneNumber,orderId,amount);
    }
}
