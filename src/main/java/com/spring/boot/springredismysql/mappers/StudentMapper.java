package com.spring.boot.springredismysql.mappers;

import com.spring.boot.springredismysql.entities.Student;
import com.spring.boot.springredismysql.web.model.StudentDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(uses = {DateMapper.class})
public interface StudentMapper {
    StudentDto convertEntityToDto(Student student);
    Student convertDtoToEntity(StudentDto student);
    List<StudentDto> convertEntityToDto(Iterable<Student> students);
}
