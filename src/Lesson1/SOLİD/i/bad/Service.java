package Lesson1.SOLİD.i.bad;

import S.User;

import java.util.List;

public interface Service {

    void saveUser(User user);

    void sendEmail(String userName);

    void createUserListInExcelFormat(List<User> users);

    void createPayment(double payment);

    void createCashPayment(User user);
}
