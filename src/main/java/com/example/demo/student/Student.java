package com.example.demo.student;

import java.time.LocalDate;

public class Student {
    private String name;
    private Long id;
    private LocalDate dob;
    private String email;
    private Integer age;

    public Student(){
        
    }
    public Student(String name, 
        String email, 
        LocalDate dob,
        Integer age){
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.age = age;
    }

    public Student(
        Long id,
        String name, 
        String email, 
        LocalDate dob,
        Integer age){
        
        this.id = id;
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}