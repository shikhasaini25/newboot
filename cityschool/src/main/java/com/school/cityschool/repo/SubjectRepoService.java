package com.school.cityschool.repo;


import java.util.List;

import org.springframework.stereotype.Service;

import org.springframework.util.MultiValueMap;

import com.school.cityschool.model.Subject;

public interface SubjectRepoService {

	public Subject save(Subject subject);

	public List<Subject> getAllSubjects();

	public List<Subject> allSubjectsByPage(Integer pageNo, Integer pageSize, String sortBy);

	public Subject saveSubject(Subject subject);

	public Subject getById(Integer id);



}
