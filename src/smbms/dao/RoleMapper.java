package smbms.dao;

import smbms.pojo.Role;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

/**
* Mapper Interface Role
*
* 2014-12-06
*/
public interface RoleMapper {

    public Role getRoleById(@Param(value = "id") Integer id)throws Exception;

    public List<Role> getRoleListByMap(Map<String,Object> param)throws Exception;

	public Integer getRoleRecordCount(Map<String,Object> param)throws Exception;

    public Integer insertRole(Role role)throws Exception;

    public Integer updateRole(Role role)throws Exception;

    public Integer deleteRoleById(@Param(value = "id") Integer id)throws Exception;

}