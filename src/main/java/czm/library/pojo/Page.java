package czm.library.pojo;

public class Page {
    private int page;
    private String page_href;

    public Page(int page, String page_href) {
        this.page = page;
        this.page_href = page_href;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getPage_href() {
        return page_href;
    }

    public void setPage_href(String page_href) {
        this.page_href = page_href;
    }
}
