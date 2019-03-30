package net.lightwing.mediweb.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * m_contact
 * @author 
 */
public class MContact implements Serializable {
    /**
     * 联系ID
     */
    private Integer cid;

    /**
     * 姓名
     */
    private String name;

    /**
     * 联系电话
     */
    private String phone;

    /**
     * 联系标题
     */
    private String subject;

    /**
     * 联系内容正文
     */
    private String message;

    /**
     * 提交时间
     */
    private Date subtime;

    private static final long serialVersionUID = 1L;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getSubtime() {
        return subtime;
    }

    public void setSubtime(Date subtime) {
        this.subtime = subtime;
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
        MContact other = (MContact) that;
        return (this.getCid() == null ? other.getCid() == null : this.getCid().equals(other.getCid()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getSubject() == null ? other.getSubject() == null : this.getSubject().equals(other.getSubject()))
            && (this.getMessage() == null ? other.getMessage() == null : this.getMessage().equals(other.getMessage()))
            && (this.getSubtime() == null ? other.getSubtime() == null : this.getSubtime().equals(other.getSubtime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCid() == null) ? 0 : getCid().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getSubject() == null) ? 0 : getSubject().hashCode());
        result = prime * result + ((getMessage() == null) ? 0 : getMessage().hashCode());
        result = prime * result + ((getSubtime() == null) ? 0 : getSubtime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cid=").append(cid);
        sb.append(", name=").append(name);
        sb.append(", phone=").append(phone);
        sb.append(", subject=").append(subject);
        sb.append(", message=").append(message);
        sb.append(", subtime=").append(subtime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}