package Lesson3.structuralDesignPatterns.bridge;

public class Circle implements Shape {

    private Color color;

    public Circle(Color color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.print("Circle drawn in ");
        color.paint();
    }
}
