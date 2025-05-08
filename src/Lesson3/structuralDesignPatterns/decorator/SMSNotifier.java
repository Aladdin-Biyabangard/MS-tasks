package Lesson3.structuralDesignPatterns.decorator;

public class SMSNotifier extends NotifierDecorator {
    private Notifier notifier;

    public SMSNotifier(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("SMS Notifier send!");
    }
}
