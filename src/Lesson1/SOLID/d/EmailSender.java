package Lesson1.SOLID.d;

public class EmailSender implements MessageSender {
    @Override
    public void send(String message) {
        System.out.println("Email send: " + message);
    }
}
