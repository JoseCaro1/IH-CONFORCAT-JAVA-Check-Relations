package com.example.errors.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Faculty {

    @Id
    private String firstName;

    private String lastName;

    private String department;

    private boolean ternure;

    @ManyToOne
    private Office office;

    public Faculty() {
    }

    public Faculty(String firstName, String lastName, String department, boolean ternure, Office office) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.ternure = ternure;
        this.office = office;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public boolean isTernure() {
        return ternure;
    }

    public void setTernure(boolean ternure) {
        this.ternure = ternure;
    }

    public Office getOffice() {
        return office;
    }

    public void setOffice(Office office) {
        this.office = office;
    }

}
