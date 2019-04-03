package net.lightwing.mediweb.pojo;

import java.io.Serializable;

/**
 * m_coop
 * @author 
 */
public class MCoop implements Serializable {
    /**
     * 合作机构编号
     */
    private Integer coid;

    /**
     * 合作机构名称
     */
    private String coname;

    /**
     * 合作机构Logo图URL地址
     */
    private String imgpath;

    /**
     * 合作机构网站地址
     */
    private String weburl;

    private static final long serialVersionUID = 1L;

    public Integer getCoid() {
        return coid;
    }

    public void setCoid(Integer coid) {
        this.coid = coid;
    }

    public String getConame() {
        return coname;
    }

    public void setConame(String coname) {
        this.coname = coname;
    }

    public String getImgpath() {
        return imgpath;
    }

    public void setImgpath(String imgpath) {
        this.imgpath = imgpath;
    }

    public String getWeburl() {
        return weburl;
    }

    public void setWeburl(String weburl) {
        this.weburl = weburl;
    }
}