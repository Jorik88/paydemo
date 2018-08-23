package com.example.paydemo.controller;

import com.example.paydemo.model.Checkout;
import com.example.paydemo.model.Customer;
import com.example.paydemo.model.Order;
import com.example.paydemo.model.BepaidRequest;
import com.example.paydemo.service.BepaidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BepaidRestController {

    @Autowired
    private BepaidService bepaidService;

    @GetMapping("/pay")
    public ResponseEntity getToken(){
        Order usd = new Order("usd", 22, "Some description");
        Customer customer = new Customer("jake@example.com");
        Checkout checkout = new Checkout(usd, customer);
//        return ResponseEntity.ok(bepaidService.sendRequest(new BepaidRequest(checkout, usd, customer)));
        return ResponseEntity.ok(new BepaidRequest(checkout));
    }
}
