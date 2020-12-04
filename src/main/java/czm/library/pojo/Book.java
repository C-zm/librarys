package czm.library.pojo;

public class Book {
    private Integer bid;

    private String bname;

    private Boolean isnew;

    private Float bprice;

    private Integer inventory;

    private String bsrc;

    private String btype;

    public String getBtype() {
        return btype;
    }

    public void setBtype(String btype) {
        this.btype = btype;
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public Boolean getIsnew() {
        return isnew;
    }

    public void setIsnew(Boolean isnew) {
        this.isnew = isnew;
    }

    public Float getBprice() {
        return bprice;
    }

    public void setBprice(Float bprice) {
        this.bprice = bprice;
    }

    public Integer getInventory() {
        return inventory;
    }

    public void setInventory(Integer inventory) {
        this.inventory = inventory;
    }

    public String getBsrc() {
        return bsrc;
    }

    public void setBsrc(String bsrc) {
        this.bsrc = bsrc;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bid=" + bid +
                ", bname='" + bname + '\'' +
                ", isnew=" + isnew +
                ", bprice=" + bprice +
                ", inventory=" + inventory +
                ", bsrc='" + bsrc + '\'' +
                ", btype='" + btype + '\'' +
                '}';
    }
}