package za.co.entelect.security.impl;

public class EmailAndPasswordToken extends AbstractAuthenticationToken {
    private final Object credentials;
    private final Object principal;
    private String[] roles;

    public EmailAndPasswordToken(Object principal, Object credentials){
        super(null);
        this.credentials = credentials;
        this.principal = principal;
        setIsAuthenticated(false);
    }

    public EmailAndPasswordToken(Object principal, Object credentials, String[] roles){
        super(roles);
        this.credentials = credentials;
        this.principal = principal;
        super.setIsAuthenticated(true);
    }

    public static EmailAndPasswordToken authenticate(Object principal, Object credentials, String[] roles){
        return new EmailAndPasswordToken(principal,credentials,roles);
    }

    public static EmailAndPasswordToken unauthenticate(Object principal, Object credentials){
        return new EmailAndPasswordToken(principal,credentials);
    }



    @Override
    public Object getPrincipal() {
        return this.principal;
    }

    @Override
    public Object getCredentials() {
        return this.credentials;
    }

    @Override
    public void setIsAuthenticated(boolean isAuthenticated) throws IllegalArgumentException {
        super.setIsAuthenticated(false);
    }
}

