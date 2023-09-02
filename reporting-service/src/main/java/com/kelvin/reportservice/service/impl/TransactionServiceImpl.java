package com.kelvin.reportservice.service.impl;

import com.kelvin.reportservice.dto.CreateTransactionDTO;
import com.kelvin.reportservice.entity.Transaction;
import com.kelvin.reportservice.repository.TransactionRepository;
import com.kelvin.reportservice.service.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
public class TransactionServiceImpl implements TransactionService {

    private final TransactionRepository transactionRepository;

    @Transactional(isolation = Isolation.SERIALIZABLE)
    @Override
    public void createTransaction(CreateTransactionDTO transaction){

        var newTransaction =  Transaction.builder().amount(transaction.getAmount())
                .userId(transaction.getUserId()).description(transaction.getDescription()).direction(transaction.getDirection())
                        .build();

        transactionRepository.save(newTransaction);
    }


    @Override
    public Transaction findTransactionById(Long id){
        return transactionRepository.findTransactionById(id);
    }

    @Override
    public List<Transaction> getTransactionsByUserId(Long userId){

        return transactionRepository.getTransactionsByUserId(userId);
    }
}
