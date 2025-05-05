package Lesson1.SOLID.S;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class User {

    private String userName;
    private String email;

    public User(String userName, String email) {
        this.userName = userName;
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(userName, user.userName) && Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, email);
    }
}


class UserRepository {

    private static List<User> users = new ArrayList<>();


    public static List<User> getUsers() {
        return users;
    }

    public static User save(User user) {
        users.add(user);
        return user;
    }
}


class UserService {

    public User saveNewUser(User user) {
        return UserRepository.save(user);
    }
}

