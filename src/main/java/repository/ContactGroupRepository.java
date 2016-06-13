package repository;

import entity.ContactGroup;

import java.util.List;

/**
 * Created by 212564432 on 6/13/2016.
 */
public interface ContactGroupRepository {

    ContactGroup save(ContactGroup contactGroup);

    void delete(String contactId);

    ContactGroup findOne(String contactId);

    List<ContactGroup> findAll();
}
