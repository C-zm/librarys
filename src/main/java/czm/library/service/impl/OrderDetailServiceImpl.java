package czm.library.service.impl;

import czm.library.mapper.OrderDetailMapper;
import czm.library.pojo.OrderDetail;
import czm.library.service.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户管理业务层
 */
@Service
public class OrderDetailServiceImpl implements OrderDetailService {

    @Autowired
    private OrderDetailMapper orderDetailMapper;

    public int addOrderDetail(OrderDetail orderDetail){
        return orderDetailMapper.insert(orderDetail);
    }

    @Override
    public List<OrderDetail> showOrderDetail() {
        return orderDetailMapper.selectAllOrderDetail();
    }

    @Override
    public List<OrderDetail> showOrderDetailLimit(Integer page) {
        return orderDetailMapper.selectOrderDetailLimit(page);
    }

    @Override
    public OrderDetail getOrderDetailByOdid(Integer odid) {
        System.out.println(orderDetailMapper.selectOrderDetailByOdid(odid));
        return orderDetailMapper.selectOrderDetailByOdid(odid);
    }

    @Override
    public List<OrderDetail> getOrderDetailByBname(String bname) {
        return orderDetailMapper.selectOrderDetailByBname(bname);
    }

    @Override
    public List<OrderDetail> getOrderDetailManageByState(Integer state,Integer page) {
        return orderDetailMapper.selectOrderDetailManageByState(state,page);
    }

    @Override
    public int getOrderDetailCount() {
        return orderDetailMapper.selectOrderDetailCount();
    }

    @Override
    public int getOrderDetailStateCount(Integer state) {
        return orderDetailMapper.getOrderDetailStateCount(state);
    }

    @Override
    public int deleteOrderDetail(Integer odid) {
        return orderDetailMapper.deleteOrderDetailByOdid(odid);
    }


    @Override
    public int updateOrderDetail(OrderDetail orderDetail) {
        return orderDetailMapper.updateOrderDetailByOdid(orderDetail);
    }
}
