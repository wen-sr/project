package com.wensir.project.controller;

import com.wensir.project.common.ServerResponse;
import com.wensir.project.service.prd1.BaoZhuangLedService;
import com.wensir.project.service.wes.ZhuPeiLedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/led")
public class LedController {

    @Autowired
    ZhuPeiLedService zhuPeiLedService;

    @Autowired
    BaoZhuangLedService baoZhuangLedService;

    @RequestMapping(value = {"/zhupei" }, method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse zhupei(){
        ServerResponse response = zhuPeiLedService.getZhuPeiLedData();
        return response;
    }

    @RequestMapping(value = {"/baozhuang" }, method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse baozhuang(){
        ServerResponse response = baoZhuangLedService.getBaoZhuangLedData();
        return response;
    }
}
