// This is our business layer in our n-tier architecture
package com.balun.sprintbootdemo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

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
        Optional<Student> studentOptional = studentRepository.findStudentByEmail(student.getEmail());
        if(studentOptional.isPresent()){
            throw new IllegalStateException("email taken homey");
        }
        studentRepository.save(student);
        System.out.println(student);
    }

    public static void deleteStudent(Long id) {
        boolean exists = studentRepository.existsById(studentId);
        if(!exists){
            throw new IllegalStateException("Student with student id " + studentId + " does not exist");
        studentRepository.deleteById(studentId);
        }
    }
}
