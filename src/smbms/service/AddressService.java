package smbms.service;

import smbms.pojo.Address;
import java.util.List;
import java.util.Map;

/**
* Service Interface Address
*
* 2014-12-06
*/
public interface AddressService {

    /**
     * 通过主键Id查询Address
     */
    public Address getAddressById(Integer id)throws Exception;

    /**
     * 通过条件Map集合查询Address
     */
    public List<Address> getAddressListByMap(Map<String,Object> param)throws Exception;

	/**
	 * 通过条件Map集合查询Address记录总数
	 */
	public Integer getAddressRecCountByMap(Map<String,Object> param)throws Exception;

    /**
     * 添加Address新记录
     */
    public Integer insertAddress(Address address)throws Exception;

    /**
      * 更新Address记录
      */
    public Integer updateAddress(Address address)throws Exception;

    /**
      * 通过主键Id删除Address
      */
    public Integer deleteAddressById(Integer id)throws Exception;

}