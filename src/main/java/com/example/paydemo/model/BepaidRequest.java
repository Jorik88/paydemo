package com.example.paydemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BepaidRequest {

    private Checkout checkout;
}
