package czm.library.pojo;

public class BookDetail {
    private Integer bdid;

    private Integer bid;

    private String bname;

    private Float bprice;

    private Integer inventory;

    private String bsrclist;

    private String author;

    private String ontime;

    private  String introduce;



    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getOntime() {
        return ontime;
    }

    public void setOntime(String ontime) {
        this.ontime = ontime;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public Integer getBdid() {
        return bdid;
    }

    public void setBdid(Integer bdid) {
        this.bdid = bdid;
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

    public String getBsrclist() {
        return bsrclist;
    }

    public void setBsrclist(String bsrclist) {
        this.bsrclist = bsrclist;
    }

}