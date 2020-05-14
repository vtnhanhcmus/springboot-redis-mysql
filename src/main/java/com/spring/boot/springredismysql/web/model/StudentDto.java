package com.spring.boot.springredismysql.web.model;

import lombok.*;

import java.io.Serializable;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentDto implements Serializable {

    private static final long serialVersionUID = 155701584267870918L;
    private UUID id;
    private String name;
    private Integer age;
}
