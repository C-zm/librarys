package czm.library.controller.user;

import com.alibaba.fastjson.JSON;
import czm.library.pojo.Orders;
import czm.library.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrdersController {

    @Autowired
    private OrdersService orderService;

    /**
     * 查询所有用户
     * @return
     */
    @GetMapping("/showOrders")
    public Object findOrdersAll(){
        List<Orders> list = orderService.showOrders();
        String OrdersJson= JSON.toJSONString(list);
        return OrdersJson;
/*
        try{
            List<Orders> list = orderService.showOrders();
            model.addAttribute("list",list);
            String OrdersJson= JSON.toJSONString(list);
            return OrdersJson;
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
*/

    }

    /**
     * 添加用户
     */
    @GetMapping("/addOrders")
    public String addOrders(Orders order){

        int count = orderService.addOrders(order);
        if(count > 0)
            return "ok";
        else
            return "error";
        /*
        Object a = this.findOrdersAll();
//        return "redirect:/order/showOrders";
        return a;*/
    }

    /**
     * 查询某个用户
     * @param oid
     * @return
     */
    @GetMapping("/getOrdersByOid")
    public String getOrdersByOid(Integer oid){
        try{
            System.out.println(oid);
            Orders order = orderService.getOrdersByOid(oid);
            String OrdersJson= JSON.toJSONString(order);
            return OrdersJson;
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
    }

    @GetMapping("getOrdersByUid")
    public Object getOrdersByUid(Integer uid){
        List<Orders> list = orderService.getOrdersByUid(uid);
        String OrdersJson= JSON.toJSONString(list);
        return OrdersJson;
    }

    @GetMapping("/updateOrders")
    public String updateOrders(Orders order){
        int count = orderService.updateOrders(order);
        if(count > 0)
            return "ok";
        else
            return "error";
    }

    @GetMapping("/deleteOrders")
    public String deleteOrders(Integer oid){
        int count = orderService.deleteOrders(oid);
        if(count > 0)
            return "ok";
        else
            return "error";
    }

    @GetMapping("/getmaxOrders")
    public Long getmaxOrders(Integer uid){
        return orderService.getmaxOrders(uid);
    }

    @GetMapping("/getAllOrders_Detail")
    public Object getAllOrders_Detail(Integer uid){
        List<Orders> ordersList = orderService.getAllOrders_Detail(uid);
        String OrdersJson= JSON.toJSONString(ordersList);
        return OrdersJson;
    }


    @GetMapping("/getOneOrders_Detail")
    public Object getOneOrders_Detail(Orders orders){
        Orders ordersList = orderService.getOneOrders_Detail(orders);
        String OrdersJson= JSON.toJSONString(ordersList);
        return OrdersJson;
    }
}
