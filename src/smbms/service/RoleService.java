package smbms.service;

import smbms.pojo.Role;
import java.util.List;
import java.util.Map;

/**
* Service Interface Role
*
* 2014-12-06
*/
public interface RoleService {

    /**
     * 通过主键Id查询Role
     */
    public Role getRoleById(Integer id)throws Exception;

    /**
     * 通过条件Map集合查询Role
     */
    public List<Role> getRoleListByMap(Map<String,Object> param)throws Exception;

	/**
	 * 通过条件Map集合查询Role记录总数
	 */
	public Integer getRoleRecCountByMap(Map<String,Object> param)throws Exception;

    /**
     * 添加Role新记录
     */
    public Integer insertRole(Role role)throws Exception;

    /**
      * 更新Role记录
      */
    public Integer updateRole(Role role)throws Exception;

    /**
      * 通过主键Id删除Role
      */
    public Integer deleteRoleById(Integer id)throws Exception;

}