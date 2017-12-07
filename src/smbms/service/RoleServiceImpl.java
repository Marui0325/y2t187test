package smbms.service;

import smbms.pojo.Role;
import smbms.dao.RoleMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
* Service Class Role
*
* 2014-12-06
*/

@Service
@Transactional
public class RoleServiceImpl implements RoleService {

    @Resource
    private RoleMapper roleMapper;

    @Transactional(readOnly = true)
    public Role getRoleById(Integer id)throws Exception{
        return roleMapper.getRoleById(id);
    }

    @Transactional(readOnly = true)
    public List<Role> getRoleListByMap(Map<String,Object> param)throws Exception {
        return roleMapper.getRoleListByMap(param);
    }
    
    @Transactional(readOnly = true)
    public Integer getRoleRecCountByMap(Map<String,Object> param)throws Exception {
    	return roleMapper.getRoleRecordCount(param);
    }
    

    public Integer insertRole(Role role)throws Exception {
        return roleMapper.insertRole(role);
    }

    public Integer updateRole(Role role)throws Exception {
        return roleMapper.updateRole(role);
    }

    public Integer deleteRoleById(Integer id)throws Exception {
        return roleMapper.deleteRoleById(id);
    }

}