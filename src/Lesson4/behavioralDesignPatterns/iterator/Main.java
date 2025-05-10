package Lesson4.behavioralDesignPatterns.iterator;

public class Main {
    public static void main(String[] args) {
        UserCollection players = new UserCollection(5);

        players.addUser(new User("Elvin"));
        players.addUser(new User("Rəşad"));
        players.addUser(new User("Aysel"));

        UserIterator iterator = players.iterator();

        System.out.println("Oyunçular:");
        while (iterator.hasNext()) {
            System.out.println("- " + iterator.next().getName());
        }
    }
}
