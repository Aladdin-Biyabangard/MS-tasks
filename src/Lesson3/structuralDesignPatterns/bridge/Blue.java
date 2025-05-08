package Lesson3.structuralDesignPatterns.bridge;

class Blue implements Color {


    @Override
    public void paint() {
        System.out.println("blue");
    }
}