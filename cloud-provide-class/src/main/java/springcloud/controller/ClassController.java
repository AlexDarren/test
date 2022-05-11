package springcloud.controller;

import com.sushangjin.springcloud.pojo.Classes;
import com.sushangjin.springcloud.pojo.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import springcloud.service.ClassService;

@RestController
@Slf4j
public class ClassController {

    @Autowired
    ClassService classService;

    @GetMapping("/payment/get/{id}")
    public CommonResult queryById(@PathVariable("id") Long id){
        Classes classes = classService.queryById(id);
        log.info("***************查询成功*********"+classes);
        if(classes!=null){
            return new CommonResult(200,"查询成功"+classes.getId(),classes);
        }else{
            return new CommonResult(444,"查询失败",null);
        }
    }

}
