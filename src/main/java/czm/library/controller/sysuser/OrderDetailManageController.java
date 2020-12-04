package czm.library.controller.sysuser;

import com.alibaba.fastjson.JSON;
import czm.library.pojo.OrderDetail;
import czm.library.pojo.Page;
import czm.library.service.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/orderDetail")
public class OrderDetailManageController {

    @Autowired
    private OrderDetailService orderDetailService;

    /**
     * 查询所有用户
     * @return
     */
    @GetMapping("/showOrderDetailManage")
    public Object findOrderDetailManageAll(Model model){
        List<OrderDetail> orderList = orderDetailService.showOrderDetail();
        model.addAttribute("orderList",orderList);
        return "order";
    }


    @GetMapping("/showOrderDetailManageLimit")
    public String findOrderDetailManageLimit(Integer page,Model model){
        List<OrderDetail> orderList = orderDetailService.showOrderDetailLimit((page-1)*10);
        model.addAttribute("orderList",orderList);
        int count = orderDetailService.getOrderDetailCount();
        List<Page> pageList = new ArrayList<>();
        for (int i = 0; i < Math.ceil((float)count/10); i ++){
            String href = "showOrderDetailManageLimit?page=" + (i + 1);
            pageList.add(new Page((i+1),href));
        }
        model.addAttribute("pageList",pageList);
        return "order";
    }

    @GetMapping("/getOrderDetailManageByState")
    public String getOrderDetailManageByState(Integer state,Integer page,Model model){
        List<OrderDetail> orderList = orderDetailService.getOrderDetailManageByState(state,(page-1)*10);
        model.addAttribute("orderList",orderList);
        int count = orderDetailService.getOrderDetailStateCount(state);
        List<Page> pageList = new ArrayList<>();
        for (int i = 0; i < Math.ceil((float)count/10); i ++){
            String href = "getOrderDetailManageByState?state=" + state + "&page=" + (i + 1);
            pageList.add(new Page((i+1),href));
        }
        model.addAttribute("pageList",pageList);
        return "order";
    }


    @GetMapping("/updateOrderDetailManage")
    public String updateOrderDetailManage(OrderDetail orderDetail){
        orderDetailService.updateOrderDetail(orderDetail);
       return "redirect:showOrderDetailManageLimit?page=1";
    }

    @GetMapping("/deleteOrderDetailManage")
    @ResponseBody
    public String deleteOrderDetailManage(Integer odid){
        int count = orderDetailService.deleteOrderDetail(odid);
        if(count > 0)
            return "OK";
        else
            return "error";
    }


    /**
     * 添加用户
     */
    @GetMapping("/addOrderDetailManage")
    public String addOrderDetailManage(OrderDetail orderDetail){

        int count = orderDetailService.addOrderDetail(orderDetail);
        if(count > 0)
            return "ok";
        else
            return "error";
        /*
        Object a = this.findOrderDetailAll();
//        return "redirect:/orderDetail/showOrderDetail";
        return a;*/
    }

    /**
     * 查询某个用户
     * @param odid
     * @return
     */
    @GetMapping("/getOrderDetailManageByOdid")
    @ResponseBody
    public OrderDetail getOrderDetailManageByOdid(Integer odid){
        OrderDetail orderDetail = orderDetailService.getOrderDetailByOdid(odid);
        return orderDetail;
    }


    @GetMapping("getOrderDetailManageByBname")
    public Object getOrderDetailManageByBname(String bname){
        List<OrderDetail> list = orderDetailService.getOrderDetailByBname(bname);
        String OrderDetailJson= JSON.toJSONString(list);
        return OrderDetailJson;
    }



}
