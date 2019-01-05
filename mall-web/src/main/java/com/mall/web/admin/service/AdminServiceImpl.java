package com.mall.web.admin.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.mall.ums.service.IAdminService;

public class AdminServiceImpl  {

//    @Reference(check = true)
    public IAdminService adminService;

    public String hello() {
        return adminService.hello();
    }
}
