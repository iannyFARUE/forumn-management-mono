package za.co.entelect.security.core;

public interface Authentication extends Principal {

    Object getPrincipal();

    boolean isAuthenticated();

    Object getCredentials();

    void setIsAuthenticated(boolean isAuthenticated);
}
