package com.ge.academy.contact_list.repository;

import com.ge.academy.contact_list.entity.ContactGroup;
import com.ge.academy.contact_list.entity.ContactGroupId;
import com.ge.academy.contact_list.entity.ContactId;
import com.ge.academy.contact_list.exception.EntityNotFoundException;

import java.util.List;

/**
 * Created by 212564432 on 6/13/2016.
 */
public interface ContactGroupRepository {
    ContactGroup save(ContactGroup contactGroup) throws EntityNotFoundException;
    void delete(ContactGroupId contactId) throws EntityNotFoundException;
    ContactGroup findOne(ContactGroupId contactId) throws EntityNotFoundException;
    List<ContactGroup> findAll();
    List<ContactGroup> findByOwner(String userName);
}
