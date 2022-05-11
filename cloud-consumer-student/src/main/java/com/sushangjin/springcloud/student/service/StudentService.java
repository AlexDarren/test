package com.sushangjin.springcloud.student.service;

import com.sushangjin.springcloud.pojo.CommonResult;
import com.sushangjin.springcloud.pojo.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@ComponentScan
@FeignClient(value ="mcroservice-pro-student")
public interface StudentService {

    @GetMapping("/stupro/get/{id}")
    public CommonResult queryById(@PathVariable("id") Long id);

    @GetMapping("/stupro/list")
    public CommonResult list();

    @GetMapping("/stupro/del/{id}")
    public CommonResult deleteByKey(@PathVariable("id") Long id);

    @PostMapping("/stupro/add")
    public CommonResult add(@RequestParam("stu") Student stu);

    @PostMapping("/stupro/update")
    public CommonResult update(@RequestParam("stu") Student stu);
}
