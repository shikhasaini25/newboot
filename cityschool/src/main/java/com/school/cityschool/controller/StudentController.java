package com.school.cityschool.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.school.cityschool.model.Student;
import com.school.cityschool.repo.StudentRepo;
import com.school.cityschool.repo.StudentRepoService;

@Controller
public class StudentController {
	
	 @Autowired
	 StudentRepoService studentRepoService;
	 
		
		  @RequestMapping(path = {"/saveStudent"},headers="Content-Type=application/json", method = RequestMethod.POST)
		  public ResponseEntity<Student> getUserById(HttpServletRequest request, HttpServletResponse response, @RequestBody Student student){
			
		  return new ResponseEntity<Student>(studentRepoService.saveStudent(student), HttpStatus.OK);
		  }
		 

}
