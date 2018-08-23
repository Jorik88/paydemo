package com.example.paydemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
@AllArgsConstructor
public class Checkout {

    private double version;
    private String transaction_type;
    private Map<String, String> settings;
    private Order order;
    private Customer customer;

    public Checkout(Order order, Customer customer) {
        this.version = 2.1;
        this.transaction_type = "payment";
        this.order = order;
        this.customer = customer;
        this.settings = new HashMap<>();
        this.settings.put("success_url", "http://127.0.0.1:4567/success");
        this.settings.put("decline_url", "http://127.0.0.1:4567/decline");
        this.settings.put("fail_url", "http://127.0.0.1:4567/fail");
    }
}
