package za.co.entelect.security.core;

import za.co.entelect.security.core.exceptions.AuthenticationException;

public interface AuthenticationManager {
    Authentication authenticate(Authentication authentication) throws AuthenticationException;
}
