package com.manjula.hibernate.manytoone.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import com.manjula.hibernate.manytoone.service.dto.EmployeeDTO;

import javax.persistence.*;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
@Table(name = "employee")
@Entity
public class Employee {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    private String id;
    private String name;
    @ManyToOne
    @JoinColumn(name="department_id")
    private Department department;

    public static Employee instance(String name, Department department) {
        return Employee.builder().name(name).department(department).build();
    }
    
    public EmployeeDTO toDto() {
        return EmployeeDTO.builder()
                .id(id)
                .name(name)
                .department(department.toDto()).build();
    }

}
