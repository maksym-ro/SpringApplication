package com.uisav.springmvc.service;

import java.util.List;
import com.uisav.springmvc.model.UserProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.uisav.springmvc.dao.UserProfileDao;

/**
 * @author maksym-ro on 07.07.2020.
 * @project SpringApplication
 */
@Service("userProfileService")
@Transactional
public class UserProfileServiceImpl implements UserProfileService{

    @Autowired
    private UserProfileDao dao;
    public UserProfileServiceImpl() {}

    public UserProfile findById(int id) {
        return dao.findById(id);
    }

    public UserProfile findByType(String type){
        return dao.findByType(type);
    }

    public List<UserProfile> findAll() {
        return dao.findAll();
    }
}