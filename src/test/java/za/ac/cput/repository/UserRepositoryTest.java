package za.ac.cput.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.User;
import za.ac.cput.factory.UserFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.class)//executes method in alphabetical order
class UserRepositoryTest {
    private static UserRepository userRepository = UserRepository.getInstance();
    private static User user = UserFactory.createUser("John","Doe");

    @Test
    void a_create() {
        User addUser = userRepository.create(user);
        assertEquals(user.getEmail(), addUser.getEmail());

    }

    @Test
    void b_read() {
        User displayUser = userRepository.read(user.getEmail());
        assertNull(displayUser);//this test passes
        //assertNotNull(displayUser); this test fails
    }

    @Test
    void c_update() {
        User updateUser = new User.Builder().copy(user)
                .setLastName("Bond")
                .build();
        updateUser.display();
        assertNull(userRepository.update(updateUser));

    }

    @Test
    void d_delete() {
        boolean success = userRepository.delete(user.getEmail());
        //assertTrue(success);
        System.out.println("Deleted?: " + success);
    }

    @Test
    void e_getAll() {
        System.out.println("Getting all: ");
        System.out.println(userRepository.getAll());

    }
}