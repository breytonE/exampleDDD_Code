package za.ac.cput.repository;

import za.ac.cput.domain.Location;

import java.util.Set;

public interface LocationRepositoryInterface extends RepositoryInterface<Location,String>{

    public Set<Location> getAll();
}
