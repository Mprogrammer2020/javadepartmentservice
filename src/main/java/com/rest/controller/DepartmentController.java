package com.rest.controller;

import java.util.List;
import javax.validation.Valid;
import com.rest.entity.Department;
import com.rest.service.DepartmentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/department")
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping 
	public ResponseEntity<Department> add(@Valid @RequestBody Department department) throws Exception { 
		return new ResponseEntity<Department>(departmentService.add(department), HttpStatus.OK); 
	}
	
	@GetMapping("/{id}") 
	public ResponseEntity<Department> get(@PathVariable Long id) throws Exception { 
		return new ResponseEntity<Department>(departmentService.getById(id), HttpStatus.OK); 
	}
	
	@DeleteMapping("/{id}") 
	public ResponseEntity<Department> delete(@PathVariable Long id) throws Exception { 
		return new ResponseEntity<Department>(departmentService.deleteById(id), HttpStatus.OK); 
	}
	
	@GetMapping 
	public ResponseEntity<List<Department>> getAll() throws Exception { 
		return new ResponseEntity<List<Department>>(departmentService.getAll(), HttpStatus.OK); 
	}
}
