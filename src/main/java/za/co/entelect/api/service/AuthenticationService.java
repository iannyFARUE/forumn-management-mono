package za.co.entelect.api.service;

import za.co.entelect.security.core.Authentication;
import za.co.entelect.security.impl.AuthenticationProvider;
import za.co.entelect.security.impl.EmailAndPasswordToken;

import java.util.Scanner;

public class AuthenticationService {

    private final AuthenticationProvider authenticationProvider;

    private Scanner  scanner;
    public AuthenticationService(){
        authenticationProvider = new AuthenticationProvider();
        scanner = new Scanner(System.in);
    }


    public Authentication signin(){
        System.out.println("Enter email");
        String email = scanner.nextLine();

        System.out.println("Enter password");
        String password = scanner.nextLine();

        return authenticationProvider.authenticate(new EmailAndPasswordToken(email,password));
    }
}
