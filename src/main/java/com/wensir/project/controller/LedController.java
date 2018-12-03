package com.wensir.project.controller;

import com.wensir.project.common.ServerResponse;
import com.wensir.project.service.ops.XiangKuLedService;
import com.wensir.project.service.prd1.BaoZhuangLedService;
import com.wensir.project.service.prd1.ShangJiaRKLedService;
import com.wensir.project.service.prd1.ZanCunRKLedService;
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

    @Autowired
    ZanCunRKLedService zanCunRKLedService;

    @Autowired
    XiangKuLedService xiangKuLedService;

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

    @RequestMapping(value = {"/tuopan4" }, method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse tuopan4(){
        ServerResponse response = zanCunRKLedService.getTuoPan4LedData();
        return response;
    }

    @RequestMapping(value = {"/xiangku" }, method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse xiangku(){
        ServerResponse response = xiangKuLedService.getXiangKuLedData();
        return response;
    }
}
