package com.mall.web.admin.controller;

import com.mall.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("admin")
public class AdminController {

    @Autowired
    IAdminService adminService;

    @RequestMapping("hello")
    @ResponseBody
    public String hello(){
        return adminService.hello();
    }
}
