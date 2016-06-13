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

    public ContactId(String userName, long contactGroupId, long contactId) {
        super(userName, contactGroupId);
        this.contactId = contactId;
    }
}
