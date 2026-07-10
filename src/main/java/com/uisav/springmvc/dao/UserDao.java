package com.uisav.springmvc.dao;

import java.util.List;
import com.uisav.springmvc.model.User;

/**
 * @author maksym-ro on 07.07.2020.
 * @project SpringApplication
 */
public interface UserDao {

    User findById(int id);

    User findBySSO(String sso);

    void save(User user);

    void deleteBySSO(String sso);

    List<User> findAllUsers();
}