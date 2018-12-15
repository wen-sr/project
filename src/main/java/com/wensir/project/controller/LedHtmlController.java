package com.wensir.project.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@Slf4j
@RequestMapping("/page/led")
public class LedHtmlController {


    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {
        return "/test";
    }

    @RequestMapping(value = {"/zhupei", "/zhupei.html"}, method = RequestMethod.GET)
    public String zhupei() {
        return "led/zhupei";
    }

    @RequestMapping(value = {"/baozhuang", "/baozhuang.html"}, method = RequestMethod.GET)
    public String baozhuang() {
        return "led/baozhuang";
    }

    @RequestMapping(value = {"/tuopan4", "/tuopan4.html"}, method = RequestMethod.GET)
    public String tuopan4() {
        return "led/tuopan4";
    }

    @RequestMapping(value = {"/tuopan3", "/tuopan3.html"}, method = RequestMethod.GET)
    public String tuopan3() {
        return "led/tuopan3";
    }

    @RequestMapping(value = {"/jiaocai", "/jiaocai.html"}, method = RequestMethod.GET)
    public String jiaocai() {
        return "led/jiaocai";
    }

    @RequestMapping(value = {"/lushun", "/lushun.html"}, method = RequestMethod.GET)
    public String lushun() {
        return "led/lushun";
    }

    @RequestMapping(value = {"/xiangku", "/xiangku.html"}, method = RequestMethod.GET)
    public String xiangku() {
        return "led/xiangku";
    }
}
