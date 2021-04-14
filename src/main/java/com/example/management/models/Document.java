package com.example.management.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;

import java.util.Date;

@Entity
@Table
public @Data
class Document {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "document_seq_gen")
    @SequenceGenerator(name = "document_seq_gen", sequenceName = "document_id_seq")
    public Long documentId;

    public String documentName;
    public String documentCategory;
    public Date documentCreatedDate;
    public int documentVersion;
    public String documentExtension;

    // Allow documents to be associated to specific individuals
    @ManyToOne
    @JoinColumn(name = "client_id")
    public Client clientAssociation;

    @JsonBackReference("clientDocumentBackReference")
    public Client getClientAssociation() {
        return clientAssociation;
    }
    @JsonBackReference("staffDocumentBackReference")
    public Staff getStaffAssociation() {
        return staffAssociation;
    }

    @ManyToOne
    @JoinColumn(name = "staff_id")
    public Staff staffAssociation;

    public byte documentData;
}
