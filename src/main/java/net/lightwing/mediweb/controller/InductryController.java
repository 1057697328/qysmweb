package net.lightwing.mediweb.controller;

import net.lightwing.mediweb.commons.Constant;
import net.lightwing.mediweb.commons.PageBean;
import net.lightwing.mediweb.pojo.MCoop;
import net.lightwing.mediweb.pojo.MInductry;
import net.lightwing.mediweb.pojo.MInductryinfo;
import net.lightwing.mediweb.pojo.MProject;
import net.lightwing.mediweb.service.MConfigService;
import net.lightwing.mediweb.service.MCoopService;
import net.lightwing.mediweb.service.MInductryInfoService;
import net.lightwing.mediweb.service.MInductryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class InductryController {

    @Autowired
    private MConfigService configService;

    @Autowired
    private MInductryService mInductryService;

    @Autowired
    private MInductryInfoService mInductryInfoService;

    @RequestMapping("inductry.html")
    public String index(Model model, Integer pageindex, Integer iid) {
        model.addAttribute("config", configService.getConfig(Constant.CONFIGID));
        if (pageindex == null) {
            pageindex = 1;
        }
        List<MInductry> list = mInductryService.getList(pageindex, Constant.PAGESIZE);
        PageBean bean = new PageBean(pageindex, Constant.PAGESIZE, mInductryInfoService.count(), list);
        if (iid != null) {
            List<MInductryinfo> mInductryInfo = mInductryInfoService.selectByIid(iid);
            model.addAttribute("mInductryInfoList", mInductryInfo);
        } else {
            model.addAttribute("mInductryInfoList", null);
        }
        model.addAttribute("pageData", bean);
        return "inductry.html";
    }

    @RequestMapping("inductry_getById.html")
    public String getById(Model model, Integer iiid) {
        model.addAttribute("config", configService.getConfig(Constant.CONFIGID));
        MInductryinfo mInductryinfo= mInductryInfoService.selectByIiid(iiid);
        model.addAttribute("mInductryinfo",mInductryinfo);
        return "inductry.html";
    }
}