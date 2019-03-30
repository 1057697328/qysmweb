package net.lightwing.mediweb.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * m_news
 * @author 
 */
public class MNews implements Serializable {
    /**
     * 新闻ID
     */
    private Integer nid;

    /**
     * 新闻标题
     */
    private String ntitle;

    /**
     * 发布时间
     */
    private Date createdate;

    /**
     * 封面图路径
     */
    private String imgpath;

    /**
     * 新闻类型ID
     */
    private Integer ntypeid;

    /**
     * 新闻正文
     */
    private String ndetail;

    /**
     * 新闻类型
     */
    private MNewstype newstype;


    public MNewstype getNewstype() {
        return newstype;
    }

    public void setNewstype(MNewstype newstype) {
        this.newstype = newstype;
    }

    private static final long serialVersionUID = 1L;

    public Integer getNid() {
        return nid;
    }

    public void setNid(Integer nid) {
        this.nid = nid;
    }

    public String getNtitle() {
        return ntitle;
    }

    public void setNtitle(String ntitle) {
        this.ntitle = ntitle;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getImgpath() {
        return imgpath;
    }

    public void setImgpath(String imgpath) {
        this.imgpath = imgpath;
    }

    public Integer getNtypeid() {
        return ntypeid;
    }

    public void setNtypeid(Integer ntypeid) {
        this.ntypeid = ntypeid;
    }

    public String getNdetail() {
        return ndetail;
    }

    public void setNdetail(String ndetail) {
        this.ndetail = ndetail;
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
        MNews other = (MNews) that;
        return (this.getNid() == null ? other.getNid() == null : this.getNid().equals(other.getNid()))
            && (this.getNtitle() == null ? other.getNtitle() == null : this.getNtitle().equals(other.getNtitle()))
            && (this.getCreatedate() == null ? other.getCreatedate() == null : this.getCreatedate().equals(other.getCreatedate()))
            && (this.getImgpath() == null ? other.getImgpath() == null : this.getImgpath().equals(other.getImgpath()))
            && (this.getNtypeid() == null ? other.getNtypeid() == null : this.getNtypeid().equals(other.getNtypeid()))
            && (this.getNdetail() == null ? other.getNdetail() == null : this.getNdetail().equals(other.getNdetail()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getNid() == null) ? 0 : getNid().hashCode());
        result = prime * result + ((getNtitle() == null) ? 0 : getNtitle().hashCode());
        result = prime * result + ((getCreatedate() == null) ? 0 : getCreatedate().hashCode());
        result = prime * result + ((getImgpath() == null) ? 0 : getImgpath().hashCode());
        result = prime * result + ((getNtypeid() == null) ? 0 : getNtypeid().hashCode());
        result = prime * result + ((getNdetail() == null) ? 0 : getNdetail().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", nid=").append(nid);
        sb.append(", ntitle=").append(ntitle);
        sb.append(", createdate=").append(createdate);
        sb.append(", imgpath=").append(imgpath);
        sb.append(", ntypeid=").append(ntypeid);
        sb.append(", ndetail=").append(ndetail);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}