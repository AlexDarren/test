package com.sushangjin.springcloud.classes.service;

import com.sushangjin.springcloud.pojo.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@ComponentScan
@FeignClient(value ="mcroservice-pro-class")
public interface ClassService {

    @GetMapping("/clspro/get/{id}")
    public CommonResult queryById(@PathVariable("id") Long id);
}
