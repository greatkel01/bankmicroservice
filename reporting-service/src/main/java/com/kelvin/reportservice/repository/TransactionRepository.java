package com.kelvin.reportservice.repository;

import com.kelvin.reportservice.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

    Transaction save(Transaction transaction);

    Transaction findTransactionById(Long id);

    List<Transaction> getTransactionsByUserId(Long userId);
}
