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
    private List<ContactGroup> contactGroups;

    public Contact(String id, String firstName, String lastName, String homeEmail, String workEmail, String nickName, String jobTitle, List<ContactGroup> contactGroups) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.homeEmail = homeEmail;
        this.workEmail = workEmail;
        this.nickName = nickName;
        this.jobTitle = jobTitle;
        this.contactGroups = contactGroups;
    }

    public String getId() {
        return id;
    }

    private void setId(String id) {
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

    public List<ContactGroup> getContactGroups() {
        return contactGroups;
    }

    public void setContactGroup(List<ContactGroup> contactGroups) {
        this.contactGroups = contactGroups;
    }
}