package com.manjula.hibernate.manytoone.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manjula.hibernate.manytoone.domain.model.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, String> {
	
}
