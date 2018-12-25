package com.mall.ums.admin.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.mall.ums.admin.service.IAdminService;

@Service
public class AdminServiceImpl implements IAdminService {
    @Override
    public String hello() {
        return "hello";
    }
}
