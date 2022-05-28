package com.school.cityschool.impl;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.hibernate.boot.model.source.spi.Sortable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;

import com.school.cityschool.model.Subject;
import com.school.cityschool.repo.SubjectPagingRepo;
import com.school.cityschool.repo.SubjectRepo;
import com.school.cityschool.repo.SubjectRepoService;


@Service
public class SubjectServiceImpl implements SubjectRepoService {

	@Autowired
	SubjectRepo subjectRepo;
	
	@Autowired
	SubjectRepoService hh;
	
	@Autowired
	SubjectPagingRepo subjectPagingRepo;
	
	@Override
	public Subject save(Subject subject) {		
		return (Subject) subjectRepo.save(subject);			
	}

	@Override
	public List<Subject> getAllSubjects() {
		
		List<Subject> subject = (List<Subject>) subjectRepo.findAll();
        
        if(subject.size() > 0) {
            return subject;
        } else {
            return new ArrayList<Subject>();
        }
	}

	@Override
	public List<Subject> allSubjectsByPage(Integer pageNo, Integer pageSize, String sortBy) {
		 
		        Pageable paging = PageRequest.of(pageNo, pageSize, Sort.by(sortBy).ascending());
		 
		        Page<Subject> pagedResult = subjectPagingRepo.findAll(paging);
		         
		        if(pagedResult.hasContent()) {
		            return pagedResult.getContent();
		        } else {
		            return new ArrayList<Subject>();
		        }
		    
	}

	@Override
	public Subject saveSubject(Subject subject) {
		
		return subjectRepo.save(subject);
	}

	@Override
	public Subject getById(Integer id) {
		return  hh.getById(id);
		 
	}
	
}
