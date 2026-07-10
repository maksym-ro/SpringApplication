package com.uisav.springmvc.model;

import java.io.Serializable;

/**
 * @author maksym-ro on 07.07.2020.
 * @project SpringApplication
 */
public enum UserProfileType implements Serializable{
    USER("USER"),
    DBA("DBA"),
    ADMIN("ADMIN");

    String userProfileType;

    UserProfileType(String userProfileType){
        this.userProfileType = userProfileType;
    }

    public String getUserProfileType(){
        return userProfileType;
    }
}