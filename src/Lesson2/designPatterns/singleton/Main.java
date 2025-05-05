package Lesson2.designPatterns.singleton;

import DesignPatterns.singleton.singlethread.SingletonClass;

public class Main {
    public static void main(String[] args) {
        SingletonClass singletonClass = SingletonClass.getSingletonClass();
        singletonClass.singletonTestMethod();
        System.out.println(singletonClass);
        SingletonClass singletonClass1 = SingletonClass.getSingletonClass();
        singletonClass1.singletonTestMethod();
        System.out.println(singletonClass1);
    }
}
