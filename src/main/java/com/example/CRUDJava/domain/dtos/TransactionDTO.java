package com.example.CRUDJava.domain.dtos;

import com.example.CRUDJava.domain.entities.Transaction;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TransactionDTO {

    @NotNull
    @DecimalMin(value = "0.01")
    private BigDecimal total;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
    private LocalDateTime createdAt;
    private String cardNumber;
    private String cvv;

    @NotBlank
    private  String owner;

}
