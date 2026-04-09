package com.mycourses.courses;

import java.util.Arrays;
import java.util.List;

import org.springframework.we.bind.annotation.RestController;

@RestController
public class CourseController {
    
    public List<Course> retrieveAllCourses() {

        return Arrays.asList(
            new Course(1, "Java"),
            new Course(2, "AWS"),
            new Course(3, "React"),
            new Course(4, "SQL")
        );
    }
}
