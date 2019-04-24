package net.lightwing.qysmweb.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * m_doctor
 * @author 
 */
@Data
public class MDoctor implements Serializable {
    /**
     * 专家ID
     */
    private Integer did;

    /**
     * 专家姓名
     */
    private String dname;

    /**
     * 专家职位&头衔
     */
    private String djob;

    /**
     * 专家头像URL
     */
    private String imgpath;

    /**
     * 专家简介
     */
    private String ddesc;

    private static final long serialVersionUID = 1L;

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getDjob() {
        return djob;
    }

    public void setDjob(String djob) {
        this.djob = djob;
    }

    public String getImgpath() {
        return imgpath;
    }

    public void setImgpath(String imgpath) {
        this.imgpath = imgpath;
    }

    public String getDdesc() {
        return ddesc;
    }

    public void setDdesc(String ddesc) {
        this.ddesc = ddesc;
    }
}