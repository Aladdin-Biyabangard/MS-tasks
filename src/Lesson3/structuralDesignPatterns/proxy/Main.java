package Lesson3.structuralDesignPatterns.proxy;

public class Main {
    public static void main(String[] args) {
        Database database1 = new SqlDatabaseProxy("aladdin");
        database1.confidentialInformation();
        System.out.println("-----");
        Database database2 = new SqlDatabaseProxy("Aladdin");
        database2.confidentialInformation();
    }
}
