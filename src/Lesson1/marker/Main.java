package Lesson1.marker;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Notebook> notebooks = List.of(new Acer(), new Asus(), new M5());
        for (Notebook notebook : notebooks) {
            if (notebook instanceof Windows) {
                System.out.println(notebook);
            }
        }

    }
}
