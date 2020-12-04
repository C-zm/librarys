package czm.library.mapper;

import czm.library.pojo.Shoppingcar;

import java.util.List;

public interface ShoppingcarMapper {

    List<Shoppingcar> selectAllShoppingcar();

    int insert(Shoppingcar shoppingcar);

    Shoppingcar selectShoppingcarBySid(Integer sid);

    List<Shoppingcar> selectShoppingcarByUid(Integer uid);

    int updateShoppingcarBySid(Shoppingcar shoppingcar);

    int deleteShoppingcarBySid(Integer sid);

    List<Shoppingcar> selectAllbookShoppingcar(Integer uid);

}