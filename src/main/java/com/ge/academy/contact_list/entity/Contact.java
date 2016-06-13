package com.ge.academy.contact_list.entity;

import java.util.List;

public class Contact {
    private String id;
    private String firstName;
    private String lastName;
    private String homeEmail;
    private String workEmail;
    private String nickName;
    private String jobTitle;
    private ContactGroup contactGroup;

    public Contact() {
    }

    public Contact(String id, String firstName, String lastName, String homeEmail, String workEmail, String nickName, String jobTitle, ContactGroup contactGroup) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.homeEmail = homeEmail;
        this.workEmail = workEmail;
        this.nickName = nickName;
        this.jobTitle = jobTitle;
        this.contactGroup = contactGroup;
    }

    public Contact(Contact contact) {
        this.id = contact.id;
        this.firstName = contact.firstName;
        this.lastName = contact.lastName;
        this.homeEmail = contact.homeEmail;
        this.workEmail = contact.workEmail;
        this.nickName = contact.nickName;
        this.jobTitle = contact.jobTitle;
        this.contactGroup = contact.contactGroup;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getHomeEmail() {
        return homeEmail;
    }

    public void setHomeEmail(String homeEmail) {
        this.homeEmail = homeEmail;
    }

    public String getWorkEmail() {
        return workEmail;
    }

    public void setWorkEmail(String workEmail) {
        this.workEmail = workEmail;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public ContactGroup getContactGroup() {
        return contactGroup;
    }

    public void setContactGroup(ContactGroup contactGroup) {
        this.contactGroup = contactGroup;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Contact contact = (Contact) o;

        if (id != null ? !id.equals(contact.id) : contact.id != null) return false;
        if (firstName != null ? !firstName.equals(contact.firstName) : contact.firstName != null) return false;
        if (lastName != null ? !lastName.equals(contact.lastName) : contact.lastName != null) return false;
        if (homeEmail != null ? !homeEmail.equals(contact.homeEmail) : contact.homeEmail != null) return false;
        if (workEmail != null ? !workEmail.equals(contact.workEmail) : contact.workEmail != null) return false;
        if (nickName != null ? !nickName.equals(contact.nickName) : contact.nickName != null) return false;
        if (jobTitle != null ? !jobTitle.equals(contact.jobTitle) : contact.jobTitle != null) return false;
        return contactGroup != null ? contactGroup.equals(contact.contactGroup) : contact.contactGroup == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (homeEmail != null ? homeEmail.hashCode() : 0);
        result = 31 * result + (workEmail != null ? workEmail.hashCode() : 0);
        result = 31 * result + (nickName != null ? nickName.hashCode() : 0);
        result = 31 * result + (jobTitle != null ? jobTitle.hashCode() : 0);
        result = 31 * result + (contactGroup != null ? contactGroup.hashCode() : 0);
        return result;
    }
}