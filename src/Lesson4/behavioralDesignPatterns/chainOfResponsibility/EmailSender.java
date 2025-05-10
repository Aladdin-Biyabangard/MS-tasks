package Lesson4.behavioralDesignPatterns.chainOfResponsibility;

public class EmailSender {

    public void sendEmail(EmailRequest emailRequest) {
        new SpamFilter().handle(emailRequest);
    }
}
