package com.sushangjin.springcloud.classes.controller;

import com.sushangjin.springcloud.classes.service.ClassService;
import com.sushangjin.springcloud.pojo.Classes;
import com.sushangjin.springcloud.pojo.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ClassController {

    @Autowired
    private ClassService classService;

    @GetMapping("/consumer/classes/get/{id}")
    public CommonResult<Classes> getPaymentById(@PathVariable("id") Long id){
        CommonResult result = classService.queryById(id);
        return result;
    }
}
