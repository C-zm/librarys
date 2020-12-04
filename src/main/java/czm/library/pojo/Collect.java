package czm.library.pojo;

import java.util.List;

public class Collect {
    private Integer colid;
    private Integer uid;
    private Integer bid;
    private String coltime;
    private List<Book> collectBook;

    public Integer getColid() {
        return colid;
    }

    public void setColid(Integer colid) {
        this.colid = colid;
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

    public String getcoltime() {
        return coltime;
    }

    public void setcoltime(String coltime) {
        this.coltime = coltime;
    }

    public List<Book> getCollectBook() {
        return collectBook;
    }

    public void setCollectBook(List<Book> collectBook) {
        this.collectBook = collectBook;
    }
}
