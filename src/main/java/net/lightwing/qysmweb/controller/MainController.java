package net.lightwing.qysmweb.controller;

import net.lightwing.qysmweb.commons.Constant;
import net.lightwing.qysmweb.commons.HtmlToText;
import net.lightwing.qysmweb.pojo.MCoop;
import net.lightwing.qysmweb.pojo.MNews;
import net.lightwing.qysmweb.service.MBannerService;
import net.lightwing.qysmweb.service.MConfigService;
import net.lightwing.qysmweb.service.MCoopService;
import net.lightwing.qysmweb.service.MNewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@SuppressWarnings("ALL")
@Controller
public class MainController {
    @Autowired
    private MConfigService configService;
    @Autowired
    private MBannerService bannerService;
    @Autowired
    private MNewsService newsService;

    @Autowired
    private MCoopService mCoopService;

    @RequestMapping(path = {"index.html", "/"})
    public String Main(Model model) {
        model.addAttribute("config", configService.getConfig(Constant.CONFIGID));
        model.addAttribute("banners", bannerService.getList(1, 6));
        List<MNews> list = newsService.getList(1, 3);
        for (MNews data : list) {
            data.setNdetail(HtmlToText.Html2Text(data.getNdetail()));
        }
        model.addAttribute("news", list);

        List<MNews> bottomNews = newsService.getList(1, 2);
        for (MNews data : bottomNews) {
            data.setNdetail(HtmlToText.Html2Text(data.getNdetail()));
        }
        List<MCoop> mCoopList = mCoopService.getList(1, 6);
        model.addAttribute("bottomNews", bottomNews);
        model.addAttribute("mCoopList", mCoopList);
        return "index.html";
    }
}
