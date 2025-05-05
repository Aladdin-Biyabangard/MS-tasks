package Lesson1.SOLİD.d;

public class SmsSender implements MessageSender {
    @Override
    public void send(String message) {
        System.out.println("Sms send: " + message);
    }
}
