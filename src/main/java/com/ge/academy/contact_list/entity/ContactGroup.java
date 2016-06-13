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

    public ContactGroup(String displayName) {
        this.displayName = displayName;
    }

    public ContactGroup(ContactGroup contactGroup) {
        this.displayName = contactGroup.getDisplayName();
        this.name = contactGroup.getName();
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContactGroup that = (ContactGroup) o;

        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        return displayName != null ? displayName.equals(that.displayName) : that.displayName == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (displayName != null ? displayName.hashCode() : 0);
        return result;
    }
}
