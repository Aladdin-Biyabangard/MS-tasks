package Lesson4.behavioralDesignPatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class NotificationService {
    List<Observer> observers = new ArrayList<>();

    void addObserver(Observer observer) {
        observers.add(observer);
    }

    void updateObserver(Observer observer) {
        observers.add(observer);
    }

    void sendNotification(String message) {
        observers.forEach(observer -> observer.update(message));
    }
}
