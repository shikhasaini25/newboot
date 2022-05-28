package com.school.cityschool.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.cityschool.model.Student;
import com.school.cityschool.repo.StudentRepo;
import com.school.cityschool.repo.StudentRepoService;

@Service
public class StudentServiceImpl implements StudentRepoService{

	@Autowired
	StudentRepo studentRepo;

	@Override
	public Student saveStudent(Student student) {
		return studentRepo.save(student);
	}
	

}
