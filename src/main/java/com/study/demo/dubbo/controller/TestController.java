package com.study.demo.dubbo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.study.demo.dubbo.service.TestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Reference
    private TestService testService;

    @RequestMapping("/test")
    public String test(){
        testService.test();
        return "调用服务成功";
    }

}
