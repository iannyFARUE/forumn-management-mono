package za.co.entelect.impl;

import za.co.entelect.core.Authentication;
import za.co.entelect.core.Principal;
import za.co.entelect.core.exceptions.AuthenticationException;
import za.co.entelect.persistence.model.User;
import za.co.entelect.persistence.repository.UserRepository;
import za.co.entelect.core.AuthenticationManager;

public class AuthenticationProvider implements AuthenticationManager {

    private final UserRepository userRepository;

    public AuthenticationProvider(){
        userRepository = new UserRepository();
    }


    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String email = null;
        email = getEmail(authentication);
        String password = authentication.getCredentials().toString();

        User user = userRepository.findByEmail(email).orElse(null);
        System.out.println("User found "+user);
        if(user == null || !user.getPassword().equals(password)){
            throw new AuthenticationException("Bad credentials");
        }
        return EmailAndPasswordToken.authenticate(email,authentication.getCredentials(),new String[]{"ADMIN"});
    }

    private static String getEmail(Authentication authentication) {
        if(authentication.getCredentials() instanceof Principal){
            return ((Principal) authentication.getCredentials()).getName();
        }

        if(authentication.getCredentials() instanceof User){
            return ((User) authentication.getCredentials()).getEmail();
        }
        return (authentication.getPrincipal() == null) ? "":authentication.getPrincipal().toString();
    }


}
