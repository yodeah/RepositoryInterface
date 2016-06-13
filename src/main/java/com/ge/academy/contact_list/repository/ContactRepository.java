package com.ge.academy.contact_list.repository;

import com.ge.academy.contact_list.entity.Contact;

import java.util.List;

/**
 * Created by 212564370 on 6/13/2016.
 */
public interface ContactRepository {
    Contact save(Contact user);
    void delete(String contactId);
    Contact findOne(String contactId);
    List<Contact> findAll();
    Contact findByExample(Contact contact);
}
