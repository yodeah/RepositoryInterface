package com.ge.academy.contact_list.service;

import com.ge.academy.contact_list.entity.Token;
import com.ge.academy.contact_list.exception.AuthenticationFailedException;
import com.ge.academy.contact_list.exception.EntityNotFoundException;
import com.ge.academy.contact_list.exception.TokenExpiredException;

/**
 * Created by 212566307 on 6/14/2016.
 */
public interface AuthenticationService {

    public Token findTokenById(String tokenId) throws TokenExpiredException;
    public Token authenticate(String username, String password) throws AuthenticationFailedException;
    public Token logOut(String username) throws EntityNotFoundException;
}
