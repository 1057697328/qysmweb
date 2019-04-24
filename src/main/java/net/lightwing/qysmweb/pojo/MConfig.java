package net.lightwing.qysmweb.pojo;

import java.io.Serializable;

/**
 * m_config
 * @author 
 */
public class MConfig implements Serializable {
    /**
     * 设置ID
     */
    private Integer cid;

    /**
     * 联系地址
     */
    private String address;

    /**
     * 联系电话
     */
    private String phone1;

    /**
     * 联系电话2（手机号）
     */
    private String phone2;

    /**
     * 电子邮件1
     */
    private String email1;

    private String bottomabout;

    /**
     * 关于我们内容
     */
    private String aboutus;

    private static final long serialVersionUID = 1L;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public String getEmail1() {
        return email1;
    }

    public void setEmail1(String email1) {
        this.email1 = email1;
    }

    public String getBottomabout() {
        return bottomabout;
    }

    public void setBottomabout(String bottomabout) {
        this.bottomabout = bottomabout;
    }

    public String getAboutus() {
        return aboutus;
    }

    public void setAboutus(String aboutus) {
        this.aboutus = aboutus;
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
        MConfig other = (MConfig) that;
        return (this.getCid() == null ? other.getCid() == null : this.getCid().equals(other.getCid()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getPhone1() == null ? other.getPhone1() == null : this.getPhone1().equals(other.getPhone1()))
            && (this.getPhone2() == null ? other.getPhone2() == null : this.getPhone2().equals(other.getPhone2()))
            && (this.getEmail1() == null ? other.getEmail1() == null : this.getEmail1().equals(other.getEmail1()))
            && (this.getBottomabout() == null ? other.getBottomabout() == null : this.getBottomabout().equals(other.getBottomabout()))
            && (this.getAboutus() == null ? other.getAboutus() == null : this.getAboutus().equals(other.getAboutus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCid() == null) ? 0 : getCid().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getPhone1() == null) ? 0 : getPhone1().hashCode());
        result = prime * result + ((getPhone2() == null) ? 0 : getPhone2().hashCode());
        result = prime * result + ((getEmail1() == null) ? 0 : getEmail1().hashCode());
        result = prime * result + ((getBottomabout() == null) ? 0 : getBottomabout().hashCode());
        result = prime * result + ((getAboutus() == null) ? 0 : getAboutus().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cid=").append(cid);
        sb.append(", address=").append(address);
        sb.append(", phone1=").append(phone1);
        sb.append(", phone2=").append(phone2);
        sb.append(", email1=").append(email1);
        sb.append(", bottomabout=").append(bottomabout);
        sb.append(", aboutus=").append(aboutus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}