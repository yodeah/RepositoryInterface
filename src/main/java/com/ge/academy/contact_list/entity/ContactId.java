package com.ge.academy.contact_list.entity;

/**
 * Created by 212564370 on 6/13/2016.
 */
public class ContactId extends ContactGroupId {
    private long contactId;

    public long getContactId() {
        return contactId;
    }

    public void setContactId(long contactId) {
        this.contactId = contactId;
    }

    public ContactId() {
    }

    public ContactId(String userName, String contactGroupName, long contactId) {
        super(userName, contactGroupName);
        this.contactId = contactId;
    }

    public ContactId(String userName, String contactGroupName) {
        super(userName, contactGroupName);
        this.contactId = 0;
    }

    public ContactId(ContactId other) {
        this.contactId = other.getContactId();
        this.setContactGroupName(other.getContactGroupName());
        this.setUserName(other.getUserName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ContactId contactId1 = (ContactId) o;

        return contactId == contactId1.contactId;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (int) (contactId ^ (contactId >>> 32));
        return result;
    }
}
