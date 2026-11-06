package com.example.restapis.restapis.services.impl;

import com.example.restapis.restapis.dto.StudentDto;
import com.example.restapis.restapis.entity.Student;
import com.example.restapis.restapis.repository.StudentRepository;
import com.example.restapis.restapis.services.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<StudentDto> getAllStudents() {
        List<Student> students = studentRepository.findAll();
        return students.stream()
                                            .map(std -> new StudentDto(std.getId(), std.getName(), std.getEmail()))
                                            .toList();
    }
}
