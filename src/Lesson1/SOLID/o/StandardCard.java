package Lesson1.SOLID.o;

public class StandardCard implements CommissionService {
    @Override
    public double calculateCommission(double price) {
        return price * 0.1;
    }
}
