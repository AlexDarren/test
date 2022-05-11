package com.sushangjin.springcloud.student.controller;

import com.sushangjin.springcloud.pojo.CommonResult;
import com.sushangjin.springcloud.pojo.Student;
import com.sushangjin.springcloud.student.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/consumer/student/get/{id}")
    public CommonResult<Student> getStudentInfo(@PathVariable("id") Long id){
        CommonResult result = studentService.queryById(id);
        return result;
    }

    @GetMapping("/consumer/student/list")
    public CommonResult<Student> getStudentInfo(){
        CommonResult result = studentService.list();
        return result;
    }

    @GetMapping("/consumer/student/delete/{id}")
    public CommonResult<Student> delStudentInfo(@PathVariable("id") Long id){
        CommonResult result = studentService.deleteByKey(id);
        return result;
    }

    @PostMapping("/consumer/student/add")
    public CommonResult<Student> addStudentInfo(@RequestParam("stu") Student stu){
        CommonResult result = studentService.add(stu);
        return result;
    }


    @PostMapping("/consumer/student/update")
    public CommonResult<Student> updateStudentInfo(@RequestParam("stu") Student stu){
        CommonResult result = studentService.update(stu);
        return result;
    }
}
