package net.lightwing.qysmweb.pojo;

import java.io.Serializable;

/**
 * m_goods
 * @author 
 */
public class MGoods implements Serializable {
    /**
     * 商品ID
     */
    private Integer gid;

    /**
     * 商品图片路径
     */
    private String imgpath;

    /**
     * 商品名称
     */
    private String gname;

    /**
     * 购买地址
     */
    private String buypath;

    /**
     * 商品类型编号
     */
    private Integer gtypeid;

    private String details;

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    /**
     * 商品价格
     */
    private Double price;

    private MGoodtype goodtype;

    public MGoodtype getGoodtype() {
        return goodtype;
    }

    public void setGoodtype(MGoodtype goodtype) {
        this.goodtype = goodtype;
    }

    private static final long serialVersionUID = 1L;

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getImgpath() {
        return imgpath;
    }

    public void setImgpath(String imgpath) {
        this.imgpath = imgpath;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public String getBuypath() {
        return buypath;
    }

    public void setBuypath(String buypath) {
        this.buypath = buypath;
    }

    public Integer getGtypeid() {
        return gtypeid;
    }

    public void setGtypeid(Integer gtypeid) {
        this.gtypeid = gtypeid;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
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
        MGoods other = (MGoods) that;
        return (this.getGid() == null ? other.getGid() == null : this.getGid().equals(other.getGid()))
            && (this.getImgpath() == null ? other.getImgpath() == null : this.getImgpath().equals(other.getImgpath()))
            && (this.getGname() == null ? other.getGname() == null : this.getGname().equals(other.getGname()))
            && (this.getBuypath() == null ? other.getBuypath() == null : this.getBuypath().equals(other.getBuypath()))
            && (this.getGtypeid() == null ? other.getGtypeid() == null : this.getGtypeid().equals(other.getGtypeid()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getGid() == null) ? 0 : getGid().hashCode());
        result = prime * result + ((getImgpath() == null) ? 0 : getImgpath().hashCode());
        result = prime * result + ((getGname() == null) ? 0 : getGname().hashCode());
        result = prime * result + ((getBuypath() == null) ? 0 : getBuypath().hashCode());
        result = prime * result + ((getGtypeid() == null) ? 0 : getGtypeid().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", gid=").append(gid);
        sb.append(", imgpath=").append(imgpath);
        sb.append(", gname=").append(gname);
        sb.append(", buypath=").append(buypath);
        sb.append(", gtypeid=").append(gtypeid);
        sb.append(", price=").append(price);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}