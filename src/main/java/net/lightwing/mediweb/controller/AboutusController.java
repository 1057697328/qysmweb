package net.lightwing.mediweb.controller;

import net.lightwing.mediweb.commons.Constant;
import net.lightwing.mediweb.commons.HtmlToText;
import net.lightwing.mediweb.pojo.MNews;
import net.lightwing.mediweb.service.MBannerService;
import net.lightwing.mediweb.service.MConfigService;
import net.lightwing.mediweb.service.MNewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@SuppressWarnings("ALL")
@Controller
public class AboutusController
{

    @Autowired
    private MConfigService configService;
    @Autowired
    private MNewsService newsService;

    @RequestMapping("aboutus.html")
    public String AboutUs(Model model)
    {
        model.addAttribute("config",configService.getConfig(Constant.CONFIGID));
        model.addAttribute("config",configService.getConfig(Constant.CONFIGID));
        List<MNews> list = newsService.getList(1,3);
        for (MNews data:list)
        {
            data.setNdetail(HtmlToText.Html2Text(data.getNdetail()));
        }
        model.addAttribute("news",list);


        List<MNews> bottomNews = newsService.getList(1,2);
        for (MNews data:bottomNews)
        {
            data.setNdetail(HtmlToText.Html2Text(data.getNdetail()));
        }
        model.addAttribute("bottomNews",bottomNews);
        return "aboutus.html";
    }
}
