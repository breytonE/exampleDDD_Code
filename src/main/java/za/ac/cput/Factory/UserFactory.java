package za.ac.cput.Factory;

import za.ac.cput.Domain.User;

import javax.swing.*;

public class UserFactory {
    //Create all your User objects here
    public static User createUser(String firstName,String lastName,String email) {

        try {

            if (firstName.isEmpty() ||lastName.isEmpty() ||email.isEmpty()){
                System.out.println("All fields must be completed!");
                return null;

            }else {
                User user = new User.Builder()
                        .setFirstName(firstName)
                        .setLastName(lastName)
                        .setEmail(email)
                        .build();
                user.display();
                return user;
            }

        } catch (Exception e) {
            System.out.println("Exception" + e.getMessage());
            return null;
        }
    }
}

