package czm.library.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@ResponseBody
public class tryController {
    @GetMapping("/ok")
    public String ok(){
        System.out.println("ok");
        System.out.println("ok");
        return "ok";
    }

    @GetMapping("success")
    public String success(Model model){
        model.addAttribute("msg","wxzcacasknj");
        return "success";
    }

    @GetMapping("/test")
    public String test(Model model){
        model.addAttribute("msg","wxzcacasknj");
        return "tedd";
    }
}
