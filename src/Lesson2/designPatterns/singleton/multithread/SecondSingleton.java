package Lesson2.designPatterns.singleton.multithread;

// Bill Pugh singleton

public class SecondSingleton {

    private SecondSingleton() {
    }

    // Statikler class yaradilanda avtomatik load oldugu ucun sira muhumdur

    private static class Holder {
        private static final SecondSingleton INSTANCE = new SecondSingleton();
    }

    public static SecondSingleton getInstance() {
        return Holder.INSTANCE;
    }
}
