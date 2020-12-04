package czm.library.controller.sysuser;

import com.alibaba.fastjson.JSON;
import czm.library.pojo.Swiper;
import czm.library.service.SwiperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/swiper")
public class SwiperController {

    @Autowired
    private SwiperService swiperService;

    /**
     * 查询所有用户
     * @return
     */
    @GetMapping("/showSwiper")
    @ResponseBody
    public Object findSwiperAll(){
        List<Swiper> list = swiperService.showSwiper();
        String SwiperJson= JSON.toJSONString(list);
        return SwiperJson;
    }

    @GetMapping("/showSwiperManage")
    public String findSwiperManageAll(Model model){
        List<Swiper> swiperList = swiperService.showSwiper();
        model.addAttribute("swiperList",swiperList);
        return "swiper";
    }

    @GetMapping("/getSwiperManageBySwiperid")
    @ResponseBody
    public Swiper getSwiperManageBySwiperid(Integer swiperid){
        Swiper swiper = swiperService.getSwiperBySwiperid(swiperid);
        return swiper;

    }


    @GetMapping("/updateSwiperManage")
    public String updateSwiperManage(Swiper swiper){
        swiperService.updateSwiper(swiper);
       return "redirect:showSwiperManage";
    }

    /**
     * 添加用户
     */
    @GetMapping("/addSwiperManage")
    public String addSwiperManage(Swiper swiper){

        int count = swiperService.addSwiper(swiper);
        if(count > 0)
            return "ok";
        else
            return "error";
        /*
        Object a = this.findSwiperAll();
//        return "redirect:/swiper/showSwiper";
        return a;*/
    }

    /**
     * 查询某个用户
     * @param swiperid
     * @return
     */


    @GetMapping("getSwiperManageByBid")
    public Object getSwiperManageByBid(Integer bid){
        List<Swiper> list = swiperService.getSwiperByBid(bid);
        String SwiperJson= JSON.toJSONString(list);
        return SwiperJson;
    }


    @GetMapping("/deleteSwiperManage")
    @ResponseBody
    public String deleteSwiperManage(Integer swiperid){
        int count = swiperService.deleteSwiper(swiperid);
        if(count > 0)
            return "OK";
        else
            return "error";
    }

}
