package Lesson1.SOLİD.i.bad;

import S.User;

import java.util.List;

public class ServiceImplementation implements Service {
    @Override
    public void saveUser(User user) {

    }

    @Override
    public void sendEmail(String userName) {
        throw new UnsupportedOperationException("");
    }

    @Override
    public void createUserListInExcelFormat(List<User> users) {

    }

    @Override
    public void createPayment(double payment) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void createCashPayment(User user) {

    }
}
