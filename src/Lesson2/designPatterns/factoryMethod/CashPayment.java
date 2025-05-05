package Lesson2.designPatterns.factoryMethod;

public class CashPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("Cash payment.");
    }
}
