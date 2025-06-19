package com.example.CRUDJava.domain.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

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

    public BigDecimal getTotal() {
        return total;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getCvv() {
        return cvv;
    }

    public String getOwner() {
        return owner;
    }

    public String getEin() {
        return ein;
    }

    public static class Builder {
        private BigDecimal total;
        private LocalDateTime createdAt;
        private String cardNumber;
        private String cvv;
        private String owner;
        private String ein;

        public Builder total(BigDecimal total) {
            this.total = total;
            return this;
        }
    }
}
