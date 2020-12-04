package czm.library.controller.user;

import com.alibaba.fastjson.JSON;
import czm.library.pojo.Classification;
import czm.library.service.ClassificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/classification")
public class ClassificationController {

    @Autowired
    private ClassificationService classificationService;

    /**
     * 查询所有用户
     * @return
     */
    @GetMapping("/showClassification")
    public Object findClassificationAll(){
        List<Classification> list = classificationService.showClassification();
        String ClassificationJson= JSON.toJSONString(list);
        return ClassificationJson;
    }
    @GetMapping("/getAllbooktype")
    public Object getAllbooktype(){
        List<Classification> list = classificationService.getAllbooktype();
        String ClassificationJson= JSON.toJSONString(list);
        return ClassificationJson;
    }

    /**
     * 添加用户
     */
    @GetMapping("/addClassification")
    public String addClassification(Classification classification){

        int count = classificationService.addClassification(classification);
        if(count > 0)
            return "ok";
        else
            return "error";
        /*
        Object a = this.findClassificationAll();
//        return "redirect:/classification/showClassification";
        return a;*/
    }

    /**
     * 查询某个用户
     * @param classid
     * @return
     */
    @GetMapping("/getClassificationById")
    public String getClassificationById(Integer classid){
        try{
            System.out.println(classid);
            Classification classification = classificationService.getClassificationById(classid);
            System.out.println(classification);
            String ClassificationJson= JSON.toJSONString(classification);
            return ClassificationJson;
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
    }


    @GetMapping("getClassificationByKeyword")
    public Object getClassificationByKeyword(String btype){
        List<Classification> list = classificationService.getClassificationByKeyword(btype);
        String ClassificationJson= JSON.toJSONString(list);
        return ClassificationJson;
    }

    @GetMapping("/updateClassification")
    public String updateClassification(Classification classification){
        int count = classificationService.updateClassification(classification);
        if(count > 0)
            return "ok";
        else
            return "error";
    }

    @GetMapping("/deleteClassification")
    public String deleteClassification(Integer classid){
        int count = classificationService.deleteClassification(classid);
        if(count > 0)
            return "ok";
        else
            return "error";
    }

}
