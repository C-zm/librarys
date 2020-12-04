package czm.library.controller.user;

import com.alibaba.fastjson.JSON;
import czm.library.pojo.User;
import czm.library.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 查询所有用户
     * @return
     */
    @GetMapping("/showUser")
    public Object findUserAll(){
        List<User> list = userService.showUser();
        String UserJson= JSON.toJSONString(list);
        return UserJson;
    }

    /**
     * 添加用户
     */
    @GetMapping("/addUser")
    public String addUser(User user){

        int count = userService.addUser(user);
        if(count > 0)
            return "ok";
        else
            return "error";
        /*
        Object a = this.findUserAll();
//        return "redirect:/user/showUser";
        return a;*/
    }

    @GetMapping("/getUserByOpenid")
    public String getUserByOpenid(String openid){
        try{
            User user = userService.getUserByOpenid(openid);
            String UserJson= JSON.toJSONString(user);
            return UserJson;
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
    }

    /**
     * 查询某个用户
     * @param uid
     * @return
     */
    @GetMapping("/getUserByUid")
    public String getUserByUid(Integer uid){
        try{
            System.out.println(uid);
            User user = userService.getUserByUid(uid);
            System.out.println(user);
            String UserJson= JSON.toJSONString(user);
            return UserJson;
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
    }


    @GetMapping("getUserByUname")
    public Object getUserByUname(String uname){
        List<User> list = userService.getUserByUname(uname);
        String UserJson= JSON.toJSONString(list);
        return UserJson;
    }

    @GetMapping("/updateUser")
    public String updateUser(User user){
        int count = userService.updateUser(user);
        if(count > 0)
            return "ok";
        else
            return "error";
    }

    @GetMapping("/deleteUser")
    public String deleteUser(Integer uid){
        int count = userService.deleteUser(uid);
        if(count > 0)
            return "ok";
        else
            return "error";
    }

}
