package za.ac.cput.repository;
//This repository applies to all domain classes >> Location, Role, User
//This is the main interface

public interface RepositoryInterface <T,ID>{ //'T' stands for type
    //'T' represents the Object, and ID is the Primary key
   T create(T t);
    T read(ID id);
    T update(T t);
    boolean delete(ID id);


}
