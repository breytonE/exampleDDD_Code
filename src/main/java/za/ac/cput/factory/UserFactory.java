package za.ac.cput.factory;

import za.ac.cput.domain.User;
import za.ac.cput.util.Helper;

public class UserFactory {
    //Create all your User objects here
    public static User createUser(String firstName,String lastName) {

        String email = Helper.generateID();

        User newUser = new User.Builder()
                .setEmail(email)
                .setFirstName(firstName)
                .setLastName(lastName)
                .build();
                newUser.display();
                return newUser;
        }
    }


