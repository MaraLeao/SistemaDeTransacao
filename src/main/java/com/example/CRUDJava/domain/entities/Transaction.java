package com.example.CRUDJava.domain.entities;

import lombok.*;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "transactions")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
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

}
