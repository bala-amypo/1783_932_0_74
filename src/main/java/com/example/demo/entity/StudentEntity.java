package com.example.demo.entity;

import jakarta.persistence.Entity;


@Entity
public class StudentEntity{
    private Long id;
    private string name;
    private string email;
    private string password;
    private float cgpa;

    public StudentEntity(int id,String name,String email, double cgpa){
        this.id = id;
        this.name = name;
        this.email = email;
        this.cgpa = cgpa;
    }

    public StudentEntity(){

    }

    
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }



    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public double getCgpa() {
        return cgpa;
    }

    
}