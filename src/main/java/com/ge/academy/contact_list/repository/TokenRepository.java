package com.ge.academy.contact_list.repository;

import com.ge.academy.contact_list.entity.Token;
import com.ge.academy.contact_list.entity.UserRole;
import com.ge.academy.contact_list.exception.EntityNotFoundException;

/**
 * Created by 212566307 on 6/13/2016.
 */
public interface TokenRepository {

    public Token save(Token token) throws EntityNotFoundException;
    public void delete(String tokenId) throws EntityNotFoundException;
    public Token findOne(String tokenId) throws EntityNotFoundException;
    public boolean isUserInRole(UserRole userRole);

}
