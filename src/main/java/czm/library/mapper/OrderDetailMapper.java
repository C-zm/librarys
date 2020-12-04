package czm.library.mapper;

import czm.library.pojo.OrderDetail;

import java.util.List;

public interface OrderDetailMapper {

    List<OrderDetail> selectAllOrderDetail();

    int insert(OrderDetail orderDetail);

    OrderDetail selectOrderDetailByOdid(Integer odid);

    int updateOrderDetailByOdid(OrderDetail orderDetail);

    int deleteOrderDetailByOdid(Integer odid);

    List<OrderDetail> selectOrderDetailByBname(String bname);

    List<OrderDetail> selectOrderDetailLimit(Integer page);

    List<OrderDetail> selectOrderDetailManageByState(Integer state,Integer page);

    int selectOrderDetailCount();

    int getOrderDetailStateCount(Integer state);
}