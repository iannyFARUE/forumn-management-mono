package za.co.entelect.impl;


import za.co.entelect.core.Authentication;
import za.co.entelect.persistence.model.User;

public  abstract  class AbstractAuthenticationToken implements Authentication {
    private boolean authentication = false;
    private final String[] roles;

    public AbstractAuthenticationToken(String[] roles){
        this.roles = roles;
    }

    @Override
    public String getName() {
        if(this.getPrincipal() instanceof User){
            return ((User)this.getPrincipal()).getEmail();
        }
        return (this.getPrincipal() == null) ? "":this.getPrincipal().toString();
    }

    @Override
    public boolean isAuthenticated() {
        return this.authentication;
    }

    @Override
    public void setIsAuthenticated(boolean isAuthenticated) {
        this.authentication = isAuthenticated;
    }
}
