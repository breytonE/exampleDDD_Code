package za.ac.cput.factory;

import za.ac.cput.domain.Location;
import za.ac.cput.util.Helper;

public class LocationFactory {
    //Create all your Location objects here

    public static Location createLocation(String province,String country){
        String setLocationID = Helper.generateID();

        Location locations = new Location.Builder()
                .setLocationID(setLocationID)
                .setProvince(province)
                .setCountry(country)
                .build();
        System.out.println(locations.toString());
            return locations;
    }
}
