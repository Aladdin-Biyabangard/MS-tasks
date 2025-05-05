package Lesson1.SOLID.S.bad;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Payment {

    private String paymentId;

    private BigDecimal payment;

    private List<Payment> payments = new ArrayList<>();


    public List<Payment> getPayments() {
        return payments;
    }

    public Payment save(Payment payment) {
        payments.add(payment);
        return payment;
    }

    public void deletePayment(Payment payment) {
        payments.remove(payment);
    }

    public void sendPaymentHistoryByEmail(List<Payment> payments) {

    }
}
