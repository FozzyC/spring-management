package com.example.management.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import javax.persistence.Id;

import javax.persistence.*;
import java.util.UUID;


@Entity
@Table
public @Data
class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "contact_seq_gen")
    @SequenceGenerator(name = "contact_seq_gen", sequenceName = "contact_id_seq")
    public Long contactId;

    @JsonBackReference("contactBackReference")
    public Client getClient() {
        return client;
    }

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;


    public String firstName;
    public String lastName;

    public String houseNoName;
    public String addressLine1;
    public String addressLine2;
    public String postcode;

    public String telephone;
    public String telephone2;
    public String email;
    public String relation;


}


