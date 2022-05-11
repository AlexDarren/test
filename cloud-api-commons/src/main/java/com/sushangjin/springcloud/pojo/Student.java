package com.sushangjin.springcloud.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Serializable {

    private static final long serialVersionUID = 97048500280533485L;

    private Long id;

    private String name;

    private Integer sex;

    private Integer age;

    private Long class_id;
}
