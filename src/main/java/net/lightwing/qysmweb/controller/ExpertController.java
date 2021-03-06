package net.lightwing.qysmweb.controller;

import net.lightwing.qysmweb.commons.Constant;
import net.lightwing.qysmweb.commons.HtmlToText;
import net.lightwing.qysmweb.commons.PageBean;
import net.lightwing.qysmweb.pojo.MDoctor;
import net.lightwing.qysmweb.service.MConfigService;
import net.lightwing.qysmweb.service.MDoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ExpertController {
    @Autowired
    private MConfigService configService;

    @Autowired
    private MDoctorService service;

    @RequestMapping("expertList.html")
    public String index(Model model, Integer pageindex) {
        if (pageindex == null) {
            pageindex = 1;
        }
        model.addAttribute("config", configService.getConfig(Constant.CONFIGID));
        model.addAttribute("config", configService.getConfig(Constant.CONFIGID));
        List<MDoctor> list = service.getList(pageindex, Constant.PAGESIZE);

        //过滤html标签信息
        for (MDoctor item : list) {
            item.setDdesc(HtmlToText.Html2Text(item.getDdesc()));

        }
        PageBean bean = new PageBean(pageindex, Constant.PAGESIZE, service.count(), list);
        model.addAttribute("pageData", bean);
        return "expertList.html";
    }

    @RequestMapping("expertDetails.html")
    public String expertDetails(Model model, Integer did) {
        model.addAttribute("config", configService.getConfig(Constant.CONFIGID));
        model.addAttribute("config", configService.getConfig(Constant.CONFIGID));
        MDoctor mDoctor = service.selectById(did);
        model.addAttribute("mDoctor", mDoctor);
        return "expertDetails.html";
    }
}
