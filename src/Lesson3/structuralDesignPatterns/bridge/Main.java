package Lesson3.structuralDesignPatterns.bridge;

public class Main {

    public static void main(String[] args) {
        Color red = new Red();
        Shape shape = new Rectangle(red);
        shape.draw();
    }


}
