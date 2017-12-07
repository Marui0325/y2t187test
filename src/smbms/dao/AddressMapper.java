package smbms.dao;

import smbms.pojo.Address;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

/**
* Mapper Interface Address
*
* 2014-12-06
*/
public interface AddressMapper {

    public Address getAddressById(@Param(value = "id") Integer id)throws Exception;

    public List<Address> getAddressListByMap(Map<String,Object> param)throws Exception;

	public Integer getAddressRecordCount(Map<String,Object> param)throws Exception;

    public Integer insertAddress(Address address)throws Exception;

    public Integer updateAddress(Address address)throws Exception;

    public Integer deleteAddressById(@Param(value = "id") Integer id)throws Exception;

}