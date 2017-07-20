/**
 * 
 */
package chinaren.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import chinaren.model.Result;
import chinaren.model.User;

/**
 * @ClassName UserDaoImpl
 * @Description 用户数据持久层实现类
 * @author 李浩然
 * @date 2017年7月20日
 * @version 1.0
 */
public class UserDaoImpl extends BaseDao implements UserDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private Logger logger = Logger.getLogger(UserDaoImpl.class);
	
	/**
	 * 构造函数
	 */
	public UserDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see chinaren.dao.UserDao#selectUserByUserId(long)
	 */
	@Override
	public Result<User> selectUserByUserId(long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see chinaren.dao.UserDao#selectUserByEmail(java.lang.String)
	 */
	@Override
	public Result<User> selectUserByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see chinaren.dao.UserDao#selectUsersByClassId(long)
	 */
	@Override
	public Result<List<User>> selectUsersByClassId(long classId) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see chinaren.dao.UserDao#insertUser(chinaren.model.User)
	 */
	@Override
	public Result<User> insertUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see chinaren.dao.UserDao#updatePassword(long, java.lang.String)
	 */
	@Override
	public Result<User> updatePassword(long userId, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see chinaren.dao.UserDao#updateUserInfo(chinaren.model.User)
	 */
	@Override
	public Result<User> updateUserInfo(User user) {
		// TODO Auto-generated method stub
		return null;
	}

}
