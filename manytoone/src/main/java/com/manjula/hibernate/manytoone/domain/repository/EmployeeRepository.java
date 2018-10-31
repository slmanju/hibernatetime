package com.manjula.hibernate.manytoone.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.manjula.hibernate.manytoone.domain.model.Employee;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, String> {

    @Query("select employee from Employee employee join fetch employee.department")
    List<Employee> findAll();

}
