package com.example.CRUDJava.domain.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "transactions")
public class Transaction {
    @Id
    @GeneratedValue(strategy =  GenerationType.UUID)
    private UUID transactionId;
    private BigDecimal total;
    private LocalDateTime createdAt;
    private String cardNumber;
    private String cvv;
    private  String owner;
    private  String ein;

    @PrePersist
    public void prePersist() {
        if (this.createdAt == null) {
            this.createdAt = LocalDateTime.now();
        }
    }

    public Transaction() {

    }

    public Transaction(UUID transactionId, BigDecimal total, LocalDateTime createdAt, String cardNumber, String cvv, String owner, String ein) {
        this.transactionId = transactionId;
        this.total = total;
        this.createdAt = createdAt;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.owner = owner;
        this.ein = ein;
    }

    public UUID getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(UUID transactionId) {
        this.transactionId = transactionId;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getEin() {
        return ein;
    }

    public void setEin(String ein) {
        this.ein = ein;
    }
}
