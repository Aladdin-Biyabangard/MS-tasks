package Lesson4.behavioralDesignPatterns.observer;

public class Main {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();
        notificationService.addObserver(new User("Aladdin"));

        notificationService.sendNotification("Yeni dərs yükləndi!");

    }
}
