package com.endava.qmanager.domain.model;

import org.springframework.security.core.GrantedAuthority;


public enum Role implements GrantedAuthority {

    ROLE_ADMINISTRATOR, ROLE_USER;

    @Override
    public String getAuthority() {
        return this.name();
    }
}

