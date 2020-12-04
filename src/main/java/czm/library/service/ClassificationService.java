package czm.library.service;

import czm.library.pojo.Classification;

import java.util.List;

public interface ClassificationService {
    int addClassification(Classification classification);
    List<Classification> showClassification();
    int deleteClassification(Integer classid);
    int updateClassification(Classification classification);
    Classification getClassificationById(Integer cid);
    List<Classification> getClassificationByKeyword(String type);
    List<Classification> getAllbooktype();
}
