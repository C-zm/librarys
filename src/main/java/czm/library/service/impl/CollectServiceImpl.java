package czm.library.service.impl;

import czm.library.mapper.CollectMapper;
import czm.library.pojo.Collect;
import czm.library.service.CollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户管理业务层
 */
@Service
public class CollectServiceImpl implements CollectService {

    @Autowired
    private CollectMapper collectMapper;

    public int addCollect(Collect collect){
        return collectMapper.insert(collect);
    }

    @Override
    public List<Collect> showCollect() {
        return collectMapper.selectAllCollect();
    }

    @Override
    public List<Collect> getCollectByUid(Integer uid) {
        return collectMapper.selectCollectByUid(uid);
    }

    @Override
    public List<Collect> getCollectByUidBid(Collect collect) {
        return collectMapper.selectCollectByUidBid(collect);
    }

    @Override
    public List<Collect> getCollectByBname(String uname) {
        return collectMapper.selectCollectByBname(uname);
    }

    @Override
    public int deleteCollect(Integer colid) {
        return collectMapper.deleteCollectByColid(colid);
    }

    @Override
    public List<Collect> getCollectBookByUid(Integer uid) {
        return collectMapper.selectCollectBookByUid(uid);
    }

}
