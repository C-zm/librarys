package czm.library.mapper;

import czm.library.pojo.Sysuser;

import java.util.List;

public interface SysuserMapper {
    public int deleteUserById(Integer sysid);

    public int updateUserById(Sysuser sysuser);

    public List<Sysuser> selectUserByKeyword(String sysname);

    Sysuser selectSysuserById(Integer isysd);

    public int insert(Sysuser sysuser);

    public List<Sysuser> selectAllSysuser();

    List<Sysuser> selectSysuserByPower(Integer power);

    Sysuser selectSysuserBySysname(String sysname);
}
