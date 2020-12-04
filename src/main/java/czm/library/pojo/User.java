package czm.library.pojo;

public class User {
    private Integer uid;

    private String uname;

    private String uphone;

    private String usrc;

    private String openid;

    private String pwd;

    private float account;

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public float getAccount() {
        return account;
    }

    public void setAccount(float account) {
        this.account = account;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUphone() {
        return uphone;
    }

    public void setUphone(String uphone) {
        this.uphone = uphone;
    }

    public String getUsrc() {
        return usrc;
    }

    public void setUsrc(String usrc) {
        this.usrc = usrc;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }
}