package czm.library.controller.sysuser;
import czm.library.pojo.Sysuser;
import czm.library.service.SysuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/sysuser")
public class SysusersController {

    @Autowired
    private SysuserService sysuserService;


    /**
     * 登录界面
     * @return
     */
    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/submitLogin")
    public String submitLogin(Sysuser sysuser, HttpSession session){
        Sysuser sysuser1 = sysuserService.getSysuserBySysname(sysuser.getSysname());
        if( sysuser1 != null && sysuser1.getSyspassword().equals(sysuser.getSyspassword())){
            session.setAttribute("sysuser",sysuser1);
            session.setAttribute("errmessage","");
            return "redirect:../index";
        }
        else {
            session.setAttribute("errmessage","用户名不存在或密码错误,请重新输入！！");
            return "redirect:login";
        }
    }

    @RequestMapping("/loginout")
    public String loginout(HttpSession session) {
        session.setAttribute("sysuser",null);
        return "login";
    }

    /**
     * 查询所有系统管理员用户
     * @return
     */
    @GetMapping("/showSysuser")
    public Object findSysuserAll(Model model){
        List<Sysuser> sysuserList = sysuserService.showSysuser();
        model.addAttribute("sysuserList",sysuserList);
        return "sysuser";
    }

    @GetMapping("/getSysuserByPower")
    public Object getSysuserByPower(Integer power,Model model){
        List<Sysuser> sysuserList = sysuserService.getSysuserByPower(power);
        model.addAttribute("sysuserList",sysuserList);
        return "sysuser";
    }


    @GetMapping("/deleteSysuser")
    @ResponseBody
    public String deleteSysuser(Integer sysid){
        int count = sysuserService.deleteSysuser(sysid);
        if(count > 0)
            return "OK";
        else
            return "error";
    }

    /**
     * 添加用户
     */
    @GetMapping("/addSysuser")
    public String addSysuser(Sysuser sysuser){

        int count = sysuserService.addSysuser(sysuser);
        if(count > 0)
            return "ok";
        else
            return "error";
        /*
        Object a = this.findSysuserAll();
//        return "redirect:/sysuser/showSysuser";
        return a;*/
    }

    /**
     * 查询某个用户
     * @param sysid
     * @return
     */
    @GetMapping("/getSysuserById")
    @ResponseBody
    public Sysuser getSysuserById(Integer sysid){
        Sysuser sysuser = sysuserService.getSysuserById(sysid);
        return sysuser;
    }


    @GetMapping("getSysuserByKeyword")
    public List<Sysuser> getSysuserByKeyword(String sysname){
        List<Sysuser> list = sysuserService.getSysuserByKeyword(sysname);
        return list;
    }

    @GetMapping("/updateSysuser")
    public String updateSysuser(Sysuser sysuser){
        sysuserService.updateSysuser(sysuser);
        return "redirect:showSysuser";
    }


}
