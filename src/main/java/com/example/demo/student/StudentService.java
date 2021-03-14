package com.example.demo.student;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import javax.transaction.Transactional;

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

	public void addNewStudent(Student student){
		Optional<Student> studentOptional = this.studentRepository.findByEmail(student.getEmail());

		if(studentOptional.isPresent()){
			throw new IllegalStateException("email taken");
		}

		this.studentRepository.save(student);
	}

	public void deleteStudent(Long studentId){
		boolean exists = this.studentRepository.existsById(studentId);
		
		if(!exists){
			throw new IllegalStateException("student with id " + studentId + " does not exists");
		}
		this.studentRepository.deleteById(studentId);
	}

	@Transactional
	public void updateStudent(
		Long studentId,
		String name,
		String email
	){

		Student student = this.studentRepository.findById(studentId)
			.orElseThrow(() -> new IllegalStateException(
				"student with id " + studentId + " does not exist. "
			));

			if(name != null && name.length() > 0 && 
				!Objects.equals(student.getName(), name)){
					student.setName(name);
			}

			if(email != null && email.length() > 0 &&
				!Objects.equals(student.getEmail(), email)){
					Optional<Student> optionalStudent = this.studentRepository.findByEmail(email);

					if(optionalStudent.isPresent()){
						throw new IllegalStateException("email taken");
					}

					student.setEmail(email);
			}

	}




}
