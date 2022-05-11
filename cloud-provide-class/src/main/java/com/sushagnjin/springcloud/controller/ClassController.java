package com.sushagnjin.springcloud.controller;

import com.sushagnjin.springcloud.service.ClassService;
import com.sushangjin.springcloud.pojo.Classes;
import com.sushangjin.springcloud.pojo.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
public class ClassController {

    @Autowired
    ClassService classService;

    @GetMapping("/clspro/get/{id}")
    public CommonResult queryById(@PathVariable("id") Long id){
        Classes classes = classService.queryById(id);
        log.info("***************查询成功*********"+classes);
        if(classes!=null){
            return new CommonResult(200,"查询成功"+classes.getId(),classes);
        }else{
            return new CommonResult(444,"查询失败",null);
        }
    }

    @GetMapping("/clspro/list")
    public CommonResult list(){
        List<Classes> Classs = classService.listclass();
        log.info("***************查询成功*********"+Classs);
        if(!CollectionUtils.isEmpty(Classs)){
            return new CommonResult(200,"查询成功"+ Classs.size(),Classs);
        }else{
            return new CommonResult(444,"查询失败",null);
        }
    }

    @GetMapping("/clspro/delete/{id}")
    public CommonResult deleteByKey(@PathVariable("id") Long id){
        try {
            classService.deleteByKey(id);
            return new CommonResult(200, "删除成功");
        } catch (Exception e){
            return new CommonResult(444,"删除失败",null);
        }
    }

    @PostMapping("/clspro/add")
    public CommonResult addClass(@RequestParam("cls") Classes cls){
        try {
            classService.addClass(cls);
            return new CommonResult(200, "新增成功");
        } catch (Exception e){
            return new CommonResult(444,"新增失败",null);
        }
    }

    @PostMapping("/clspro/update")
    public CommonResult updateClass(@RequestParam("cls") Classes cls){
        try {
            classService.updateClass(cls);
            return new CommonResult(200, "修改成功");
        } catch (Exception e){
            return new CommonResult(444,"修改失败",null);
        }
    }
}
