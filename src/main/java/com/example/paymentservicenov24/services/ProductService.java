package com.example.paymentservicenov24.services;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ProductService {

    private RestTemplate restTemplate;

    public ProductService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    public String getProductDetails(String productId) {
        return restTemplate.getForObject("http://PRODUCTSERVICENOV24/products/" + productId ,String.class);
    }
}
