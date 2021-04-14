package com.example.management.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table
public @Data
class Staff {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "staff_seq_gen")
    @SequenceGenerator(name = "staff_seq_gen", sequenceName = "staff_id_seq")
    public Long staffId;

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
    public byte photo;
}
