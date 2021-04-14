package com.example.management.repositories;

import com.example.management.models.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ContactRepository extends JpaRepository<Contact, Long> {
    public Contact findByFirstName(String firstName);
    public List<Contact> findByLastName(String lastName);
}
