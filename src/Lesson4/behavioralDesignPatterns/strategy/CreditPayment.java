package Lesson4.behavioralDesignPatterns.strategy;

public class CreditPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Credit payment: " + amount);
    }
}
