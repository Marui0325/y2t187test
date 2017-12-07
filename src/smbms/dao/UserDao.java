package smbms.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import smbms.pojo.User;


@Repository
public class UserDao {

	@Resource
	private JdbcTemplate template;

	private RowMapper<User> rowMapper = new RowMapper<User>() {
		@Override
		public User mapRow(ResultSet rs, int index) throws SQLException {
			User user = new User();
			user.setId(rs.getInt("id"));
			user.setUserName(rs.getString("username"));
			user.setUserCode(rs.getString("usercode"));
			user.setUserPassword(rs.getString("userpassword"));
			user.setBirthday(rs.getDate("birthday"));
			user.setGender(rs.getInt("gender"));
			user.setPhone(rs.getString("phone"));
			user.setUserRoleName(rs.getString("rolename"));
			return user;
		}
	};
    //��¼
	private RowMapper<User> lists = new RowMapper<User>() {
		@Override
		public User mapRow(ResultSet rs, int index) throws SQLException {
			User user = new User();
			user.setId(rs.getInt("id"));
			user.setUserName(rs.getString("username"));
			user.setUserCode(rs.getString("usercode"));
			user.setUserPassword(rs.getString("userpassword"));
			return user;
		}
	};

	// ��¼
	public User searchUserByName(String name) {
		String sql = "SELECT id,userName,userCode,userPassword FROM smbms_user WHERE userCode=?";
		User user = template.queryForObject(sql, lists, name);
		return user;
	}

	// �б�
	public List<User> findUsers() {
		String sql = "SELECT U.id,usercode,userpassword,username,gender,birthday,phone,rolename FROM smbms_user U,smbms_role R WHERE U.userRole=R.id";
		return template.query(sql, rowMapper);
	}


	/*
	 * class UserRowMapper implements RowMapper<User>{
	 * 
	 * @Override public User mapRow(ResultSet rs, int index) throws SQLException
	 * {
	 * 
	 * User user=new User(); user.setId(rs.getInt(1));
	 * user.setUserName(rs.getString(2)); user.setUserCode(rs.getString(3));
	 * user.setUserPassword(rs.getString(4)); return user; } }
	 */

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		UserDao dao = (UserDao) ctx.getBean("userDao");
		User user = dao.searchUserByName("zhaoyan");
		System.out.println(user.getUserName() + "\t" + user.getUserPassword());
	}

	public int addUser(User reguser) {
		String sql = "INSERT INTO smbms_user(userCode,userName,userPassword,"
				+ "gender,birthday,phone,address,userRole)"
				+ "VALUES(?,?,?,?,?,?,?,?,?)";
		return template.update(sql, reguser.getUserCode(),
				reguser.getUserName(), reguser.getUserPassword(),
				reguser.getGender(), reguser.getBirthday(), reguser.getPhone(),
				reguser.getAddress(), reguser.getUserRole(),
				reguser.getIdPicPath());
	}
}
