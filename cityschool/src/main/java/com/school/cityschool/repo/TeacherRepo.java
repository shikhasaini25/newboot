package com.school.cityschool.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.school.cityschool.model.Teacher;

@Repository
public interface TeacherRepo extends CrudRepository<Teacher, Integer>{

}
