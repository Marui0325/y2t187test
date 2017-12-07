package smbms.service;

import smbms.pojo.Address;
import smbms.dao.AddressMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
* Service Class Address
*
* 2014-12-06
*/

@Service
@Transactional
public class AddressServiceImpl implements AddressService {

    @Resource
    private AddressMapper addressMapper;

    @Transactional(readOnly = true)
    public Address getAddressById(Integer id)throws Exception{
        return addressMapper.getAddressById(id);
    }

    @Transactional(readOnly = true)
    public List<Address> getAddressListByMap(Map<String,Object> param)throws Exception {
        return addressMapper.getAddressListByMap(param);
    }
    
    @Transactional(readOnly = true)
    public Integer getAddressRecCountByMap(Map<String,Object> param)throws Exception {
    	return addressMapper.getAddressRecordCount(param);
    }
    

    public Integer insertAddress(Address address)throws Exception {
        return addressMapper.insertAddress(address);
    }

    public Integer updateAddress(Address address)throws Exception {
        return addressMapper.updateAddress(address);
    }

    public Integer deleteAddressById(Integer id)throws Exception {
        return addressMapper.deleteAddressById(id);
    }

}