package com.app.web.services;

import com.app.web.entities.Contact;
import com.app.web.repositories.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactServiceImpl implements ContactService{

    @Autowired
    private ContactRepository repository;

    @Override
    public List<Contact> findAllContacts() {
        return repository.findAll();
    }

    @Override
    public void saveContact(Contact contact) {
        repository.save(contact);
    }

    @Override
    public Optional<Contact> findByIdContact(Long id){
        return repository.findById(id);
    }

    @Override
    public void updateContact(Contact contact) {

       repository.save(contact);

    }

    @Override
    public void deleteContactById(Long id) {
        repository.deleteById(id);
    }

}
