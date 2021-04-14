package com.example.management.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import org.hibernate.annotations.GeneratorType;
import javax.persistence.Id;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;


@Entity
@Table
public @Data class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "client_seq_gen")
    @SequenceGenerator(name = "client_seq_gen", sequenceName = "client_id_seq")
    public Long clientId;

    public boolean isActive;
    public Date onboardDate;

    public String firstName;
    public String lastName;

    public String houseNoName;
    public String addressLine1;
    public String addressLine2;
    public String postcode;

    public String telephone;
    public String dob;

    @JsonManagedReference
    public List<Contact> getContacts() {
        return contacts;
    }

    @OneToMany( cascade = CascadeType.ALL, mappedBy = "client" , fetch = FetchType.EAGER)
    public List<Contact> contacts = new ArrayList<>();


}