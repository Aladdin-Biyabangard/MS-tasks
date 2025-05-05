package Lesson2.designPatterns.singleton.multithread;

// Bill Pugh singleton

public class SecondSingleton {

    private SecondSingleton() {
    }

    private static class Holder {
        private static final SecondSingleton INSTANCE = new SecondSingleton();
    }

    public static SecondSingleton getInstance() {
        return Holder.INSTANCE;
    }
}
