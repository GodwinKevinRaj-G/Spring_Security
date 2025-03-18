package com.kevin.spring.security.model;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PersonDetails {
    private long id;
    private String name;
    private String designation;
}
