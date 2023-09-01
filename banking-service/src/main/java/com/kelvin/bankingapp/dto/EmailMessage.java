package com.kelvin.bankingapp.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmailMessage {

    private String name;

    @NotNull
    @Email(message = "Email field can not be null")
    private String email;

    @NotNull(message = "Subject field can not be null")
    private String subject;

    @NotNull(message = "Message field can not be null")
    @Min(10)
    private String message;
}
