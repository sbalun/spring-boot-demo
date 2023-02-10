// This is our business layer in our n-tier architecture
package com.balun.sprintbootdemo.student;

import java.time.LocalDate;
import java.util.List;

public class StudentService {
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
