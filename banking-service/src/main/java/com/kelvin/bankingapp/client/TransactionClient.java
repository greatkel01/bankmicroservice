package com.kelvin.bankingapp.client;


import com.kelvin.bankingapp.config.FeignClientInterceptor;
import com.kelvin.bankingapp.dto.CreateTransactionDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "reporting-service", name = "reporting-service", configuration = FeignClientInterceptor.class)
public interface TransactionClient {

    @RequestMapping(method = RequestMethod.POST, value = "/api/v1/reports", consumes = "application/json", headers = {"Authorization: Bearer "})
    void createTransaction(CreateTransactionDTO transaction);
}
