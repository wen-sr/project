package com.wensir.project.controller.wcs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/wcs/html")
public class WcsHtmlController {
    @RequestMapping(value = {"/configWcs", "/configWcs.html"}, method = RequestMethod.GET)
    public String zhupei() {
        return "wcs/configWcs";
    }
}
