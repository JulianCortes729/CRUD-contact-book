package com.app.web.services;

import com.app.web.entities.Contact;

import java.util.List;
import java.util.Optional;

public interface ContactService {

    public List<Contact> findAllContacts();

    public void saveContact(Contact contact);

    public Optional<Contact> findByIdContact(Long id);

    public void updateContact(Contact contact);

    public void deleteContactById(Long id);



}
