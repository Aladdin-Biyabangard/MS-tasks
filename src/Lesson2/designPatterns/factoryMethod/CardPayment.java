package Lesson2.designPatterns.factoryMethod;

public class CardPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("Card payment.");
    }
}
