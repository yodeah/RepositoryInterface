package com.ge.academy.contact_list.entity;

/**
 * Created by 212564432 on 6/13/2016.
 */
public class ContactGroup {
    private String name;
    private String displayName;

    public ContactGroup() {
    }

    public ContactGroup(String displayName, String name) {
        this.displayName = displayName;
        this.name = name;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ContactGroup{" +
                "name= " + name +
                ", displayName= " + displayName +
                '}';
    }
}
