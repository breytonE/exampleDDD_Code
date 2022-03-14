package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Location;

import static org.junit.jupiter.api.Assertions.*;

class LocationFactoryTest {

    @Test
    public void createLocation(){
        Location testLocation = LocationFactory.createLocation("Western Cape","South Africa");
        assertNotNull(testLocation);
    }
}