package com.example.CRUDJava.services;

import com.example.CRUDJava.domain.dtos.TransactionDTO;
import com.example.CRUDJava.domain.entities.Transaction;
import com.example.CRUDJava.repositories.TransactionRepository;
import com.fasterxml.jackson.databind.util.BeanUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class TransactionServiceImpl implements TransactionService {
    private final TransactionRepository transactionRepository;

    public TransactionServiceImpl(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    @Override
    public Transaction save(TransactionDTO transactionDTO) {
        Transaction transaction = new Transaction();
        BeanUtils.copyProperties(transactionDTO, transaction);
        return transactionRepository.save(transaction);
    }

    @Override
    public List<Transaction> findAll() {
        return  transactionRepository.findAll();
    }

    @Override
    public Transaction findById(UUID id) {
        return transactionRepository.findById(id).get();
    }

    @Override
    public Transaction update(UUID id, TransactionDTO transactionDTO) {
        Optional<Transaction> transaction = transactionRepository.findById(id);
        if (!transaction.isPresent()) {
            throw new RuntimeException("Transaction not found");
        }
        BeanUtils.copyProperties(transactionDTO, transaction.get());

        return transactionRepository.save(transaction.get());
    }
}
