package net.lightwing.qysmweb.controller;

import net.lightwing.qysmweb.commons.Constant;
import net.lightwing.qysmweb.commons.HtmlToText;
import net.lightwing.qysmweb.pojo.MContact;
import net.lightwing.qysmweb.pojo.MNews;
import net.lightwing.qysmweb.service.MConfigService;
import net.lightwing.qysmweb.service.MContactService;
import net.lightwing.qysmweb.service.MNewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author : clarence
 * 创建时间 : 2019-03-23
 * 长沙轻翼网络科技有限公司
 */
@SuppressWarnings("ALL")
@Controller
public class ContactController
{

    @Autowired
    private MConfigService configService;
    @Autowired
    private MContactService contactService;
    @Autowired
    private MNewsService newsService;

    @RequestMapping("contact.html")
    public String Contact(Model model)
    {
        model.addAttribute("config",configService.getConfig(Constant.CONFIGID));

        List<MNews> bottomNews = newsService.getList(1,2);
        for (MNews data:bottomNews)
        {
            data.setNdetail(HtmlToText.Html2Text(data.getNdetail()));
        }
        model.addAttribute("bottomNews",bottomNews);

        return "contact.html";
    }

    @RequestMapping("addContact")
    public String addContact(@ModelAttribute MContact contact,Model model)
    {
        Map<String,Object> map = new HashMap<>();
        try
        {
            contactService.addContact(contact);
            map.put("code",200);
            map.put("msg","您的留言已提交成功！");
        }
        catch (Exception e)
        {
            map.put("code",500);
            map.put("msg","您的留言提交失败！");
        }
        model.addAttribute("message",map);
        return "contact.html";
    }
}
