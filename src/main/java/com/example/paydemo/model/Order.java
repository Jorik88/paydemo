package com.example.paydemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Order {

    private String currency;
    private int amount;
    private String description;
}
