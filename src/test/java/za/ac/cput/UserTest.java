package za.ac.cput;

import org.junit.jupiter.api.Test;
import za.ac.cput.Domain.User;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    public void testUser(){
        User user1 = new User.Builder()
                .setFirstName("Breyton")
                .setLastName("Ernstzen")
                .setEmail("breytonseanernstzen1224@gmail.com")
                .build();
                user1.display();

    }

    @Test
    public void testAnotherUser(){
        User user2 = new User.Builder()
                .setLastName("Doe")
                .setEmail("doeJohn@gmail.com")
                .build();
                user2.display();
    }

}