package com.mall.web.admin.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.mall.ums.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @Reference(version="1.0.0")
    IAdminService adminService;


    @GetMapping("hello")
    public String hello(){
        String s = adminService.hello();
        return s ;
    }
}
