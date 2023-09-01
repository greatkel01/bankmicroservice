package com.kelvin.bankingapp.client;

import com.kelvin.bankingapp.config.FeignClientInterceptor;
import com.kelvin.bankingapp.dto.EmailMessage;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "email-service", name = "email-service", configuration = FeignClientInterceptor.class)
public interface EmailClient {

    /**
     *
     * @param emailMessage
     * @return
     */
    @RequestMapping(method = RequestMethod.POST, value = "/api/v1/email/", consumes = "application/json", headers = {"Authorization: Bearer "})
    String sendEmail(EmailMessage emailMessage);


}
