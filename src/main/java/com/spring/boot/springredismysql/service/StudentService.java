package com.spring.boot.springredismysql.service;

import com.spring.boot.springredismysql.web.model.StudentDto;

import java.util.List;
import java.util.UUID;

public interface StudentService {
    StudentDto findById(UUID id);
    List<StudentDto> findAll();
    void save(StudentDto student);
}
