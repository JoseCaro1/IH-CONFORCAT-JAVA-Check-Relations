package com.example.errors.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Faculty {

    @Id
    private String firstName;

    private String lastName;

    private String department;

    private boolean ternure;

    @ManyToMany
    @JoinTable(name = "faculty_office", joinColumns = {@JoinColumn(name = "faculty_id")}, inverseJoinColumns = {@JoinColumn(name = "office_id")})
    private List<Office> officeList;

    public Faculty() {
    }

    public Faculty(String firstName, String lastName, String department, boolean ternure, List<Office> office) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.ternure = ternure;
        this.officeList = office;
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

    public List<Office> getOfficeList() {
        return officeList;
    }

    public void setOfficeList(List<Office> officeList) {
        this.officeList = officeList;
    }
}
