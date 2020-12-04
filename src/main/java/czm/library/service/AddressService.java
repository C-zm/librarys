package czm.library.service;

import czm.library.pojo.Address;

import java.util.List;

public interface AddressService {
    int addAddress(Address address);
    List<Address> showAddress();
    int deleteAddress(Integer aid);
    int updateAddress(Address address);
    Address getAddressByAid(Integer aid);
    List<Address> getAddressByUid(Integer uid);
}
