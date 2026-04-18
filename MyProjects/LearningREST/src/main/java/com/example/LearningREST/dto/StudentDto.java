package com.example.LearningREST.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StudentDto {
    private Long id;
    private String name;
    private String email;

    // these are all bs, just use @AllArgsConstructor from Lombok
    // public StudentDto(Long id, String name, String email) {
    // this.id = id;
    // this.name = name;
    // this.email = email;
    // }

    // these are all bs, just use @Data from Lombok
    // public StudentDto() {
    // }

    // public Long getId() {
    // return id;
    // }

    // public String getName() {
    // return name;
    // }

    // public String getEmail() {
    // return email;
    // }

}
