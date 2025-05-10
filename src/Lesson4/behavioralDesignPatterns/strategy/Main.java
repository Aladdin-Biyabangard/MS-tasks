package Lesson4.behavioralDesignPatterns.strategy;

public class Main {
    public static void main(String[] args) {
        StrategyService strategyService = new StrategyService();

        strategyService.setPaymentStrategy(new CashPayment());
        strategyService.pay(120);
    }
}
