package com.kelvin.bankingapp.service;


import com.kelvin.bankingapp.dto.BankResponse;
import com.kelvin.bankingapp.dto.CreditDebitRequest;
import com.kelvin.bankingapp.dto.EnquiryRequest;
import com.kelvin.bankingapp.dto.UserRequest;

public interface UserService {
    BankResponse createAccount(UserRequest userRequest);
    BankResponse balanceEnquiry(EnquiryRequest request);
    String nameEnquiry(EnquiryRequest request);
    BankResponse creditAccount(CreditDebitRequest request);
    BankResponse debitAccount(CreditDebitRequest request);
}
