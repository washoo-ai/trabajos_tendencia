package com.loxasoft.employeeservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepartamentDTO {
    private Integer id;
    private String name;
    private String code;

}
