package com.sergio.portfolioweb.portfolio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
    private static String MY_MAIL = "sergio.carrero.martin@gmail.com";
    
    @Autowired
    private JavaMailSender mailSender;

    @Async
    public void sendMail(String name, String userMail, String menssage){
        SimpleMailMessage email = new SimpleMailMessage();
        email.setTo(MY_MAIL);
        email.setSubject("Nuevo mensaje de contacto: "+name);
        email.setText("De: "+name+ " <"+userMail+">\n\n" +menssage);
        email.setReplyTo(userMail);

        mailSender.send(email);
    }
}
