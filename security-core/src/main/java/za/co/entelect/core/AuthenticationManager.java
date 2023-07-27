package za.co.entelect.core;


import za.co.entelect.core.exceptions.AuthenticationException;

public interface AuthenticationManager {
    Authentication authenticate(Authentication authentication) throws AuthenticationException;
}
