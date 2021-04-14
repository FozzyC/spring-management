package com.example.management.repositories;

import com.example.management.models.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface StaffRepository extends JpaRepository<Staff, Long> {
    public Staff findByFirstName(String firstName);
    public List<Staff> findByLastName(String lastName);
}
