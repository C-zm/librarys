package czm.library.mapper;

import czm.library.pojo.Address;

import java.util.List;

public interface AddressMapper {

    List<Address> selectAllAddress();

    int insert(Address user);

    Address selectAddressByAid(Integer aid);

    int updateAddressById(Address user);

    int deleteAddressByAid(Integer aid);

    List<Address> selectAddressByUid(Integer uid);
}