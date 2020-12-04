package czm.library.service;

import czm.library.pojo.Collect;

import java.util.List;

public interface CollectService {
    List<Collect> showCollect();
    int addCollect(Collect collect);
    List<Collect> getCollectByUid(Integer uid);
    List<Collect> getCollectByUidBid(Collect collect);
    int deleteCollect(Integer colid);
    List<Collect> getCollectBookByUid(Integer uid);
    List<Collect> getCollectByBname(String bname);
}
