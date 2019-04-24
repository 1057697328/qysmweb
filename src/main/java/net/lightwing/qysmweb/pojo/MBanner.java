package net.lightwing.qysmweb.pojo;

import java.io.Serializable;

/**
 * m_banner
 * @author 
 */
public class MBanner implements Serializable {
    /**
     * 轮播编号
     */
    private Integer bid;

    /**
     * 图片路径
     */
    private String imgpath;

    /**
     * 小标题
     */
    private String smalltitle;

    /**
     * 大标题
     */
    private String bigtitle;

    /**
     * 是否显示按钮(0显示1不显示)
     */
    private Integer showbtn;

    /**
     * 按钮标题
     */
    private String btntext;

    /**
     * 跳转链接
     */
    private String btnhref;

    private static final long serialVersionUID = 1L;

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getImgpath() {
        return imgpath;
    }

    public void setImgpath(String imgpath) {
        this.imgpath = imgpath;
    }

    public String getSmalltitle() {
        return smalltitle;
    }

    public void setSmalltitle(String smalltitle) {
        this.smalltitle = smalltitle;
    }

    public String getBigtitle() {
        return bigtitle;
    }

    public void setBigtitle(String bigtitle) {
        this.bigtitle = bigtitle;
    }

    public Integer getShowbtn() {
        return showbtn;
    }

    public void setShowbtn(Integer showbtn) {
        this.showbtn = showbtn;
    }

    public String getBtntext() {
        return btntext;
    }

    public void setBtntext(String btntext) {
        this.btntext = btntext;
    }

    public String getBtnhref() {
        return btnhref;
    }

    public void setBtnhref(String btnhref) {
        this.btnhref = btnhref;
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
        MBanner other = (MBanner) that;
        return (this.getBid() == null ? other.getBid() == null : this.getBid().equals(other.getBid()))
            && (this.getImgpath() == null ? other.getImgpath() == null : this.getImgpath().equals(other.getImgpath()))
            && (this.getSmalltitle() == null ? other.getSmalltitle() == null : this.getSmalltitle().equals(other.getSmalltitle()))
            && (this.getBigtitle() == null ? other.getBigtitle() == null : this.getBigtitle().equals(other.getBigtitle()))
            && (this.getShowbtn() == null ? other.getShowbtn() == null : this.getShowbtn().equals(other.getShowbtn()))
            && (this.getBtntext() == null ? other.getBtntext() == null : this.getBtntext().equals(other.getBtntext()))
            && (this.getBtnhref() == null ? other.getBtnhref() == null : this.getBtnhref().equals(other.getBtnhref()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBid() == null) ? 0 : getBid().hashCode());
        result = prime * result + ((getImgpath() == null) ? 0 : getImgpath().hashCode());
        result = prime * result + ((getSmalltitle() == null) ? 0 : getSmalltitle().hashCode());
        result = prime * result + ((getBigtitle() == null) ? 0 : getBigtitle().hashCode());
        result = prime * result + ((getShowbtn() == null) ? 0 : getShowbtn().hashCode());
        result = prime * result + ((getBtntext() == null) ? 0 : getBtntext().hashCode());
        result = prime * result + ((getBtnhref() == null) ? 0 : getBtnhref().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", bid=").append(bid);
        sb.append(", imgpath=").append(imgpath);
        sb.append(", smalltitle=").append(smalltitle);
        sb.append(", bigtitle=").append(bigtitle);
        sb.append(", showbtn=").append(showbtn);
        sb.append(", btntext=").append(btntext);
        sb.append(", btnhref=").append(btnhref);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}