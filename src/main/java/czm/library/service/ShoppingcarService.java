package czm.library.service;

import czm.library.pojo.Shoppingcar;

import java.util.List;

public interface ShoppingcarService {
    int addShoppingcar(Shoppingcar shoppingcar);
    List<Shoppingcar> showShoppingcar();
    int deleteShoppingcar(Integer sid);
    int updateShoppingcar(Shoppingcar shoppingcar);
    Shoppingcar getShoppingcarBySid(Integer sid);
    List<Shoppingcar> getShoppingcarByUid(Integer uid);
    List<Shoppingcar> getAllbookShoppingcar(Integer uid);
}
