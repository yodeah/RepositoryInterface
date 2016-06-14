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

    public Token(String id, User user, UserRole userRole, LocalDateTime expiresOn){
        this.tokenId = id;
        this.user = user;
        this.userRole = userRole;
        this.expiresOn = expiresOn;
    }

    public Token(Token token) {
        this.tokenId = token.tokenId;
        this.user = token.user;
        this.userRole = token.userRole;
        this.expiresOn = token.expiresOn;
    }

    public Token(Token token, String tokenId) {
        this.tokenId = tokenId;
        this.user = token.user;
        this.userRole = token.userRole;
        this.expiresOn = token.expiresOn;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Token)) return false;

        Token token = (Token) o;

        if (tokenId != null ? !tokenId.equals(token.tokenId) : token.tokenId != null) return false;
        if (user != null ? !user.equals(token.user) : token.user != null) return false;
        if (expiresOn != null ? !expiresOn.equals(token.expiresOn) : token.expiresOn != null) return false;
        return userRole == token.userRole;

    }

    @Override
    public int hashCode() {
        int result = tokenId != null ? tokenId.hashCode() : 0;
        result = 31 * result + (user != null ? user.hashCode() : 0);
        result = 31 * result + (expiresOn != null ? expiresOn.hashCode() : 0);
        result = 31 * result + (userRole != null ? userRole.hashCode() : 0);
        return result;
    }

}
