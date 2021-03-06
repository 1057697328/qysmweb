package net.lightwing.qysmweb.controller;

import net.lightwing.qysmweb.commons.Constant;
import net.lightwing.qysmweb.commons.PageBean;
import net.lightwing.qysmweb.pojo.MProject;
import net.lightwing.qysmweb.service.MConfigService;
import net.lightwing.qysmweb.service.MProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ProjectController {
    @Autowired
    private MConfigService configService;

    @Autowired
    private MProjectService service;

    @RequestMapping("projectList.html")
    public String index(Model model, Integer pageindex, Integer pid) {
        if (pageindex == null) {
            pageindex = 1;
        }
        model.addAttribute("config", configService.getConfig(Constant.CONFIGID));
        List<MProject> list = service.getList(pageindex, Constant.PAGESIZE);
        PageBean bean = new PageBean(pageindex, Constant.PAGESIZE, service.count(), list);
        model.addAttribute("pageData", bean);
        if (pid != null) {
            MProject mProject = service.selectById(pid);
            model.addAttribute("mProject", mProject);
        } else {
            model.addAttribute("mProject", null);
        }

        return "projectList.html";
    }
}
