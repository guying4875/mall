package com.mall.ums.admin.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.mall.ums.service.IAdminService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service(version="1.0.0" )
public class AdminServiceImpl implements IAdminService {
    Logger logger = LoggerFactory.getLogger(AdminServiceImpl.class);
    @Override
    public String hello() {
        logger.error("provider run hello");
        return "hello";
    }
}
