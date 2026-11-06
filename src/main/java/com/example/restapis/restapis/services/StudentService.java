package com.example.restapis.restapis.services;

import com.example.restapis.restapis.dto.StudentDto;

import java.util.List;

public interface StudentService {
    List<StudentDto> getAllStudents();
}
