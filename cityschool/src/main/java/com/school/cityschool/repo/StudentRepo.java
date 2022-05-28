package com.school.cityschool.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.school.cityschool.model.Student;

@Repository
public interface StudentRepo extends CrudRepository<Student, Integer> {

	
}
