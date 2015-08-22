package com.app.persistence.model;

import com.app.rest.bean.UserDetails;
import com.app.util.bean.Dozer;

/**
 * Created by tarun-2215 on 22/8/15.
 */

public class UserModel implements Model{
    private Long userId ;
    private String mobile;
    private String email;
    private String password;
    private String gender;
    private String firstName;
    private String lastName;

    public UserModel() {
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public UserDetails generateResponse() {
        UserDetails ud = Dozer.convert(this,UserDetails.class);
        return ud;
    }

    public static UserModel generateModel(UserDetails ud) {
        UserModel um = Dozer.convert(ud,UserModel.class);
        return um;
    }
}

