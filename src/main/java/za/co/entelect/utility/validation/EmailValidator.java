package za.co.entelect.utility.validation;

import za.co.entelect.utility.validation.exception.InvalidEmailException;

import java.util.regex.Pattern;

public class EmailValidator {

    public static void validateEmailV1(String emailAddress) {
        boolean validEmail = Pattern.compile("^(.+)@(\\S+)$")
                .matcher(emailAddress)
                .matches();

        if(!validEmail){
            throw new InvalidEmailException(emailAddress + " is not a valid email");
        }
    }

    public static void validateEmailV2(String emailAddress) {
        boolean validEmail = Pattern.compile("^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
                        + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$")
                .matcher(emailAddress)
                .matches();

        if(!validEmail){
            throw new InvalidEmailException(emailAddress + " is not a valid email");
        }
    }
}
