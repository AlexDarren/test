package com.sushangjin.springcloud.service;

import com.sushangjin.springcloud.pojo.Student;

import java.util.List;

public interface StudentService {
    Student queryById(Long id);

    List<Student> listStudent();

    void deleteByKey(Long id);

    void addStudent(Student student);

    void updateSutdent(Student student) throws Exception;
}
