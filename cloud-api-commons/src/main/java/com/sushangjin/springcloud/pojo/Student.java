package com.sushangjin.springcloud.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    private Long id;

    private String name;

    private Integer sex;

    private Integer age;

    private Long class_id;
}
