package net.lightwing.qysmweb.controller;

import net.lightwing.qysmweb.commons.Constant;
import net.lightwing.qysmweb.commons.HtmlToText;
import net.lightwing.qysmweb.commons.PageBean;
import net.lightwing.qysmweb.pojo.MNews;
import net.lightwing.qysmweb.service.MConfigService;
import net.lightwing.qysmweb.service.MNewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@SuppressWarnings("ALL")
@Controller
public class NewsController
{
    @Autowired
    private MNewsService service;
    @Autowired
    private MConfigService configService;

    @RequestMapping("newslist.html")
    public String NewsList(Model model,@RequestParam(required = false) Integer pageindex)
    {
        if(pageindex==null)
        {
            pageindex=1;
        }

        List<MNews> list = service.getList(pageindex,Constant.PAGESIZE);
        for (MNews data:list)
        {
            data.setNdetail(HtmlToText.Html2Text(data.getNdetail()));
        }

        PageBean bean = new PageBean(pageindex,Constant.PAGESIZE,service.getCount(),list);

        model.addAttribute("pagedata",bean);
        model.addAttribute("config",configService.getConfig(Constant.CONFIGID));
        List<MNews> bottomNews = service.getList(1,2);
        for (MNews data:bottomNews)
        {
            data.setNdetail(HtmlToText.Html2Text(data.getNdetail()));
        }
        model.addAttribute("bottomNews",bottomNews);
        return "newslist.html";
    }


    @RequestMapping("newsdetail.html")
    public String NewsDetail(Integer nid,Model model)
    {
        model.addAttribute("config",configService.getConfig(Constant.CONFIGID));
        MNews news = service.getNews(nid);
        model.addAttribute("newsdata",news);

        List<MNews> bottomNews = service.getList(1,2);
        for (MNews data:bottomNews)
        {
            data.setNdetail(HtmlToText.Html2Text(data.getNdetail()));
        }
        model.addAttribute("bottomNews",bottomNews);

        return "newsdetail.html";
    }
}
