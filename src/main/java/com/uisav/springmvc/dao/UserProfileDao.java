package com.uisav.springmvc.dao;

import java.util.List;
import com.uisav.springmvc.model.UserProfile;

/**
 * @author maksym-ro on 07.07.2020.
 * @project SpringApplication
 */
public interface UserProfileDao {

    List<UserProfile> findAll();

    UserProfile findByType(String type);

    UserProfile findById(int id);
}