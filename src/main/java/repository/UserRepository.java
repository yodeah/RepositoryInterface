package repository;

import entity.User;

/**
 * Created by 212393105 on 2016.06.13..
 */
public interface UserRepository {

    User save(User user);
    void delete(String userId);
    User findOne(String userId);
    User findAll();

}
