package com.example.CRUDJava.controllers;

import com.example.CRUDJava.domain.dtos.TransactionDTO;
import com.example.CRUDJava.domain.entities.Transaction;
import com.example.CRUDJava.services.TransactionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/transaction")
public class TransactionController {
    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @PostMapping
    public ResponseEntity<Transaction> save(@RequestBody TransactionDTO transactionDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(transactionService.save(transactionDTO));
    }

    @GetMapping
    public ResponseEntity<List<Transaction>> findAll() {
        return ResponseEntity.status(HttpStatus.OK).body(transactionService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Transaction> findById(@PathVariable("id") UUID id) {
        return ResponseEntity.status(HttpStatus.OK).body(transactionService.findById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Transaction> findById(@PathVariable("id") UUID id, @RequestBody TransactionDTO transactionDTO) {
        return ResponseEntity.status(HttpStatus.OK).body(transactionService.update(id, transactionDTO));
    }
}
