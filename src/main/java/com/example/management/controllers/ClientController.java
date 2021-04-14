package com.example.management.controllers;

import java.util.List;
import java.util.Optional;


import com.example.management.models.Client;
import com.example.management.repositories.ClientRepository;

import com.example.management.repositories.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("clients")
public class ClientController {

    @Autowired
    private ClientRepository repo;

    @Autowired
    ContactRepository contactRepository;

    @GetMapping(path = "/createtest")
    public Client  createTestClient(){
        Client resource = new Client();
        resource.firstName = "Test Client";
        resource.lastName = "LN";
        return repo.save(resource);

    };

    @GetMapping
    public List<Client> findAll() {
        return repo.findAll();
    }
    @GetMapping(value = "/{id}")
    public Optional<Client> findById(@PathVariable( "id" ) Long id) {
        return repo.findById(id);
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Client create(@RequestBody Client resource) {
//        for (Contact i : resource.contacts) {
//            i.setContactId(""); /* give each a unique id sp frontend can identify them */
//        }
//        contactRepository.saveAll(resource.contacts); //No client ID yet! :(
        //resource.setContacts(resource.contacts);
        return repo.save(resource);
    }

    @PutMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void update(@PathVariable( "id" ) Long id, @RequestBody Client resource) {
        repo.save(resource);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id") Long id) {
        repo.deleteById(id);
    }
}