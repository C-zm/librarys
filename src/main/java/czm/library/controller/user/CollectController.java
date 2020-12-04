package czm.library.controller.user;

import com.alibaba.fastjson.JSON;
import czm.library.pojo.Collect;
import czm.library.service.CollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/collect")
public class CollectController {

    @Autowired
    private CollectService collectService;

    /**
     * 查询所有用户
     * @return
     */
    @GetMapping("/showCollect")
    public Object findCollectAll(){
        List<Collect> list = collectService.showCollect();
        String CollectJson= JSON.toJSONString(list);
        return CollectJson;
    }

    /**
     * 添加用户
     */
    @GetMapping("/addCollect")
    public String addCollect(Collect collect){

        int count = collectService.addCollect(collect);
        if(count > 0)
            return "ok";
        else
            return "error";
        /*
        Object a = this.findCollectAll();
//        return "redirect:/collect/showCollect";
        return a;*/
    }

    /**
     * 查询某个用户
     * @param uid
     * @return
     */
    @GetMapping("/getCollectByUid")
    public String getCollectByUid(Integer uid){
        try{
            System.out.println(uid);
            List<Collect> collect = collectService.getCollectByUid(uid);
            System.out.println(collect);
            String CollectJson= JSON.toJSONString(collect);
            return CollectJson;
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
    }

    @GetMapping("/getCollectByUidBid")
    public String getCollectByUidBid(Collect collect){
        try{
            List<Collect> list = collectService.getCollectByUidBid(collect);
            System.out.println(collect);
            String CollectJson= JSON.toJSONString(list);
            return CollectJson;
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
    }

    @GetMapping("/getCollectBookByUid")
    public String getCollectBookByUid(Integer uid){
        try{
            System.out.println(uid);
            List<Collect> collect = collectService.getCollectBookByUid(uid);
            System.out.println(collect);
            String CollectJson= JSON.toJSONString(collect);
            return CollectJson;
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
    }


    @GetMapping("getCollectByBname")
    public Object getCollectByBname(String bname){
        List<Collect> list = collectService.getCollectByBname(bname);
        String CollectJson= JSON.toJSONString(list);
        return CollectJson;
    }


    @GetMapping("/deleteCollect")
    public String deleteCollect(Integer colid){
        int count = collectService.deleteCollect(colid);
        if(count > 0)
            return "ok";
        else
            return "error";
    }

}
