package za.ac.cput.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Location;
import za.ac.cput.factory.LocationFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.class)
class LocationRepositoryTest {
    private static LocationRepository repository = LocationRepository.getInstance();
    private static Location location = LocationFactory.createLocation("Gauteng","South Africa");

    @Test
    void a_create() {
        Location addLocation = repository.create(location);
        assertEquals(location.getLocationID(),addLocation.getLocationID());
        System.out.println("Created: " + addLocation);
    }

    @Test
    void b_read() {
        Location readLocation = repository.read(location.getLocationID());
        assertNotNull(readLocation);
        System.out.println("Showing: " + readLocation);
    }

    @Test
    void c_update() {
        Location updateLocation = new Location.Builder().copy(location)
                .setProvince("Northern Cape")
                .setCountry("South Africa")
                .build();
        assertNotNull(repository.create(updateLocation));
        System.out.println("Updated: " + updateLocation);

    }

    @Test
    void d_delete() {
        boolean success = repository.delete(location.getLocationID());
        //assertTrue(success);
        System.out.println("Deleted? " + success);
    }

    @Test
    void e_getAll() {
        System.out.println("Get all: ");
        System.out.println(repository.getAll() + "\n");
    }
}