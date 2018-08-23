package com.example.paydemo.service;

import com.example.paydemo.model.BepaidRequest;
import org.springframework.http.client.support.BasicAuthorizationInterceptor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BepaidService {

    private String bepaidTokenUrl = "https://checkout.bepaid.by/ctp/api/checkouts";
    private RestTemplate restTemplate = new RestTemplate();

    public String sendRequest(BepaidRequest bepaidRequest) {
        restTemplate.getInterceptors().add(new BasicAuthorizationInterceptor("4226", "250e70fb83bb0bb6b2db90360f24ae228b3b8ce2e42b754a346adf22fac7d22e"));
        String postForObject = restTemplate.postForObject(bepaidTokenUrl, bepaidRequest, String.class);

        return postForObject;
    }
}
