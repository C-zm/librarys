package czm.library.service.impl;

import czm.library.mapper.ShoppingcarMapper;
import czm.library.pojo.Shoppingcar;
import czm.library.service.ShoppingcarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户管理业务层
 */
@Service
public class ShoppingcarServiceImpl implements ShoppingcarService {

    @Autowired
    private ShoppingcarMapper shoppingcar;

    public int addShoppingcar(Shoppingcar user){
        return shoppingcar.insert(user);
    }

    @Override
    public List<Shoppingcar> showShoppingcar() {
        return shoppingcar.selectAllShoppingcar();
    }

    @Override
    public Shoppingcar getShoppingcarBySid(Integer sid) {
        System.out.println(shoppingcar.selectShoppingcarBySid(sid));
        return shoppingcar.selectShoppingcarBySid(sid);
    }

    @Override
    public List<Shoppingcar> getShoppingcarByUid(Integer uid) {
        return shoppingcar.selectShoppingcarByUid(uid);
    }

    @Override
    public List<Shoppingcar> getAllbookShoppingcar(Integer uid) {
        return shoppingcar.selectAllbookShoppingcar(uid);
    }

    @Override
    public int deleteShoppingcar(Integer sid) {
        return shoppingcar.deleteShoppingcarBySid(sid);
    }


    @Override
    public int updateShoppingcar(Shoppingcar user) {
        return shoppingcar.updateShoppingcarBySid(user);
    }
}
