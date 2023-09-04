package com.meds.springdemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> findAllStudents() {
        return List.of(
                new Student(
                        "Mohamed",
                        "Bouali",
                        LocalDate.now(),
                        "med@selmi.com",
                        28
                ),
                new Student(
                        "Ali",
                        "Ali",
                        LocalDate.now(),
                        "ali@ali.com",
                        34
                )
        );
    }
}
