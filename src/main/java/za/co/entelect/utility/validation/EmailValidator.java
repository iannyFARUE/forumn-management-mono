package za.co.entelect.utility.validation;

import za.co.entelect.utility.validation.exception.InvalidEmailException;

import java.util.regex.Pattern;

public class EmailValidator {

    public static void patternMatches(String emailAddress) {
        boolean validEmail = Pattern.compile("^(.+)@(\\S+) $")
                .matcher(emailAddress)
                .matches();

        if(!validEmail){
            throw new InvalidEmailException(emailAddress + " is not a valid email");
        }
    }
}
