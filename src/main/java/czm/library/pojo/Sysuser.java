package czm.library.pojo;

public class Sysuser {
    private Integer sysid;

    private String sysname;

    private String syssrc;

    private Integer power;

    private String sysphone;

    private String syspassword;

    public Integer getSysid() {
        return sysid;
    }

    public void setSysid(Integer sysid) {
        this.sysid = sysid;
    }

    public String getSysname() {
        return sysname;
    }

    public void setSysname(String sysname) {
        this.sysname = sysname;
    }

    public String getSyssrc() {
        return syssrc;
    }

    public void setSyssrc(String syssrc) {
        this.syssrc = syssrc;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public String getSysphone() {
        return sysphone;
    }

    public void setSysphone(String sysphone) {
        this.sysphone = sysphone;
    }

    public String getSyspassword() {
        return syspassword;
    }

    public void setSyspassword(String syspassword) {
        this.syspassword = syspassword;
    }

    @Override
    public String toString() {
        return "Sysuser{" +
                "sysid=" + sysid +
                ", sysname='" + sysname + '\'' +
                ", syssrc='" + syssrc + '\'' +
                ", power=" + power +
                ", sysphone='" + sysphone + '\'' +
                ", syspassword='" + syspassword + '\'' +
                '}';
    }
}