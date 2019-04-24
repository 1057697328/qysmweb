package net.lightwing.qysmweb.pojo;

import java.io.Serializable;

/**
 * m_project
 * @author 
 */
public class MProject implements Serializable {
    /**
     * 项目编号
     */
    private Integer pid;

    /**
     * 项目名称
     */
    private String pname;

    /**
     * 项目详情
     */
    private String pdetail;

    private static final long serialVersionUID = 1L;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPdetail() {
        return pdetail;
    }

    public void setPdetail(String pdetail) {
        this.pdetail = pdetail;
    }
}