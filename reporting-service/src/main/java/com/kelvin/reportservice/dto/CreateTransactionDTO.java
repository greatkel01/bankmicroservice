package com.kelvin.reportservice.dto;

import com.kelvin.reportservice.entity.Direction;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class CreateTransactionDTO {
    Long userId;
    BigDecimal amount;
    Direction direction;
    String description;
}
