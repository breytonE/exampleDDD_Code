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

    @Test
    public void testLocationDetails(){
        Location newLocation = new Location.Builder()
                .setProvince("Limpopo")
                .build();
        System.out.println(newLocation.toString());
        assertNotNull(newLocation);
        //assertNull(newLocation);//fail test
    }
}