package czm.library.mapper;

import czm.library.pojo.Classification;

import java.util.List;

public interface ClassificationMapper {

    List<Classification> selectAllClassification();

    int insert(Classification classification);

    Classification selectClassificationById(Integer cid);

    int updateClassificationById(Classification classification);

    int deleteClassificationById(Integer cid);

    List<Classification> selectClassificationByKeyword(String type);

    List<Classification> selectAllbooktype();
}