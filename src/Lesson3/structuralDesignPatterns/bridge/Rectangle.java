package Lesson3.structuralDesignPatterns.bridge;

public class Rectangle implements Shape {

    private Color color;

    public Rectangle(Color color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.print("Rectangle drawn in ");
        color.paint();
    }
}
