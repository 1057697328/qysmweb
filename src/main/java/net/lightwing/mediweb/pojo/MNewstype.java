package net.lightwing.mediweb.pojo;

import java.io.Serializable;

/**
 * m_newstype
 * @author 
 */
public class MNewstype implements Serializable {
    /**
     * 新闻类型编号
     */
    private Integer ntypeid;

    /**
     * 新闻类型名称
     */
    private String ntypename;

    private static final long serialVersionUID = 1L;

    public Integer getNtypeid() {
        return ntypeid;
    }

    public void setNtypeid(Integer ntypeid) {
        this.ntypeid = ntypeid;
    }

    public String getNtypename() {
        return ntypename;
    }

    public void setNtypename(String ntypename) {
        this.ntypename = ntypename;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        MNewstype other = (MNewstype) that;
        return (this.getNtypeid() == null ? other.getNtypeid() == null : this.getNtypeid().equals(other.getNtypeid()))
            && (this.getNtypename() == null ? other.getNtypename() == null : this.getNtypename().equals(other.getNtypename()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getNtypeid() == null) ? 0 : getNtypeid().hashCode());
        result = prime * result + ((getNtypename() == null) ? 0 : getNtypename().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ntypeid=").append(ntypeid);
        sb.append(", ntypename=").append(ntypename);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}