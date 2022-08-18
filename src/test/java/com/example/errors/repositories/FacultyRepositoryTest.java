package com.example.errors.repositories;

import com.example.errors.models.Faculty;
import com.example.errors.models.Office;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

@SpringBootTest
public class FacultyRepositoryTest {


    @Autowired
    FacultyRepository facultyRepository;

    @Autowired
    OfficeRepository officeRepository;


    @BeforeEach
    void setUp() {
        Office office = officeRepository.save(new Office(100,"Ey"));
        facultyRepository.save(new Faculty("Jose","Caro","Department",false,office));
    }

    @AfterEach
    void tearDown() {

        facultyRepository.deleteAll();
        officeRepository.deleteAll();
    }


    @Test
    void checkQuery() {
        List<Faculty> facultyList= facultyRepository.findAllFacultyByLastName("Caro");

        assertEquals(1,facultyList.size());

    }
}