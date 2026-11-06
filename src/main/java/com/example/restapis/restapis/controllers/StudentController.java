package com.example.restapis.restapis.controllers;

import com.example.restapis.restapis.dto.StudentDto;
import com.example.restapis.restapis.services.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public List<StudentDto> getStudent() {
        return studentService.getAllStudents();
    }

    @GetMapping("/students/{id}")
    public StudentDto getStudentById() {
        return new StudentDto(1L, "Dikshant Sharma", "dikshantsharma2005@gmail.com");
    }
}
