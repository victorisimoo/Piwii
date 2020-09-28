/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.landivar.beans;

import java.util.Date;

/**
 *
 * @author victorisimo
 */
public class UserBean {
    
    //Parameters class
    private String username;
    private String name;
    private String lastname;
    private String password;
    private int rolUser; //Admin 0, normal 1
    private Date birth;
    private String mail;
    private String phone;
    private String pathPhoto;
    private int status; //active 1, inactive 0
    
    //Constructor class
    public UserBean(){}

    public UserBean(String username, String name, String lastname, String password, int rolUser, Date birth, String mail, String phone, String pathPhoto, int status) {
        this.username = username;
        this.name = name;
        this.lastname = lastname;
        this.password = password;
        this.rolUser = rolUser;
        this.birth = birth;
        this.mail = mail;
        this.phone = phone;
        this.pathPhoto = pathPhoto;
        this.status = status;
    }
    
    //Getters and setters
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRolUser() {
        return rolUser;
    }

    public void setRolUser(int rolUser) {
        this.rolUser = rolUser;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPathPhoto() {
        return pathPhoto;
    }

    public void setPathPhoto(String pathPhoto) {
        this.pathPhoto = pathPhoto;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return username + "|" + name + "|" + lastname + "|" + password + "|" + rolUser + "|" + birth + "|" + mail + "|" + phone + "|" + pathPhoto + "|" + status;
    }
    
    
}
