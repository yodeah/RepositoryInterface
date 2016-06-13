package com.ge.academy.contact_list.entity;

/**
 * Created by 212564370 on 6/13/2016.
 */
public class ContactGroupId {
    private String userName;
    private long contactGroupId;

    public ContactGroupId(String userName, long contactGroupId) {
        this.userName = userName;
        this.contactGroupId = contactGroupId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public long getContactGroupId() {
        return contactGroupId;
    }

    public void setContactGroupId(long contactGroupId) {
        this.contactGroupId = contactGroupId;
    }
}
