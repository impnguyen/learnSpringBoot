package com.example.demo.student;

import java.util.List;
import com.example.demo.student.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Component
@Service
public class StudentService {

	@Autowired
	private final StudentRepository studentRepository;

	public StudentService(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	public List<Student> getStudents(){
		return studentRepository.findAll();
	}





}
