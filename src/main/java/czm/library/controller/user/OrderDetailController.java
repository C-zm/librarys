package czm.library.controller.user;

import com.alibaba.fastjson.JSON;
import czm.library.pojo.OrderDetail;
import czm.library.service.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/orderDetail")
public class OrderDetailController {

    @Autowired
    private OrderDetailService orderDetailService;

    /**
     * 查询所有用户
     * @return
     */
    @GetMapping("/showOrderDetail")
    public Object findOrderDetailAll(){
        List<OrderDetail> list = orderDetailService.showOrderDetail();
        String OrderDetailJson= JSON.toJSONString(list);
        return OrderDetailJson;
/*
        try{
            List<OrderDetail> list = orderDetailService.showOrderDetail();
            model.addAttribute("list",list);
            String OrderDetailJson= JSON.toJSONString(list);
            return OrderDetailJson;
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
*/

    }

    /**
     * 添加用户
     */
    @GetMapping("/addOrderDetail")
    public String addOrderDetail(OrderDetail orderDetail){

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
    @GetMapping("/getOrderDetailByOdid")
    public String getOrderDetailByOdid(Integer odid){
        try{
            System.out.println(odid);
            OrderDetail orderDetail = orderDetailService.getOrderDetailByOdid(odid);
            System.out.println(orderDetail);
            String OrderDetailJson= JSON.toJSONString(orderDetail);
            return OrderDetailJson;
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
    }


    @GetMapping("getOrderDetailByBname")
    public Object getOrderDetailByBname(String bname){
        List<OrderDetail> list = orderDetailService.getOrderDetailByBname(bname);
        String OrderDetailJson= JSON.toJSONString(list);
        return OrderDetailJson;
    }

    @GetMapping("/updateOrderDetail")
    public String updateOrderDetail(OrderDetail orderDetail){
        int count = orderDetailService.updateOrderDetail(orderDetail);
        if(count > 0)
            return "ok";
        else
            return "error";
    }

    @GetMapping("/deleteOrderDetail")
    public String deleteOrderDetail(Integer odid){
        int count = orderDetailService.deleteOrderDetail(odid);
        if(count > 0)
            return "ok";
        else
            return "error";
    }

}
