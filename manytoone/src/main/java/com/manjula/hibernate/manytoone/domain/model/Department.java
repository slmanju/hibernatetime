package com.manjula.hibernate.manytoone.domain.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.manjula.hibernate.manytoone.service.dto.DepartmentDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
@Table(name = "department")
@Entity
public class Department {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    private String id;
    private String name;

//    @OneToMany(mappedBy="department")
//    private Set<ManyToOneEmployee> employees = new HashSet<>();

    public static Department instance(String name) {
        return Department.builder().name(name).build();
    }
    
    public DepartmentDTO toDto() {
        return DepartmentDTO.builder()
                .id(id)
                .name(name)
                .build();
    }

}
