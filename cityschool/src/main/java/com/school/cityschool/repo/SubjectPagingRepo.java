package com.school.cityschool.repo;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.school.cityschool.model.Subject;

public interface SubjectPagingRepo extends PagingAndSortingRepository<Subject, Integer>{

}
