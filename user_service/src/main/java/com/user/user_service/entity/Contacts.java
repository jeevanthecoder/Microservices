package com.user.user_service.entity;

public class Contacts {
    private Long Cid;
    private String email,contactName;
    private Long userId;

    public Long getCid() {
        return Cid;
    }

    public void setCid(Long cid) {
        Cid = cid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Contacts() {
    }

    public Contacts(Long cid, String email, String contactName, Long userId) {
        Cid = cid;
        this.email = email;
        this.contactName = contactName;
        this.userId = userId;
    }
}
