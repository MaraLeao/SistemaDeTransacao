package com.example.CRUDJava.domain.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public class TransactionDTO {

    private BigDecimal total;
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime createdAt;
    private String cardNumber;
    private String cvv;
    private  String owner;
    private  String ein;

    public TransactionDTO() {
    }

    public TransactionDTO(UUID transactionId, BigDecimal total, LocalDateTime createdAt, String cardNumber, String cvv, String owner, String ein) {
        this.total = total;
        this.createdAt = createdAt;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.owner = owner;
        this.ein = ein;
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
