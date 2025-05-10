package Lesson4.behavioralDesignPatterns.strategy;

public class CashPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Cash payment: " + amount);
    }
}
