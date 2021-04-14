package com.example.management.models;

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

    public byte documentData;
}
