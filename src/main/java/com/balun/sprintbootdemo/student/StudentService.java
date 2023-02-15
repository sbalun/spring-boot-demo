// This is our business layer in our n-tier architecture
package com.balun.sprintbootdemo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// This annotation makes this class a string bean.  Could also use @Component but semantically service better
// this indicates this will be a service class
@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public void addNewStudent(Student student) {
        System.out.println(student);
    }
}
