package czm.library.service;

import czm.library.pojo.Sysuser;

import java.util.List;

public interface SysuserService {
    public List<Sysuser> showSysuser();

    public int addSysuser(Sysuser sysuser);

    public Sysuser getSysuserById(Integer sysid);

    public List<Sysuser> getSysuserByKeyword(String sysname);

    public int updateSysuser(Sysuser sysuser);

    int deleteSysuser(Integer sysid);

    List<Sysuser> getSysuserByPower(Integer power);

    Sysuser getSysuserBySysname(String sysname);
}
