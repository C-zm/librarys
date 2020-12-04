package czm.library.pojo;

public class OrderDetail {
    private Long odid;

    private String bname;

    private String bsrc;

    private Integer num;

    private Float bprice;

    private Long oid;

    private Integer state;

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Long getOdid() {
        return odid;
    }

    public void setOdid(Long odid) {
        this.odid = odid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getBsrc() {
        return bsrc;
    }

    public void setBsrc(String bsrc) {
        this.bsrc = bsrc;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Float getBprice() {
        return bprice;
    }

    public void setBprice(Float bprice) {
        this.bprice = bprice;
    }

    public Long getOid() {
        return oid;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }
}