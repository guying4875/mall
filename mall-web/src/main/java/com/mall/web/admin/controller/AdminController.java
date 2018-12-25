package com.mall.web.admin.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.mall.web.admin.service.IAdminService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("admin")
public class AdminController {

    @Reference
    IAdminService adminService;

    @RequestMapping("hello")
    @ResponseBody
    public String hello(){
        return adminService.hello();
    }
}
