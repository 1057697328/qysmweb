package net.lightwing.mediweb.controller;

import net.lightwing.mediweb.commons.Constant;
import net.lightwing.mediweb.commons.HtmlToText;
import net.lightwing.mediweb.pojo.MGoods;
import net.lightwing.mediweb.pojo.MNews;
import net.lightwing.mediweb.service.MConfigService;
import net.lightwing.mediweb.service.MGoodsService;
import net.lightwing.mediweb.service.MGoodtypeService;
import net.lightwing.mediweb.service.MNewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@SuppressWarnings("ALL")
@Controller
public class GoodsController {
    @Autowired
    private MGoodsService service;
    @Autowired
    private MConfigService configService;
    @Autowired
    private MGoodtypeService goodtypeService;
    @Autowired
    private MNewsService newsService;

    @RequestMapping("product.html")
    public String Main(Model model) {
        List<MGoods> list = service.getList();
        model.addAttribute("config", configService.getConfig(Constant.CONFIGID));
        model.addAttribute("list", list);
        model.addAttribute("typelist", goodtypeService.getList());


        List<MNews> bottomNews = newsService.getList(1, 2);
        for (MNews data : bottomNews) {
            data.setNdetail(HtmlToText.Html2Text(data.getNdetail()));
        }
        model.addAttribute("bottomNews", bottomNews);

        return "product.html";
    }


    @RequestMapping("product_search.html")
    public String Search(String gname, Model model)
    {

        List<MGoods> list = service.getGoods(gname);
        model.addAttribute("config", configService.getConfig(Constant.CONFIGID));
        model.addAttribute("list", list);

        List<MNews> bottomNews = newsService.getList(1, 2);
        for (MNews data : bottomNews) {
            data.setNdetail(HtmlToText.Html2Text(data.getNdetail()));
        }
        model.addAttribute("bottomNews", bottomNews);

        return "product_search.html";
    }
}
