package czm.library.service;

import czm.library.pojo.Orders;

import java.util.List;

public interface OrdersService {
    int addOrders(Orders order);
    List<Orders> showOrders();
    int deleteOrders(Integer oid);
    int updateOrders(Orders order);
    Orders getOrdersByOid(Integer oid);
    List<Orders> getOrdersByUid(Integer uid);
    Long getmaxOrders(Integer uid);
    List<Orders> getAllOrders_Detail(Integer uid);
    Orders getOneOrders_Detail(Orders orders);
}
