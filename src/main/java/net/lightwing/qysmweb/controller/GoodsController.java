package net.lightwing.qysmweb.controller;

import net.lightwing.qysmweb.commons.Constant;
import net.lightwing.qysmweb.commons.HtmlToText;
import net.lightwing.qysmweb.pojo.MGoods;
import net.lightwing.qysmweb.pojo.MNews;
import net.lightwing.qysmweb.service.MConfigService;
import net.lightwing.qysmweb.service.MGoodsService;
import net.lightwing.qysmweb.service.MGoodtypeService;
import net.lightwing.qysmweb.service.MNewsService;
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

    @RequestMapping("product_details.html")
    public String ProductDetails(Integer gid,Model model)
    {
        model.addAttribute("config", configService.getConfig(Constant.CONFIGID));
        List<MNews> bottomNews = newsService.getList(1, 2);
        for (MNews data : bottomNews) {
            data.setNdetail(HtmlToText.Html2Text(data.getNdetail()));
        }
        model.addAttribute("bottomNews", bottomNews);
        MGoods data = service.getGoods(gid);
        model.addAttribute("goods",data);
        return "product_details.html";
    }
}
