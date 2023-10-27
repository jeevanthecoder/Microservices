package com.user.user_service.entity;

import java.util.ArrayList;
import java.util.List;

public class User {
    private Long UserId;
    private String Name,Phonenumber;
    List<Contacts> contactsList = new ArrayList<>();

    public Long getUserId() {
        return UserId;
    }

    public void setUserId(Long userId) {
        UserId = userId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhonenumber() {
        return Phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        Phonenumber = phonenumber;
    }

    public List<Contacts> getContactsList() {
        return contactsList;
    }

    public void setContactsList(List<Contacts> contactsList) {
        this.contactsList = contactsList;
    }

    public User() {
    }

    public User(Long userId, String name, String phonenumber) {
        UserId = userId;
        Name = name;
        Phonenumber = phonenumber;
    }

    public User(Long userId, String name, String phonenumber, List<Contacts> contactsList) {
        UserId = userId;
        Name = name;
        Phonenumber = phonenumber;
        this.contactsList = contactsList;
    }
}
