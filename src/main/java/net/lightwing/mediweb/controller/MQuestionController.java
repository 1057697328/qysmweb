package net.lightwing.mediweb.controller;

import net.lightwing.mediweb.commons.Constant;
import net.lightwing.mediweb.commons.PageBean;
import net.lightwing.mediweb.pojo.MProject;
import net.lightwing.mediweb.pojo.MQuestion;
import net.lightwing.mediweb.service.MConfigService;
import net.lightwing.mediweb.service.MProjectService;
import net.lightwing.mediweb.service.MQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MQuestionController {
    @Autowired
    private MConfigService configService;

    @Autowired
    private MQuestionService service;

    @RequestMapping("questionList.html")
    public String index(Model model, Integer pageindex, Integer qid) {
        if (pageindex == null) {
            pageindex = 1;
        }
        model.addAttribute("config", configService.getConfig(Constant.CONFIGID));
        List<MQuestion> list = service.getList(pageindex, Constant.PAGESIZE);
        PageBean bean = new PageBean(pageindex, Constant.PAGESIZE, service.count(), list);
        model.addAttribute("pageData", bean);
        if (qid != null) {
            MQuestion mQuestion = service.selectById(qid);
            model.addAttribute("mQuestion", mQuestion);
        } else {
            model.addAttribute("mQuestion", null);
        }
        return "questionList.html";
    }
}
