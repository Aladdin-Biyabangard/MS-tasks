package Lesson1.SOLID.o;

public class PremiumCard implements CommissionService {

    @Override
    public double calculateCommission(double price) {
        return price * 0.2;
    }
}
