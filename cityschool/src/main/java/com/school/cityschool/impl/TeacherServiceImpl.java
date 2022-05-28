package com.school.cityschool.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.school.cityschool.repo.TeacherRepo;
import com.school.cityschool.repo.TeacherRepoService;

public class TeacherServiceImpl implements TeacherRepoService{

	@Autowired
	TeacherRepo teacherRepo;
}
