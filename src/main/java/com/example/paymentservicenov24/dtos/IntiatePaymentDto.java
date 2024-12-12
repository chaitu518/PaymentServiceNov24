package com.example.paymentservicenov24.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IntiatePaymentDto {
    private String email;
    private String phoneNumber;
    private String orderId;
    private int amount;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderId = orderNumber;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
