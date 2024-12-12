package com.example.paymentservicenov24.adapters;

import com.razorpay.RazorpayException;
import org.springframework.stereotype.Component;

@Component
public interface PaymentGateWay {
    public String createPaymentLink(String email,String phoneNumber,String orderId,int amount) throws RazorpayException;
}
