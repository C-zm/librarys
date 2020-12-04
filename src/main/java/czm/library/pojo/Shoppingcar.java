package czm.library.pojo;

public class Shoppingcar {
    private Integer sid;

    private Integer uid;

    private Integer bid;

    private Integer num;

    private Float bprice;

    private Float totalprice;

    private Boolean checked;

    private Book books;

    public Book getBooks() {
        return books;
    }

    public void setBooks(Book books) {
        this.books = books;
    }

    public Boolean getChecked() {
        return checked;
    }

    public void setChecked(Boolean checked) {
        this.checked = checked;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
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

    public Float getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(Float totalprice) {
        this.totalprice = totalprice;
    }
}