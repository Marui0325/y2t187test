package smbms.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import smbms.dao.UserMapper;
import smbms.pojo.User;

/**
* Service Class User
*
* 2014-12-06
*/

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;
    
    // 用户登录
 	public User login(String userCode, String userPassword){
 		try {
 			// 从DB中查询指定name用户记录是否存在
 			HashMap<String, Object> param = new HashMap<String, Object>();
 			param.put("userCode", userCode);
 			List<User> users = userMapper.getUserListByMap(param);
 			if(users.size() > 0){
 				User user = users.get(0);
 				// 如果用户存在，以为符合name条件记录是存在，进一步验证密码
 				if(user != null && user.getUserpassword().equals(userPassword)){
 					return user;
 				}
 			}
 		} catch (Exception e) {
 			e.printStackTrace();
 			throw new RuntimeException("用户登录数据查询发生了问题！" + e.getMessage());
 		}	
 		return null;
 	}

    @Transactional(readOnly = true)
    public User getUserById(Integer id)throws Exception{
        return userMapper.getUserById(id);
    }

    // 用户列表
    @Transactional(readOnly = true)
    public List<User> getUserListByMap(Map<String,Object> param)throws Exception {
        return userMapper.getUserListByMap(param);
    }
    
    @Transactional(readOnly = true)
    public Integer getUserRecCountByMap(Map<String,Object> param)throws Exception {
    	return userMapper.getUserRecordCount(param);
    }
    
    // 用户注册
    public Integer insertUser(User user)throws Exception {
        return userMapper.insertUser(user);
    }

    public Integer updateUser(User user)throws Exception {
        return userMapper.updateUser(user);
    }

    public Integer deleteUserById(Integer id)throws Exception {
        return userMapper.deleteUserById(id);
    }

}