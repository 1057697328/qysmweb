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
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@SuppressWarnings("ALL")
@Controller
public class MainController
{
    @Autowired
    private MConfigService configService;
    @Autowired
    private MBannerService bannerService;
    @Autowired
    private MNewsService newsService;

    @RequestMapping(path = {"index.html","/"})
    public String Main(Model model)
    {
        model.addAttribute("config",configService.getConfig(Constant.CONFIGID));
        model.addAttribute("banners",bannerService.getList(1,6));
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

        return "index.html";
    }
}
