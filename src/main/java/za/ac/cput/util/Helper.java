package za.ac.cput.util;

import org.apache.commons.validator.routines.EmailValidator;

import java.util.UUID;

public class Helper {

    public static boolean isEmpty(String s) {
        return (s.isEmpty());
    }

   /* public static boolean isValidEmail(String valid){
        EmailValidator ev = EmailValidator.getInstance();
        return ev.isValid(valid);
    }*/

    public static String generateID(){
        return UUID.randomUUID().toString();
    }
}


