package Lesson4.behavioralDesignPatterns.chainOfResponsibility;

public class PromotionFilter implements EmailService {
    @Override
    public void handle(EmailRequest emailRequest) {
        if (emailRequest.getContent().equals("discount")) {
            System.out.println("Discount email: " + emailRequest.getSubject());
        } else {
            new EmailInbox().handle(emailRequest);
        }
    }
}
