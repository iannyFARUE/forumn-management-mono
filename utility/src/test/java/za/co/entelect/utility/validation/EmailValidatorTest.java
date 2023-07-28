package za.co.entelect.utility.validation;

import org.junit.jupiter.api.Test;
import za.co.entelect.utility.validation.exception.InvalidEmailException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class EmailValidatorTest {

    @Test
    public void emailV1ValidTest(){
        String email = "test@test";
        EmailValidator.validateEmailV1(email);
    }

    @Test
    public void emailV1InvalidTest(){
        String email = "testtest";
        try {
            EmailValidator.validateEmailV1(email);
        } catch (InvalidEmailException e){
            assertEquals(email + " is not a valid email",e.getMessage());
        }
    }

    @Test
    public void emailV2InvalidTest(){
        String email = "test@test";
        EmailValidator.validateEmailV2(email);
    }

    @Test
    public void emailV2ValidTest(){
        String email = "test@test.com";
        EmailValidator.validateEmailV2(null);
    }

}
