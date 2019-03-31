package net.lightwing.mediweb.controller;

import net.lightwing.mediweb.commons.Constant;
import net.lightwing.mediweb.service.MConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExpertController {
    @Autowired
    private MConfigService configService;

    @RequestMapping("expertList.html")
    public String index(Model model) {
        model.addAttribute("config", configService.getConfig(Constant.CONFIGID));
        model.addAttribute("config", configService.getConfig(Constant.CONFIGID));
        return "expertList.html";
    }

    @RequestMapping("expertDetails.html")
    public String expertDetails(Model model) {
        model.addAttribute("config", configService.getConfig(Constant.CONFIGID));
        model.addAttribute("config", configService.getConfig(Constant.CONFIGID));
        return "expertDetails.html";
    }
}
