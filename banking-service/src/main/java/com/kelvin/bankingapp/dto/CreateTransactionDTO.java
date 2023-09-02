package com.kelvin.bankingapp.dto;


import lombok.Data;

import java.math.BigDecimal;

@Data
public class CreateTransactionDTO {
    Long userId;
    BigDecimal amount;
    Direction direction;
    String description;
}
