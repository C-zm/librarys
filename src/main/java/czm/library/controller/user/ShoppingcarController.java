package czm.library.controller.user;

import com.alibaba.fastjson.JSON;
import czm.library.pojo.Shoppingcar;
import czm.library.service.ShoppingcarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/shoppingcar")
public class ShoppingcarController {

    @Autowired
    private ShoppingcarService shoppingcarService;

    /**
     * 查询所有用户
     * @return
     */
    @GetMapping("/showShoppingcar")
    public Object findShoppingcarAll(){
        List<Shoppingcar> list = shoppingcarService.showShoppingcar();
        String ShoppingcarJson= JSON.toJSONString(list);
        return ShoppingcarJson;
    }

    /**
     * 添加用户
     */
    @GetMapping("/addShoppingcar")
    public String addShoppingcar(Shoppingcar shoppingcar){

        int count = shoppingcarService.addShoppingcar(shoppingcar);
        if(count > 0)
            return "ok";
        else
            return "error";
        /*
        Object a = this.findShoppingcarAll();
//        return "redirect:/shoppingcar/showShoppingcar";
        return a;*/
    }

    /**
     * 查询某个用户
     * @param sid
     * @return
     */
    @GetMapping("/getShoppingcarBySid")
    public String getShoppingcarBySid(Integer sid){
        try{
            System.out.println(sid);
            Shoppingcar shoppingcar = shoppingcarService.getShoppingcarBySid(sid);
            System.out.println(shoppingcar);
            String ShoppingcarJson= JSON.toJSONString(shoppingcar);
            return ShoppingcarJson;
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
    }


    @GetMapping("getShoppingcarByUid")
    public Object getShoppingcarByUid(Integer uid){
        List<Shoppingcar> list = shoppingcarService.getShoppingcarByUid(uid);
        String ShoppingcarJson= JSON.toJSONString(list);
        return ShoppingcarJson;
    }

    @GetMapping("/updateShoppingcar")
    public String updateShoppingcar(Shoppingcar shoppingcar){
        int count = shoppingcarService.updateShoppingcar(shoppingcar);
        if(count > 0)
            return "ok";
        else
            return "error";
    }

    @GetMapping("/deleteShoppingcar")
    public String deleteShoppingcar(Integer sid){
        int count = shoppingcarService.deleteShoppingcar(sid);
        if(count > 0)
            return "ok";
        else
            return "error";
    }

    @GetMapping("getAllbookShoppingcar")
    public Object getAllbookShoppingcar(Integer uid){
        List<Shoppingcar> list = shoppingcarService.getAllbookShoppingcar(uid);
        String ShoppingcarJson= JSON.toJSONString(list);
        return ShoppingcarJson;
    }
}
