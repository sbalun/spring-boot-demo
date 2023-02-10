// This class handles the API layer in our n-tier architecture
package com.balun.sprintbootdemo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student") // URL will be localhost:8090/api/v1/student
public class StudentController {

    private final StudentService studentService;
    @Autowired // This annotation magically instantiates StudentService into this constructor
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @GetMapping()
    public List<Student> getStudents(){
        return studentService.getStudents();
    }
}
