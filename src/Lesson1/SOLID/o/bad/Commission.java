package Lesson1.SOLID.o.bad;

public class Commission {

    public double calculateCommission(String cardType, double price) {
        if (cardType.equals("PREMIUM")) return price * 0.2;
        else return price * 0.1;
    }
}
