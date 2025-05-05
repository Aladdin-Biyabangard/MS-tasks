package Lesson1.marker;

public class Asus implements Windows, Notebook {

    public Asus() {
        System.out.println("Asus notebook!");
    }

    @Override
    public String toString() {
        return "Asus";
    }
}
