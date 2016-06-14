package com.ge.academy.contact_list.entity;

/**
 * Created by 212564432 on 6/13/2016.
 */
public class ContactGroup {
    private ContactGroupId id;
    private String displayName;

    public ContactGroup() {
    }

    public ContactGroup(String displayName, ContactGroupId id) {
        this.displayName = displayName;
        this.id = id;
    }

    public ContactGroup(ContactGroup contactGroup) {
        this.displayName = contactGroup.getDisplayName();
        this.id = new ContactGroupId(contactGroup.getId());
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getName() {
        return id.getContactGroupName();
    }

    public ContactGroupId getId() {
        return id;
    }

    public void setId(ContactGroupId id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ContactGroup{" +
                "name= " + id.getContactGroupName() +
                ", displayName= " + displayName +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContactGroup that = (ContactGroup) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        return displayName != null ? displayName.equals(that.displayName) : that.displayName == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (displayName != null ? displayName.hashCode() : 0);
        return result;
    }
}
