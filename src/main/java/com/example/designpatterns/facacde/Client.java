package com.example.designpatterns.facacde;

public class Client {

    public static void main(String[] args) {
        EmailSettings emailSettings = new EmailSettings();
        emailSettings.setHost("127.0.0.1");
        EmailSender emailSender = new EmailSender(emailSettings);
        EmailMessage emailMessage = new EmailMessage();
        emailMessage.setFrom("taekwon");
        emailMessage.setTo("kwonSlave");
        emailMessage.setText("테스트 메일");
        emailSender.sendEmail(emailMessage);
    }

}
