package Lesson4.behavioralDesignPatterns.iterator;

public class UserCollection {
    private User[] users;
    private int size = 0;

    public UserCollection(int capacity) {
        users = new User[capacity];
    }

    public void addUser(User user) {
        if (size < users.length) {
            users[size++] = user;
        }
    }

    public UserIterator iterator() {
        return new UserListIterator();
    }

    private class UserListIterator implements UserIterator {
        private int index = 0;

        public boolean hasNext() {
            return index < size;
        }

        public User next() {
            return users[index++];
        }
    }
}
