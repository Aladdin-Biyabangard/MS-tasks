package Lesson3.structuralDesignPatterns.decorator;

public class Main {
    public static void main(String[] args) {
        Notifier notifier = new EmailNotifier(new SMSNotifier(new SimpleNotifier()));
        notifier.send("Welcome to the system!");

    }
}
