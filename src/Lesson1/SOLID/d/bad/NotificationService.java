package Lesson1.SOLID.d.bad;

public class NotificationService {
    private EmailService emailService;

    public NotificationService() {
        this.emailService = new EmailService();
    }

    public void sendNotification(String message) {
        emailService.send(message);
    }
}
