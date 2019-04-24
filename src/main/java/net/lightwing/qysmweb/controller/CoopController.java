package net.lightwing.qysmweb.controller;

import net.lightwing.qysmweb.commons.Constant;
import net.lightwing.qysmweb.commons.PageBean;
import net.lightwing.qysmweb.pojo.MCoop;
import net.lightwing.qysmweb.service.MConfigService;
import net.lightwing.qysmweb.service.MCoopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CoopController {
    @Autowired
    private MConfigService configService;
    @Autowired
    private MCoopService service;

    @RequestMapping("coop.html")
    public String index(Model model, Integer pageindex) {
        model.addAttribute("config", configService.getConfig(Constant.CONFIGID));
        if (pageindex == null) {
            pageindex = 1;
        }
        List<MCoop> list = service.getList(pageindex, Constant.PAGESIZE);
        PageBean bean = new PageBean(pageindex, Constant.PAGESIZE, service.count(), list);
        model.addAttribute("pageData", bean);
        return "coop.html";
    }
}
