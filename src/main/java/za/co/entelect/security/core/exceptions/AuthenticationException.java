package za.co.entelect.security.core.exceptions;

public class AuthenticationException extends RuntimeException{

    public AuthenticationException(String msg){
        super(msg);
    }

    public AuthenticationException(String msg, Throwable cause){
        super(msg,cause);
    }
}
