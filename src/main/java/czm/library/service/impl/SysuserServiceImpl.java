package czm.library.service.impl;

import czm.library.mapper.SysuserMapper;
import czm.library.pojo.Sysuser;
import czm.library.service.SysuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户管理业务层
 */
@Service
public class SysuserServiceImpl implements SysuserService {
    @Autowired
    private SysuserMapper sysuserMapper;


    @Override
    public List<Sysuser> showSysuser() {
        return sysuserMapper.selectAllSysuser();
    }

    @Override
    public int addSysuser(Sysuser sysuser) {
        return sysuserMapper.insert(sysuser);
    }

    @Override
    public Sysuser getSysuserById(Integer sysid) {
        return sysuserMapper.selectSysuserById(sysid);
    }

    @Override
    public List<Sysuser> getSysuserByKeyword(String sysname) {
        return sysuserMapper.selectUserByKeyword(sysname);
    }

    @Override
    public int updateSysuser(Sysuser sysuser) {
        return sysuserMapper.updateUserById(sysuser);
    }

    @Override
    public int deleteSysuser(Integer sysid) {
        return sysuserMapper.deleteUserById(sysid);
    }

    @Override
    public List<Sysuser> getSysuserByPower(Integer power) {
        return sysuserMapper.selectSysuserByPower(power);
    }

    @Override
    public Sysuser getSysuserBySysname(String sysname) {
        return sysuserMapper.selectSysuserBySysname(sysname);
    }
}
