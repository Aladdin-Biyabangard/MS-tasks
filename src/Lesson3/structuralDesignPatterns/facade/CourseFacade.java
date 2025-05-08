package Lesson3.structuralDesignPatterns.facade;

public class CourseFacade {
    private Student student;
    private Projector projector;
    private Light light;

    public CourseFacade() {
        student = new Student();
        projector = new Projector();
        light = new Light();
    }

    public void startCourse() {
        student.checkStudents();
        projector.start();
        light.turnOn();
    }

}
