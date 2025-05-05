package Lesson2.designPatterns.factoryMethod;

public class CardPaymentFactory implements PaymentFactory {
    @Override
    public Payment createPayment() {
        return new CardPayment();
    }
}
