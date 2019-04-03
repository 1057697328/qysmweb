package net.lightwing.mediweb.pojo;

import java.io.Serializable;

/**
 * m_inductry
 * @author 
 */
public class MInductry implements Serializable {
    /**
     * 产业板块ID
     */
    private Integer iid;

    /**
     * 产业板块名称
     */
    private String iname;

    /**
     * 产业板块简介
     */
    private String idesc;

    private static final long serialVersionUID = 1L;

    public Integer getIid() {
        return iid;
    }

    public void setIid(Integer iid) {
        this.iid = iid;
    }

    public String getIname() {
        return iname;
    }

    public void setIname(String iname) {
        this.iname = iname;
    }

    public String getIdesc() {
        return idesc;
    }

    public void setIdesc(String idesc) {
        this.idesc = idesc;
    }
}