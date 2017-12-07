package smbms.dao;

import smbms.pojo.User;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

/**
* Mapper Interface User
*
* 2014-12-06
*/
public interface UserMapper {

    public User getUserById(@Param(value = "id") Integer id)throws Exception;

    public List<User> getUserListByMap(Map<String,Object> param)throws Exception;

	public Integer getUserRecordCount(Map<String,Object> param)throws Exception;

    public Integer insertUser(User user)throws Exception;

    public Integer updateUser(User user)throws Exception;

    public Integer deleteUserById(@Param(value = "id") Integer id)throws Exception;

}