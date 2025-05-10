package Lesson4.behavioralDesignPatterns.chainOfResponsibility;

public class VirusDetected implements EmailService {

    @Override
    public void handle(EmailRequest emailRequest) {
        if (emailRequest.getContent().equals("<script>")) {
            System.out.println("Virus detected: " + emailRequest.getSubject());
        } else {
            new PromotionFilter().handle(emailRequest);
        }
    }
}
