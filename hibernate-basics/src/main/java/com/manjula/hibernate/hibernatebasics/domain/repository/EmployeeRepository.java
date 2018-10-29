package com.manjula.hibernate.hibernatebasics.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manjula.hibernate.hibernatebasics.domain.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
