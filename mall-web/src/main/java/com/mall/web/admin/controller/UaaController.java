package com.mall.web.admin.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("esb")
public class UaaController {

    @RequestMapping("updteUser")
    public String updateUser(){
        JSONObject json = new JSONObject();
        json.put("result_code","01");
        return json.toJSONString();
    }
}
