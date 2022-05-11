package com.sushangjin.springcloud.classes.controller;

import com.sushangjin.springcloud.classes.service.ClassService;
import com.sushangjin.springcloud.pojo.Classes;
import com.sushangjin.springcloud.pojo.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class ClassController {

    @Autowired
    private ClassService classService;

    @GetMapping("/consumer/classes/get/{id}")
    public CommonResult<Classes> getClassInfo(@PathVariable("id") Long id){
        CommonResult result = classService.queryById(id);
        return result;
    }

    @GetMapping("/consumer/Classes/list")
    public CommonResult<Classes> getClassesInfo(){
        CommonResult result = classService.list();
        return result;
    }

    @GetMapping("/consumer/Classes/delete/{id}")
    public CommonResult<Classes> delClassesInfo(@PathVariable("id") Long id){
        CommonResult result = classService.deleteByKey(id);
        return result;
    }

    @PostMapping("/consumer/Classes/add")
    public CommonResult<Classes> addClassesInfo(@RequestParam("cls") Classes cls){
        CommonResult result = classService.add(cls);
        return result;
    }


    @PostMapping("/consumer/Classes/update")
    public CommonResult<Classes> updateClassesInfo(@RequestParam("cls") Classes cls){
        CommonResult result = classService.update(cls);
        return result;
    }
}
