package com.kelvin.reportservice.controller;


import com.kelvin.reportservice.dto.CreateTransactionDTO;
import com.kelvin.reportservice.entity.Transaction;
import com.kelvin.reportservice.service.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/reports")
@RequiredArgsConstructor
public class TransactionController {

    private final TransactionService transactionService;


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createTransaction(@RequestBody CreateTransactionDTO transaction) {
        transactionService.createTransaction(transaction);
    }

    @GetMapping("/{userId}")
    public List<Transaction> userReports(@PathVariable Long userId ){
        return transactionService.getTransactionsByUserId(userId);
    }


    @GetMapping("/report/{id}")
    public List<Transaction> userReport( @PathVariable Long id ){
        return transactionService.getTransactionsByUserId(id);
    }
}
