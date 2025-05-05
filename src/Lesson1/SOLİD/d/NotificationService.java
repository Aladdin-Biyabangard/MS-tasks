package Lesson1.SOLİD.d;

public class NotificationService {

    private MessageSender messageSender;

    public NotificationService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void sendNotification(String message) {
        messageSender.send(message);
    }

    public static void main(String[] args) {
        EmailSender emailSender = new EmailSender();
        SmsSender smsSender = new SmsSender();

        NotificationService emailNotification = new NotificationService(emailSender);
        emailNotification.sendNotification("Via email");

        NotificationService smsNotification = new NotificationService(smsSender);
        smsNotification.sendNotification("Via sms");
    }
}
