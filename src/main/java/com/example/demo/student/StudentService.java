package com.example.demo.student;

import java.util.List;
import com.example.demo.student.StudentRepository.StudentRepository;
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

		// return List.of(
		// 	new Student(1L, "mani", "manhphuoc.nguyen@lew.de", LocalDate.of(1992, Month.JANUARY, 5), 21),
		// 	new Student(1L, "mani", "manhlong.nguyen@lew.de", LocalDate.of(2000, Month.JANUARY, 5), 21)
		// );
	}





}
