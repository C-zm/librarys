package czm.library.pojo;

import java.util.Date;

public class Comment {
    private Integer cid;

    private Integer uid;

    private Integer bid;

    private String cdetail;

    private Date ctime;

    private String csrc;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getCdetail() {
        return cdetail;
    }

    public void setCdetail(String cdetail) {
        this.cdetail = cdetail;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public String getCsrc() {
        return csrc;
    }

    public void setCsrc(String csrc) {
        this.csrc = csrc;
    }
}