package com.sushangjin.springcloud.student.controller;

import com.sushangjin.springcloud.pojo.CommonResult;
import com.sushangjin.springcloud.pojo.Student;
import com.sushangjin.springcloud.student.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class StudentController {

    @Autowired
    private StudentService studentService;
    @GetMapping("/consumer/student/get/{id}")
    public CommonResult<Student> getPaymentById(@PathVariable("id") Long id){
        CommonResult result = studentService.queryById(id);
        return result;
    }

}
