package com.kelvin.reportservice.service;

import com.kelvin.reportservice.dto.CreateTransactionDTO;
import com.kelvin.reportservice.entity.Transaction;

import java.util.List;

public interface TransactionService {

    void createTransaction(CreateTransactionDTO transaction);

    Transaction findTransactionById(Long id);

    List<Transaction> getTransactionsByUserId(Long userId);
}
