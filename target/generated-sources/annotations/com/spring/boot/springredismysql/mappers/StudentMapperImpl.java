package com.spring.boot.springredismysql.mappers;

import com.spring.boot.springredismysql.entities.Student;
import com.spring.boot.springredismysql.entities.Student.StudentBuilder;
import com.spring.boot.springredismysql.web.model.StudentDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-05-12T22:18:51+0700",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 11.0.2 (Oracle Corporation)"
)
@Component
public class StudentMapperImpl implements StudentMapper {

    @Override
    public StudentDto convertEntityToDto(Student student) {
        if ( student == null ) {
            return null;
        }

        StudentDto studentDto = new StudentDto();

        studentDto.setId( student.getId() );
        studentDto.setName( student.getName() );
        studentDto.setAge( student.getAge() );

        return studentDto;
    }

    @Override
    public Student convertDtoToEntity(StudentDto student) {
        if ( student == null ) {
            return null;
        }

        StudentBuilder student1 = Student.builder();

        student1.id( student.getId() );
        student1.name( student.getName() );
        student1.age( student.getAge() );

        return student1.build();
    }

    @Override
    public List<StudentDto> convertEntityToDto(Iterable<Student> students) {
        if ( students == null ) {
            return null;
        }

        List<StudentDto> list = new ArrayList<StudentDto>();
        for ( Student student : students ) {
            list.add( convertEntityToDto( student ) );
        }

        return list;
    }
}
