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
        if (iid == null) {
            if (list.size() != 0) {
                MInductry info = list.get(0);
                List<MInductryinfo> mInductryInfoList = mInductryInfoService.selectByIid(info.getIid());
                model.addAttribute("mInductryInfoList", mInductryInfoList);
                model.addAttribute("iid", info.getIid());
                if (mInductryInfoList.size() != 0) {
                    MInductryinfo inductryinfo = mInductryInfoList.get(0);
                    MInductryinfo mInductryinfo = mInductryInfoService.selectByIiid(inductryinfo.getIiid());
                    model.addAttribute("mInductryinfo", mInductryinfo);
                    model.addAttribute("iiid", inductryinfo.getIiid());
                }
            } else {
                model.addAttribute("mInductryInfoList", null);
                model.addAttribute("mInductryinfo", null);
            }

        } else {
            List<MInductryinfo> mInductryInfoList = mInductryInfoService.selectByIid(iid);
            if (mInductryInfoList.size() != 0) {
                model.addAttribute("mInductryInfoList", mInductryInfoList);
                MInductryinfo im = mInductryInfoList.get(0);
                model.addAttribute("iid", iid);
                model.addAttribute("iiid", im.getIiid());
            } else {
                model.addAttribute("mInductryInfoList", null);
            }
            model.addAttribute("mInductryinfo", null);

        }

        model.addAttribute("pageData", bean);
        return "inductry.html";
    }

    @RequestMapping("inductry_getById.html")
    public String getById(Model model, Integer iiid) {
        model.addAttribute("config", configService.getConfig(Constant.CONFIGID));
        MInductryinfo mInductryinfo = mInductryInfoService.selectByIiid(iiid);
        List<MInductry> list = mInductryService.getList(1, Constant.PAGESIZE);

        PageBean bean = new PageBean(1, Constant.PAGESIZE, mInductryInfoService.count(), list);
        List<MInductryinfo> mInductryInfoList = mInductryInfoService.selectByIid(mInductryinfo.getIid());
        model.addAttribute("mInductryInfoList", mInductryInfoList);
        model.addAttribute("pageData", bean);
        model.addAttribute("mInductryinfo", mInductryinfo);
        model.addAttribute("iid", mInductryinfo.getIid());
        model.addAttribute("iiid", iiid);
        return "inductry.html";
    }
}
