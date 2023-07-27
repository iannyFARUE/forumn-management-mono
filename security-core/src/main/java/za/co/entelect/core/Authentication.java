package za.co.entelect.core;

public interface Authentication extends Principal {

    Object getPrincipal();

    boolean isAuthenticated();

    Object getCredentials();

    void setIsAuthenticated(boolean isAuthenticated);
}
