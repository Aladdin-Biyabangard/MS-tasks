package Lesson2.designPatterns.factoryMethod;

public class CashPaymentFactory implements PaymentFactory {
    @Override
    public Payment createPayment() {
        return new CashPayment();
    }
}
