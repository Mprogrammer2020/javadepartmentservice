package com.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
