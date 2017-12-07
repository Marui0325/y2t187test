package smbms.service;

import smbms.pojo.User;

import java.util.List;
import java.util.Map;

/**
* Service Interface User
*
* 2014-12-06
*/
public interface UserService {

    /**
     * 通过主键Id查询User
     */
    public User getUserById(Integer id)throws Exception;
    
    /**
     * 用户登录
     * @param userCode
     * @param userPassword
     * @return
     */
    public User login(String userCode, String userPassword);

    /**
     * 通过条件Map集合查询User
     */
    public List<User> getUserListByMap(Map<String,Object> param)throws Exception;

	/**
	 * 通过条件Map集合查询User记录总数
	 */
	public Integer getUserRecCountByMap(Map<String,Object> param)throws Exception;

    /**
     * 添加User新记录
     */
    public Integer insertUser(User user)throws Exception;

    /**
      * 更新User记录
      */
    public Integer updateUser(User user)throws Exception;

    /**
      * 通过主键Id删除User
      */
    public Integer deleteUserById(Integer id)throws Exception;

}