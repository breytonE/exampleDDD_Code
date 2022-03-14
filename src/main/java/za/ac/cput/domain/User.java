package za.ac.cput.domain;

public class User {
    private String firstName;
    private String lastName;
    private String email;

    private User(Builder b) {
        this.firstName = b.firstName;
        this.lastName = b.lastName;
        this.email = b.email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void display() {
        System.out.println("User first name: " + this.firstName);
        System.out.println("User last name: " + this.lastName);
        System.out.println("User email: " + this.email);
    }

    public static class Builder {
        private String firstName;
        private String lastName;
        private String email;

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder copy(User user) {
            this.firstName = user.firstName;
            this.lastName = user.lastName;
            this.email = user.email;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
