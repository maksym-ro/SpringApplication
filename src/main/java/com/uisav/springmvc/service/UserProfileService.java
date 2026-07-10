package com.uisav.springmvc.service;

import java.util.List;
import com.uisav.springmvc.model.UserProfile;

/**
 * @author maksym-ro on 07.07.2020.
 * @project SpringApplication
 */
public interface UserProfileService {

    UserProfile findById(int id);

    UserProfile findByType(String type);

    List<UserProfile> findAll();
}