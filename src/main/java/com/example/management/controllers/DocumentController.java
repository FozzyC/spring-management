package com.example.management.controllers;


import com.example.management.models.Document;
import com.example.management.models.Staff;
import com.example.management.repositories.DocumentRepository;
import com.example.management.repositories.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("document")
public class DocumentController {

    @Autowired
    private DocumentRepository repo;

    @GetMapping
    public List<Document> findAll() {
        return repo.findAll();
    }
    @GetMapping(value = "/{id}")
    public Optional<Document> findById(@PathVariable( "id" ) Long id) {
        return repo.findById(id);
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Document create(@RequestBody Document resource) {
        return repo.save(resource);
    }

    @PutMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void update(@PathVariable( "id" ) Long id, @RequestBody Document resource) {
        repo.save(resource);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id") Long id) {
        repo.deleteById(id);
    }
}
