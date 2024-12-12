package com.example.paymentservicenov24.configs;

import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RazorPayClientConfiguration {
    @Value("${razorpay.key.id}")
    private String id;
    @Value("${razorpay.key.secret}")
    private String secret;
    @Bean
    public RazorpayClient razorpayClient() throws RazorpayException {
        return new RazorpayClient(id, secret);
    }
}
