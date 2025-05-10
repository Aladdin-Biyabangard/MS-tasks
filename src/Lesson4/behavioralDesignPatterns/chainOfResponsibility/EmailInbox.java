package Lesson4.behavioralDesignPatterns.chainOfResponsibility;

public class EmailInbox implements EmailService {
    @Override
    public void handle(EmailRequest emailRequest) {
        System.out.println("Email delivered!");
    }
}
