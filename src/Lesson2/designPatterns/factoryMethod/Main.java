package Lesson2.designPatterns.factoryMethod;

public class Main {
    public static void main(String[] args) {
        PaymentFactory cardPayment = new CardPaymentFactory();
        cardPayment.createPayment().pay();
        PaymentFactory cashPayment = new CashPaymentFactory();
        cashPayment.createPayment().pay();
    }
}
