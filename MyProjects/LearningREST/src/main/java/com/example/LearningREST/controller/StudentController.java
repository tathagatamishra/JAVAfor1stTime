package com.example.LearningREST.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.LearningREST.dto.StudentDto;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
// = @Controller + @ResponseBody = return json
public class StudentController {

    @GetMapping("/student")
    public StudentDto getStudent() {
        return new StudentDto(4L, "Mishra", "tatha@gmail.com");
    }

}
