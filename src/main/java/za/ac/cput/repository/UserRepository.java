package za.ac.cput.repository;

import za.ac.cput.domain.User;

import java.util.HashSet;
import java.util.Set;

public class UserRepository implements UserRepositoryInterface{
    private static UserRepository userRepository= null;
    private Set<User> userDB = null;

    private UserRepository(){
        userDB = new HashSet<User>();
    }

    public static UserRepository getInstance() {

        if (userRepository == null) {//If no repository is created yet,then create one for the first time
            userRepository = new UserRepository();
        }
        return userRepository;
    }

    //Create or adds a new user
    @Override
    public User create(User createUser) {

        boolean success = userDB.add(createUser); //Determines whether a user was successfully added or not

        if(!success)
            return null;
        return createUser;
    }

        //Read a user
    @Override
    public User read(String userEmail) {
        //search through the list/database for email existence
        for(User user: userDB) {
            if (user.getEmail().equals(userEmail))
                return user;
        }
        return null;
    }

    //Updates a user
    @Override
    public User update(User user) {
            User oldUser = read(user.getEmail());

            if (oldUser != null){
                userDB.remove(oldUser);
                userDB.add(user);
                return user;
            }
            return null;
    }

    //Deletes a user from the database
    @Override
    public boolean delete(String userEmail) {

        User deleteUser = read(userEmail);

        if (deleteUser == null)
            return false;
         userDB.remove(deleteUser);
        return true;
        }

        //Return all users from the database
    @Override
    public Set<User> getAll() {
        return userDB;
    }
}
