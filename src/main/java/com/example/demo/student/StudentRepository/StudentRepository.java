package com.example.demo.student.StudentRepository;

import com.example.demo.student.Student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface StudentRepository extends JpaRepository<Student, Long> {
    
}
