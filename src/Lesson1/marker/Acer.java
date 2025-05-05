package Lesson1.marker;

public class Acer implements Windows, Notebook {

    public Acer() {
        System.out.println("Acer notebook!");
    }

    @Override
    public String toString() {
        return "Acer";
    }
}
