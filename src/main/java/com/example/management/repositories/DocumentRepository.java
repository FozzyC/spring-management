package com.example.management.repositories;

import com.example.management.models.Document;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DocumentRepository extends JpaRepository<Document, Long> {
    public List<Document> findByDocumentName(String documentName);
}
