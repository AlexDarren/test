package com.sushangjin.springcloud.controller;

import com.sushangjin.springcloud.pojo.CommonResult;
import com.sushangjin.springcloud.pojo.Student;
import com.sushangjin.springcloud.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/stupro/get/{id}")
    public CommonResult queryById(@PathVariable("id") Long id){
        Student student = studentService.queryById(id);
        log.info("***************查询成功*********"+student);
        if(student!=null){
            return new CommonResult(200,"查询成功"+student.getId(),student);
        }else{
            return new CommonResult(444,"查询失败",null);
        }
    }

}
