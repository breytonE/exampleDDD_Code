package za.ac.cput.repository;

import za.ac.cput.domain.Location;

import java.util.HashSet;
import java.util.Set;

public class LocationRepository implements LocationRepositoryInterface{
   private static LocationRepository repository = null;
   private static Set<Location> locationsDB = null;

   public LocationRepository(){
       locationsDB = new HashSet<Location>();
   }

   public static LocationRepository getInstance(){

       if(repository == null){
           repository = new LocationRepository();
       }
       return repository;
   }

    @Override
    public Location create(Location location) {

       boolean success = locationsDB.add(location);

       if(!success)
           return null;
           return location;
    }

    @Override
    public Location read(String locationID) {

       for(Location location : locationsDB) {
           if (location.getLocationID().equals(locationID))
               return location;
       }
       return null;
    }

    @Override
    public Location update(Location location) {

       Location oldLocation = read(location.getLocationID());

       if(oldLocation != null){
           locationsDB.remove(oldLocation);
           locationsDB.add(location);
           return location;
       }
       return null;
    }

    @Override
    public boolean delete(String locationID) {
       Location deleteLocation = read(locationID);

       if(deleteLocation == null)
           return false;
           locationsDB.remove(deleteLocation);
        return true;
    }

    @Override
    public Set<Location> getAll() {
        return locationsDB;
    }
}
