package com.kelvin.bankingapp.service;


import com.kelvin.bankingapp.dto.EmailDetails;

public interface EmailService {
    void sendEmailAlert(EmailDetails emailDetails);
}
