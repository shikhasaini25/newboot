package com.school.cityschool.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.school.cityschool.model.Subject;

@Repository
public interface SubjectRepo extends CrudRepository<Subject, Integer>{
	
}
