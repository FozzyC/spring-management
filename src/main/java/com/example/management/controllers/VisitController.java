package com.example.management.controllers;



import com.example.management.models.Visit;
import com.example.management.repositories.VisitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("visit")
public class VisitController {

    @Autowired
    private VisitRepository repo;

    @GetMapping
    public List<Visit> findAll() {
        return repo.findAll();
    }
    @GetMapping(value = "/{id}")
    public Optional<Visit> findById(@PathVariable( "id" ) Long id) {
        return repo.findById(id);
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Visit create(@RequestBody Visit resource) {
        return repo.save(resource);
    }

    @PutMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void update(@PathVariable( "id" ) Long id, @RequestBody Visit resource) {
        repo.save(resource);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id") Long id) {
        repo.deleteById(id);
    }
}
