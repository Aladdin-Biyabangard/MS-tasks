package Lesson2.designPatterns.singleton.singlethread;

public class SingletonClass {

    private static SingletonClass singletonClass;

    private SingletonClass() {

    }

    public static SingletonClass getSingletonClass() {
        if (singletonClass == null) singletonClass = new SingletonClass();
        return singletonClass;
    }



    public void singletonTestMethod() {
        System.out.println("Singleton pattern.");
    }

}
