package czm.library.controller.user;

import com.alibaba.fastjson.JSON;
import czm.library.pojo.Address;
import czm.library.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private AddressService addressService;

    /**
     * 查询所有地址
     * @return
     */
    @GetMapping("/showAddress")
    public Object findAddressAll(){
        List<Address> list = addressService.showAddress();
        String AddressJson= JSON.toJSONString(list);
        return AddressJson;
/*
        try{
            List<Address> list = addressService.showAddress();
            model.addAttribute("list",list);
            String AddressJson= JSON.toJSONString(list);
            return AddressJson;
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
*/

    }

    /**
     * 添加地址
     */
    @GetMapping("/addAddress")
    public String addAddress(Address address){
        int count = addressService.addAddress(address);
        if(count > 0)
            return "ok";
        else
            return "error";
        /*
        Object a = this.findAddressAll();
//        return "redirect:/address/showAddress";
        return a;*/
    }

    /**
     * 查询某个地址
     * @param aid
     * @return
     */
    @GetMapping("/getAddressByAid")
    public String getAddressByAid(Integer aid){
        try{
            System.out.println(aid);
            Address address = addressService.getAddressByAid(aid);
            System.out.println(address);
            String AddressJson= JSON.toJSONString(address);
            return AddressJson;
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
    }

    @GetMapping("getAddressByUid")
    public Object getAddressByUid(Integer uid){
        List<Address> list = addressService.getAddressByUid(uid);
        String AddressJson= JSON.toJSONString(list);
        return AddressJson;
    }

    @GetMapping("/updateAddress")
    public String updateAddress(Address address){
        int count = addressService.updateAddress(address);
        System.out.println(count);
        if(count > 0)
            return "ok";
        else
            return "error";
    }

    @GetMapping("/deleteAddress")
    public String deleteAddress(Integer aid){
        int count = addressService.deleteAddress(aid);
        if(count > 0)
            return "ok";
        else
            return "error";
    }

}
