package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.User;

import static org.junit.jupiter.api.Assertions.*;

class UserFactoryTest {

    @Test
    public void createUser(){
        User testUser = UserFactory.createUser("James","Dixon");
        assertNotNull(testUser);
    }
}