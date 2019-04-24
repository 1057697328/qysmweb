package net.lightwing.qysmweb.pojo;

import java.io.Serializable;

/**
 * m_goodtype
 * @author 
 */
public class MGoodtype implements Serializable {
    /**
     * 商品类型ID
     */
    private Integer gtypeid;

    /**
     * 商品类型名称
     */
    private String gtypename;

    /**
     * 商品类型简介
     */
    private String gtypedesc;

    private static final long serialVersionUID = 1L;

    public Integer getGtypeid() {
        return gtypeid;
    }

    public void setGtypeid(Integer gtypeid) {
        this.gtypeid = gtypeid;
    }

    public String getGtypename() {
        return gtypename;
    }

    public void setGtypename(String gtypename) {
        this.gtypename = gtypename;
    }

    public String getGtypedesc() {
        return gtypedesc;
    }

    public void setGtypedesc(String gtypedesc) {
        this.gtypedesc = gtypedesc;
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
        MGoodtype other = (MGoodtype) that;
        return (this.getGtypeid() == null ? other.getGtypeid() == null : this.getGtypeid().equals(other.getGtypeid()))
            && (this.getGtypename() == null ? other.getGtypename() == null : this.getGtypename().equals(other.getGtypename()))
            && (this.getGtypedesc() == null ? other.getGtypedesc() == null : this.getGtypedesc().equals(other.getGtypedesc()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getGtypeid() == null) ? 0 : getGtypeid().hashCode());
        result = prime * result + ((getGtypename() == null) ? 0 : getGtypename().hashCode());
        result = prime * result + ((getGtypedesc() == null) ? 0 : getGtypedesc().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", gtypeid=").append(gtypeid);
        sb.append(", gtypename=").append(gtypename);
        sb.append(", gtypedesc=").append(gtypedesc);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}