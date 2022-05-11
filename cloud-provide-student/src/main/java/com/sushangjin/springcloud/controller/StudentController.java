package com.sushangjin.springcloud.controller;

import com.sushangjin.springcloud.pojo.CommonResult;
import com.sushangjin.springcloud.pojo.Student;
import com.sushangjin.springcloud.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/stupro/list")
    public CommonResult list(){
        List<Student> students = studentService.listStudent();
        log.info("***************查询成功*********"+students);
        if(!CollectionUtils.isEmpty(students)){
            return new CommonResult(200,"查询成功"+ students.size(),students);
        }else{
            return new CommonResult(444,"查询失败",null);
        }
    }

    @GetMapping("/stupro/delete/{id}")
    public CommonResult deleteByKey(@PathVariable("id") Long id){
        try {
            studentService.deleteByKey(id);
            return new CommonResult(200, "删除成功");
        } catch (Exception e){
            return new CommonResult(444,"删除失败",null);
        }
    }

    @PostMapping("/stupro/add")
    public CommonResult addStudent(@RequestParam("stu") Student stu){
        try {
            studentService.addStudent(stu);
            return new CommonResult(200, "新增成功");
        } catch (Exception e){
            return new CommonResult(444,"新增失败",null);
        }
    }

    @PostMapping("/stupro/update")
    public CommonResult updateStudent(@RequestParam("stu") Student stu){
        try {
            studentService.updateSutdent(stu);
            return new CommonResult(200, "修改成功");
        } catch (Exception e){
            return new CommonResult(444,"修改失败",null);
        }
    }

}
