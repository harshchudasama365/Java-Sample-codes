package com.lti.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.dao.StudentRepository;
import com.lti.entity.Student;
import com.lti.exception.NoStudentFoundException;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository sRepo;
	
	@Transactional //spring framework's transactional
	@Override
	public Student createStudent(Student s) {
	
		return sRepo.save(s);
	}

	@Override
	public List<Student> listOfStudents() {
		// TODO Auto-generated method stub
		return sRepo.findAll();
	}

	@Override
	public Student findStudentById(int rollno) throws NoStudentFoundException {
		Optional<Student> sFind = sRepo.findById(rollno);
		Student stud = null;
		if(sFind.isPresent()) {
			stud =  sFind.get();
		}else {
			throw new NoStudentFoundException("Student not Found Exc called");
		}
		return stud;
	}

	@Transactional
	@Override
	public Student updateStudentById(int rollno, Student s) throws NoStudentFoundException {
		Optional<Student> sFind = sRepo.findById(rollno);
		Student stud = null;
		if(sFind.isPresent()) {
			stud =  sFind.get();
			sRepo.save(stud);
			
		}else {
			throw new NoStudentFoundException("Student not Found Exc called");
		}
		return s;
	}

	@Override
	public Student deleteStudentById(int rollno) throws NoStudentFoundException {
		Optional<Student> sFind = sRepo.findById(rollno);
		Student stud = null;
		if(sFind.isPresent()) {
			stud =  sFind.get();
			sRepo.delete(stud);
		
		}else {
			throw new NoStudentFoundException("Student not Found Exc called");
		}
		return stud;
	}

}
