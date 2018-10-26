package com.wensir.project.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@Slf4j
public class HtmlController {


    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {
        log.info("=====");
        return "/test";
    }

}
