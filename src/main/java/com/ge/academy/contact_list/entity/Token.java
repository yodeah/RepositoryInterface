package com.ge.academy.contact_list.entity;

import java.time.LocalDateTime;

/**
 * Created by 212566307 on 6/13/2016.
 */
public class Token {

    private String tokenId;
    private User user;
    private LocalDateTime expiresOn;
    private UserRole userRole;

    public void Token(String id, User user, UserRole userRole, LocalDateTime expiresOn){
        this.tokenId = id;
        this.user = user;
        this.userRole = userRole;
        this.expiresOn = expiresOn;
    }

    public String getTokenId(){
        return tokenId;
    }

    public User getUser() {
        return user;
    }

    public boolean isUserInRole(UserRole userRole){
        return this.userRole.equals(userRole);
    }

    public LocalDateTime getExpiresOn() {
        return expiresOn;
    }
}
