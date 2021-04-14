package com.example.management.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Entity
@Table
public @Data class Visit {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "visit_seq_gen")
    @SequenceGenerator(name = "visit_seq_gen", sequenceName = "visit_id_seq")
    public Long visitId;
    @ManyToOne
    @JoinColumn(name = "staff_id")
    public Staff staffMember;

    @JsonBackReference
    public Staff getStaffMember() {
        return staffMember;
    }
    @JsonBackReference("visitBackReference")
    public Client getClient() {
        return client;
    }

    @ManyToOne
    @JoinColumn(name = "client_id")
    public Client client;

    public LocalDate visitDate;
    public LocalTime visitTimeIn;
    public LocalTime visitTimeOut;

    public String notes;




}