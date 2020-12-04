package czm.library.service.impl;

import czm.library.mapper.OrdersMapper;
import czm.library.pojo.Orders;
import czm.library.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户管理业务层
 */
@Service
public class OrdersServiceImpl implements OrdersService {

    @Autowired
    private OrdersMapper orderMapper;

    public int addOrders(Orders order){
        return orderMapper.insert(order);
    }

    @Override
    public List<Orders> showOrders() {
        return orderMapper.selectAllOrders();
    }

    @Override
    public Orders getOrdersByOid(Integer oid) {
        return orderMapper.selectOrdersByOid(oid);
    }

    @Override
    public List<Orders> getOrdersByUid(Integer uid) {
        return orderMapper.selectOrdersByUid(uid);
    }

    @Override
    public Long getmaxOrders(Integer uid) {
        return orderMapper.selectmaxOrders(uid);
    }

    @Override
    public List<Orders> getAllOrders_Detail(Integer uid) {
        return orderMapper.selectAllOrders_Detail(uid);
    }

    @Override
    public Orders getOneOrders_Detail(Orders orders) {
        return orderMapper.selectOneOrders_Detail(orders);
    }

    @Override
    public int deleteOrders(Integer oid) {
        return orderMapper.deleteOrdersByOid(oid);
    }


    @Override
    public int updateOrders(Orders order) {
        return orderMapper.updateOrdersByOid(order);
    }
}
