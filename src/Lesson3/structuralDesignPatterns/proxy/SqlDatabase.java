package Lesson3.structuralDesignPatterns.proxy;

public class SqlDatabase implements Database {

    private String userName = "Aladdin";

    public String getUserName(){
        return userName;
    }

    public void confidentialInformation() {
        System.out.println("This is confidential information.");
    }
}
