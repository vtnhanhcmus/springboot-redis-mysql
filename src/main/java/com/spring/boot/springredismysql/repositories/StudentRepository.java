package com.spring.boot.springredismysql.repositories;

import com.spring.boot.springredismysql.entities.Student;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface StudentRepository extends PagingAndSortingRepository<Student, UUID> {
}
