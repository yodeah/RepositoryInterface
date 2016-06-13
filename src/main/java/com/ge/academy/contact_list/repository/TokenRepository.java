package com.ge.academy.contact_list.repository;

import com.ge.academy.contact_list.entity.Token;
import com.ge.academy.contact_list.entity.UserRole;

/**
 * Created by 212566307 on 6/13/2016.
 */
public interface TokenRepository {

    public Token save(Token token);
    public void delete(String tokenId);
    public Token findOne(String tokenId);
    public boolean isUserInRole(UserRole userRole);

}
