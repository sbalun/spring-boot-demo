package com.balun.sprintbootdemo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student") // URL will be localhost:8090/api/v1/student
public class StudentController {
    @GetMapping()
    public List<Student> getStudents(){
        // when this is returned it will be in the form of a JSON object, an array of students
        return List.of(
                new Student(
                        1L,
                        "Scott Balun",
                        "sbalun@email.com",
                        LocalDate.of(1970,4,1),
                        53)
        );
    }
}
