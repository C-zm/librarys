package czm.library.mapper;

import czm.library.pojo.Orders;

import java.util.List;

public interface OrdersMapper {

    List<Orders> selectAllOrders();

    int insert(Orders order);

    Orders selectOrdersByOid(Integer oid);

    int updateOrdersByOid(Orders order);

    int deleteOrdersByOid(Integer oid);

    List<Orders> selectOrdersByUid(Integer uid);

    Long selectmaxOrders(Integer uid);

    List<Orders> selectAllOrders_Detail(Integer uid);

    Orders selectOneOrders_Detail(Orders orders);

}