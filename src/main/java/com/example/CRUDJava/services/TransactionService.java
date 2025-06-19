package com.example.CRUDJava.services;

import com.example.CRUDJava.domain.dtos.TransactionDTO;
import com.example.CRUDJava.domain.entities.Transaction;

import java.util.List;
import java.util.UUID;

public interface TransactionService {
    Transaction save(TransactionDTO transactionDTO);
    List<Transaction> findAll();
    Transaction findById(UUID id);
    Transaction update(UUID id, TransactionDTO transactionDTO);
}
