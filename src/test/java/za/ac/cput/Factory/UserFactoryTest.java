package za.ac.cput.Factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.Domain.User;

import static org.junit.jupiter.api.Assertions.*;

class UserFactoryTest {

    @Test
    public void createUser(){
        User testUser = UserFactory.createUser("James","Dixon","beanieD@gmail.com");
        assertNotNull(testUser);
    }
}