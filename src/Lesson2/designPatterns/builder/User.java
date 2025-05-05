package Lesson2.designPatterns.builder;

public class User {
    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    private String userName;
    private String email;
    private String address;

    private User(Builder builder) {
        this.userName = builder.userName;
        this.email = builder.email;
        this.address = builder.address;
    }


    public static class Builder {
        private String userName;
        private String email;
        private String address;

        public Builder userName(String userName) {
            this.userName = userName;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public User build() {
            return new User(this);
        }

    }
}
