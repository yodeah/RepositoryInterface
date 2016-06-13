package com.ge.academy.contact_list.repository;

import com.ge.academy.contact_list.entity.User;

import java.util.List;

/**
 * Created by 212393105 on 2016.06.13..
 */
public interface UserRepository {

    User save(User user);
    void delete(String userId);
    User findOne(String userId);
    List<User> findAll();

}
