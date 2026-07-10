package com.uisav.springmvc.service;

import java.util.List;
import com.uisav.springmvc.model.User;

/**
 * @author maksym-ro on 07.07.2020.
 * @project SpringApplication
 */
public interface UserService {

    User findById(int id);

    User findBySSO(String sso);

    void saveUser(User user);

    void updateUser(User user);

    void deleteUserBySSO(String sso);

    List<User> findAllUsers();

    boolean isUserSSOUnique(Integer id, String sso);
}