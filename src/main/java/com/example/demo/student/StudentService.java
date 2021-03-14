package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
@Service
public class StudentService {
    public List<Student> getStudents(){
		return List.of(
			new Student(1L, "mani", "manhphuoc.nguyen@lew.de", LocalDate.of(1992, Month.JANUARY, 5), 21),
			new Student(1L, "mani", "manhlong.nguyen@lew.de", LocalDate.of(2000, Month.JANUARY, 5), 21)
		);
	}
}
