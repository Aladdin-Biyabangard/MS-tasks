package Lesson3.structuralDesignPatterns.decorator;

public class SimpleNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("Notifier send!");
    }
}
