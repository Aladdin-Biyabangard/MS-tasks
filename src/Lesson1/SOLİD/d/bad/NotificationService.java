package Lesson1.SOLİD.d.bad;

public class NotificationService {
    private EmailService emailService;

    public NotificationService() {
        this.emailService = new EmailService();
    }

    public void sendNotification(String message) {
        emailService.send(message);
    }
}
