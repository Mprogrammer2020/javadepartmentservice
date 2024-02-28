package com.rest.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rest.entity.Department;
import com.rest.repository.DepartmentRepository;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository repository;
	
	public Department add(Department department) {
		return repository.save(department);
	}
	
	public Department getById(Long id) {
		return repository.findById(id).orElse(null);
	}
	
	public Department deleteById(Long id) {
		Department department=getById(id);		
		if(department!=null) repository.delete(department);
		
		return department;
	}
	
	public List<Department> getAll() {
		return repository.findAll();
	}
}
