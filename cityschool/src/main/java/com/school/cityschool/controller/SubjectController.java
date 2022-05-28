package com.school.cityschool.controller;
import java.net.URI;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.school.cityschool.impl.SubjectServiceImpl;
import com.school.cityschool.model.Student;
import com.school.cityschool.model.Subject;
import com.school.cityschool.repo.SubjectRepo;
import com.school.cityschool.repo.SubjectRepoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@Controller
public class SubjectController {
	
	@Autowired
	SubjectRepoService subjectRepoService;
	  
	  @RequestMapping(path = {"/allSubjects"}, headers="Content-Type=application/json", method = RequestMethod.GET)
		public ResponseEntity<Object> getUserById(HttpServletRequest request, HttpServletResponse response){
		
				return  new ResponseEntity<Object>(subjectRepoService.getAllSubjects(), HttpStatus.OK);
	  }

	  @RequestMapping(path = {"/allSubjectsByPage"}, headers="Content-Type=application/json", method = RequestMethod.GET)
	  public ResponseEntity<List<Subject>> getAllEmployees(
              @RequestParam(defaultValue = "0") Integer pageNo, 
              @RequestParam(defaultValue = "10") Integer pageSize,
              @RequestParam(defaultValue = "id") String sortBy) 
		{
		List<Subject> list = subjectRepoService.allSubjectsByPage(pageNo, pageSize, sortBy);
		
		return new ResponseEntity<List<Subject>>(list, new HttpHeaders(), HttpStatus.OK); 
		}
	  
	  @RequestMapping(path = {"/saveSubject"}, headers="Content-Type=application/json", method = RequestMethod.POST )
	  public ResponseEntity<Subject> saveSubject(HttpServletRequest request, HttpServletResponse response,@RequestBody Subject subject){
	
		return new ResponseEntity<Subject>(subjectRepoService.saveSubject(subject), HttpStatus.OK);
		  
	  }
	  
	  
	  @RequestMapping(path = {"subject/id"}, headers="Content-Type=application/json", method = RequestMethod.POST )
	  public ResponseEntity<Subject> saveSubject(HttpServletRequest request, HttpServletResponse response, @RequestParam Integer id){
		
		return new ResponseEntity<Subject>(subjectRepoService.getById(id), HttpStatus.OK);
		  
	  }
}
