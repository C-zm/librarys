package czm.library.service;

import czm.library.pojo.OrderDetail;

import java.util.List;

public interface OrderDetailService {
    int addOrderDetail(OrderDetail orderDetail);
    List<OrderDetail> showOrderDetail();
    List<OrderDetail> showOrderDetailLimit(Integer page);
    int deleteOrderDetail(Integer odid);
    int updateOrderDetail(OrderDetail orderDetail);
    OrderDetail getOrderDetailByOdid(Integer odid);
    List<OrderDetail> getOrderDetailByBname(String bname);
    List<OrderDetail> getOrderDetailManageByState(Integer state,Integer page);
    int getOrderDetailCount();
    int getOrderDetailStateCount(Integer state);
}
