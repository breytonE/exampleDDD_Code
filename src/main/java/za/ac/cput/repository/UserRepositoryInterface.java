package za.ac.cput.repository;

import za.ac.cput.domain.User;

import java.util.Set;

//This repository only applies for the User domain >> User
public interface UserRepositoryInterface extends RepositoryInterface<User, String> {

    public Set<User> getAll();
}
