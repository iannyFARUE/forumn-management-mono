package za.co.entelect.security.impl;

import za.co.entelect.persistence.model.User;
import za.co.entelect.security.core.Authentication;

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
