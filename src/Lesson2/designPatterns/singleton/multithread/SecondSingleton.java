package Lesson2.designPatterns.singleton.multithread;

// Bill Pugh singleton

public class SecondSingleton {

    //Reflection qarsisini aliriq
    private static boolean instanceCreated = false;


    private SecondSingleton() {
        if (instanceCreated) {
            throw new RuntimeException("Class artiq yaradilib!");
        }
    }

    private static class Holder {
        private static final SecondSingleton INSTANCE = new SecondSingleton();
    }

    public static SecondSingleton getInstance() {
        return Holder.INSTANCE;
    }
}
