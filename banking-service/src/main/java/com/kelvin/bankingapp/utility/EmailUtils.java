package com.kelvin.bankingapp.utility;

import com.kelvin.bankingapp.client.EmailClient;
import com.kelvin.bankingapp.dto.EmailMessage;
import lombok.RequiredArgsConstructor;
import lombok.experimental.UtilityClass;

@UtilityClass
public class EmailUtils {

    public static String sendEmail(EmailClient emailClient, String firstname,String lastname,String otherName,String accountNumber, String email) throws Exception {
        EmailMessage emailMessage = new EmailMessage();
        emailMessage.setSubject("New Account Creation.");
        emailMessage.setName(firstname);
        emailMessage.setEmail(email);
        emailMessage.setMessage("Congratulations! Your Account Has been Successfully Created.\nYour Account Details: \n" +
                "Account Name: " + firstname + " " + lastname + " " + otherName + "\nAccount Number: " + accountNumber);
        try{
            emailClient.sendEmail(emailMessage);
            return "Email sent successfully to "+emailMessage.toString();
        } catch (Exception e){
            //Email will not be sent out form the public url
            e.printStackTrace();
        }
        return "Email failed to send "+emailMessage.toString();
    }
}
