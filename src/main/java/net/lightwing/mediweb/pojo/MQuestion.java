package net.lightwing.mediweb.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * m_question
 * @author 
 */
public class MQuestion implements Serializable {
    /**
     * 科普答疑ID
     */
    private Integer qid;

    /**
     * 科普答疑名称
     */
    private String qname;

    /**
     * 科普答疑创建时间
     */
    private Date createtime;

    /**
     * 科普答疑答案
     */
    private String qanswer;

    private static final long serialVersionUID = 1L;

    public Integer getQid() {
        return qid;
    }

    public void setQid(Integer qid) {
        this.qid = qid;
    }

    public String getQname() {
        return qname;
    }

    public void setQname(String qname) {
        this.qname = qname;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getQanswer() {
        return qanswer;
    }

    public void setQanswer(String qanswer) {
        this.qanswer = qanswer;
    }
}