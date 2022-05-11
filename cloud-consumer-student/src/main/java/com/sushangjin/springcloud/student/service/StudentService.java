package com.sushangjin.springcloud.student.service;

import com.sushangjin.springcloud.pojo.CommonResult;
import com.sushangjin.springcloud.pojo.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@ComponentScan
@FeignClient(value ="mcroservice-pro-student")
public interface StudentService {

    @GetMapping("/student/get/{id}")
    public CommonResult queryById(@PathVariable("id") Long id);
}
