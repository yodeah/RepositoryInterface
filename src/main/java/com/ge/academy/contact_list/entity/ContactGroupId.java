package com.ge.academy.contact_list.entity;

/**
 * Created by 212564370 on 6/13/2016.
 */
public class ContactGroupId {
    private String userName;
    private String contactGroupName;

    public ContactGroupId() {
    }

    public ContactGroupId(String userName, String name) {
        this.userName = userName;
        this.contactGroupName = name;
    }

    public ContactGroupId(ContactGroupId other){
        this.userName = other.getUserName();
        this.contactGroupName = other.getContactGroupName();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getContactGroupName() {
        return contactGroupName;
    }

    public void setContactGroupName(String contactGroupName) {
        this.contactGroupName = contactGroupName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContactGroupId that = (ContactGroupId) o;

        if (userName != null ? !userName.equals(that.userName) : that.userName != null) return false;
        return contactGroupName != null ? contactGroupName.equals(that.contactGroupName) : that.contactGroupName == null;

    }

    @Override
    public int hashCode() {
        int result = userName != null ? userName.hashCode() : 0;
        result = 31 * result + (contactGroupName != null ? contactGroupName.hashCode() : 0);
        return result;
    }
}
