package com.spring.boot.springredismysql.web.controller;
import com.spring.boot.springredismysql.service.StudentService;
import com.spring.boot.springredismysql.web.model.StudentDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.UUID;

@RestController
@RequestMapping("/api/students")
@RequiredArgsConstructor
@Slf4j
public class StudentController {

    private final StudentService studentService;

    @GetMapping("/{id}")
    public ResponseEntity getStudentById(@PathVariable("id") UUID id){
        log.info("get info student by id");
        return new ResponseEntity<>(studentService.findById(id), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity getAll(){
        log.info("get all student");
        return new ResponseEntity<>(studentService.findAll(), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity save(@RequestBody StudentDto student){
        log.info("save student");
        studentService.save(student);
        return ResponseEntity.status(200).body("save success");
    }

}
