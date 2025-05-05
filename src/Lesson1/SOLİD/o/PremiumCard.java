package Lesson1.SOLİD.o;

public class PremiumCard implements CommissionService {

    @Override
    public double calculateCommission(double price) {
        return price * 0.2;
    }
}
