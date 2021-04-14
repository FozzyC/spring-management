package com.example.management.repositories;

import java.util.List;

import com.example.management.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
    public Client findByFirstName(String firstName);
    public List<Client> findByLastName(String lastName);
}
