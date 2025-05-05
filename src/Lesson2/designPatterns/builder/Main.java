package Lesson2.designPatterns.builder;

public class Main {
    public static void main(String[] args) {
        User user = new User.Builder()
                .userName("Aladdin")
                .address("Gandja")
                .build();

        System.out.println(user);
    }
}
