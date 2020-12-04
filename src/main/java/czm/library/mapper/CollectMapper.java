package czm.library.mapper;

import czm.library.pojo.Collect;

import java.util.List;

public interface CollectMapper {

    List<Collect> selectAllCollect();

    int insert(Collect collect);

    List<Collect> selectCollectByUid(Integer uid);

    List<Collect> selectCollectByUidBid(Collect collect);

    int deleteCollectByColid(Integer colid);

    List<Collect> selectCollectBookByUid(Integer uid);

    List<Collect> selectCollectByBname(String bname);

}