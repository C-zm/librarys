package czm.library.service.impl;

import czm.library.mapper.ClassificationMapper;
import czm.library.pojo.Classification;
import czm.library.service.ClassificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户管理业务层
 */
@Service
public class ClassificationServiceImpl implements ClassificationService {

    @Autowired
    private ClassificationMapper classificationrMapper;

    public int addClassification(Classification classification){
        return classificationrMapper.insert(classification);
    }

    @Override
    public List<Classification> showClassification() {
        return classificationrMapper.selectAllClassification();
    }

    @Override
    public Classification getClassificationById(Integer cid) {
        System.out.println(classificationrMapper.selectClassificationById(cid));
        return classificationrMapper.selectClassificationById(cid);
    }

    @Override
    public List<Classification> getClassificationByKeyword(String type) {
        return classificationrMapper.selectClassificationByKeyword(type);
    }

    @Override
    public List<Classification> getAllbooktype() {
        return classificationrMapper.selectAllbooktype();
    }

    @Override
    public int deleteClassification(Integer classid) {
        return classificationrMapper.deleteClassificationById(classid);
    }


    @Override
    public int updateClassification(Classification classification) {
        return classificationrMapper.updateClassificationById(classification);
    }
}
