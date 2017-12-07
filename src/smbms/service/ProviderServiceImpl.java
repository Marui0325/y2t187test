package smbms.service;

import smbms.pojo.Provider;
import smbms.dao.ProviderMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
* Service Class Provider
*
* 2014-12-06
*/

@Service
@Transactional
public class ProviderServiceImpl implements ProviderService {

    @Resource
    private ProviderMapper providerMapper;

    @Transactional(readOnly = true)
    public Provider getProviderById(Integer id)throws Exception{
        return providerMapper.getProviderById(id);
    }

    @Transactional(readOnly = true)
    public List<Provider> getProviderListByMap(Map<String,Object> param)throws Exception {
        return providerMapper.getProviderListByMap(param);
    }
    
    @Transactional(readOnly = true)
    public Integer getProviderRecCountByMap(Map<String,Object> param)throws Exception {
    	return providerMapper.getProviderRecordCount(param);
    }
    

    public Integer insertProvider(Provider provider)throws Exception {
        return providerMapper.insertProvider(provider);
    }

    public Integer updateProvider(Provider provider)throws Exception {
        return providerMapper.updateProvider(provider);
    }

    public Integer deleteProviderById(Integer id)throws Exception {
        return providerMapper.deleteProviderById(id);
    }

}