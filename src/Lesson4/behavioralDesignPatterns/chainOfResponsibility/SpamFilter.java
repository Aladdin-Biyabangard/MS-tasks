package Lesson4.behavioralDesignPatterns.chainOfResponsibility;

public class SpamFilter implements EmailService {

    @Override
    public void handle(EmailRequest emailRequest) {
        if (emailRequest.getContent().equals("bonus")) {
            System.out.println("Spam message: " + emailRequest.getSubject());
        } else {
            new VirusDetected().handle(emailRequest);
        }
    }
}
