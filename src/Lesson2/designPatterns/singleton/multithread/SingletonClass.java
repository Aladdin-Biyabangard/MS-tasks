package Lesson2.designPatterns.singleton.multithread;

public class SingletonClass {

    private static volatile SingletonClass singletonClass;

    private SingletonClass() {

    }

    public static synchronized SingletonClass getSingletonClass() {
        if (singletonClass == null) {
            synchronized (SingletonClass.class) {
                if (singletonClass == null) {
                    singletonClass = new SingletonClass();
                }
            }
        }
        return singletonClass;
    }


}
