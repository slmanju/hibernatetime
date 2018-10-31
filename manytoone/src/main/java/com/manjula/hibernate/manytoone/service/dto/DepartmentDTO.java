package com.manjula.hibernate.manytoone.service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class DepartmentDTO {

    private String id;
    private String name;

//    private Set<ManyToOneEmployeeDTO> employees = new HashSet<>();

}
