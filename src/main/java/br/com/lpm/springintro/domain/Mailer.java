package br.com.lpm.springintro.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;

@Component
public class Mailer {
    private String recipient;

    @Value("lucianopminuzzi@gmail.com")
    private String sender;

    @Value("Password remember")
    private String title;
    private String message;

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void sendEmail() {
        System.out.println("******Email sended!");
        System.out.println("Title: " + title);
        System.out.println("Sender: " + sender);
        System.out.println("Recipient: " + recipient);
        System.out.println("Message: " + message);
    }
}