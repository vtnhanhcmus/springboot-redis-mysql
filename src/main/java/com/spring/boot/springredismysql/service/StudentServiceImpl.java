package com.spring.boot.springredismysql.service;

import com.spring.boot.springredismysql.mappers.StudentMapper;
import com.spring.boot.springredismysql.repositories.StudentRepository;
import com.spring.boot.springredismysql.web.model.StudentDto;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    private final StudentMapper studentMapper;

    @Override
    @Cacheable(cacheNames = "students" , key = "#id")
    public StudentDto findById(UUID id) {
        return studentMapper.convertEntityToDto(studentRepository.findById(id).orElseThrow(RuntimeException::new));
    }

    @Override
    @Cacheable(cacheNames = "students")
    public List<StudentDto> findAll() {
        return studentMapper.convertEntityToDto(studentRepository.findAll());
    }

    @Override
    @CachePut(cacheNames = "students", key = "#student.id")
    public void save(StudentDto student) {
        studentRepository.save(studentMapper.convertDtoToEntity(student));
    }
}
