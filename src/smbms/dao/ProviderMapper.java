package smbms.dao;

import smbms.pojo.Provider;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

/**
* Mapper Interface Provider
*
* 2014-12-06
*/
public interface ProviderMapper {

    public Provider getProviderById(@Param(value = "id") Integer id)throws Exception;

    public List<Provider> getProviderListByMap(Map<String,Object> param)throws Exception;

	public Integer getProviderRecordCount(Map<String,Object> param)throws Exception;

    public Integer insertProvider(Provider provider)throws Exception;

    public Integer updateProvider(Provider provider)throws Exception;

    public Integer deleteProviderById(@Param(value = "id") Integer id)throws Exception;

}