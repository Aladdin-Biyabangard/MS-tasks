package Lesson3.structuralDesignPatterns.bridge;

class Red implements Color {

    @Override
    public void paint() {
        System.out.println("red");
    }
}