package czm.library.service.impl;

import czm.library.mapper.AddressMapper;
import czm.library.pojo.Address;
import czm.library.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户管理业务层
 */
@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressMapper addressMapper;

    public int addAddress(Address address){
        return addressMapper.insert(address);
    }

    @Override
    public List<Address> showAddress() {
        return addressMapper.selectAllAddress();
    }

    @Override
    public Address getAddressByAid(Integer aid) {
        return addressMapper.selectAddressByAid(aid);
    }

    @Override
    public List<Address> getAddressByUid(Integer uid) {
        return addressMapper.selectAddressByUid(uid);
    }

    @Override
    public int deleteAddress(Integer aid) {
        return addressMapper.deleteAddressByAid(aid);
    }


    @Override
    public int updateAddress(Address address) {
        return addressMapper.updateAddressById(address);
    }
}
