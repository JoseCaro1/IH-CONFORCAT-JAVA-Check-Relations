package com.example.errors.repositories;

import com.example.errors.models.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FacultyRepository extends JpaRepository<Faculty, String> {

    @Query("SELECT f FROM Faculty f WHERE lastName Like :lastName")
    List<Faculty> findAllFacultyByLastName(String lastName);
}
