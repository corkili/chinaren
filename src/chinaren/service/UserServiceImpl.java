package chinaren.service;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import chinaren.model.Result;
import chinaren.model.User;

/**
 * 用户相关数据处理，服务层实现类
 * @ClassName UserServiceImpl 
 * @author 李浩然
 * @date 2017年7月21日
 * @version 1.0
 */
@Service
public class UserServiceImpl implements UserService {

	/**
	 * 
	 */
	public UserServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see chinaren.service.UserService#register(chinaren.model.User)
	 */
	@Override
	public Result<Boolean> register(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see chinaren.service.UserService#login(chinaren.model.User, javax.servlet.http.HttpSession)
	 */
	@Override
	public Result<Boolean> login(User user, HttpSession session) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see chinaren.service.UserService#logout(long, javax.servlet.http.HttpSession)
	 */
	@Override
	public void logout(long userId, HttpSession session) {
		// TODO Auto-generated method stub

	}

	/**
	 * @see chinaren.service.UserService#getUserInformation(long)
	 */
	@Override
	public Result<User> getUserInformation(long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see chinaren.service.UserService#outputHeadImage(long, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	public void outputHeadImage(long userId, HttpServletResponse response) {
		// TODO Auto-generated method stub

	}

	/**
	 * @see chinaren.service.UserService#modifyPassword(long, java.lang.String)
	 */
	@Override
	public Result<Boolean> modifyPassword(long userId, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see chinaren.service.UserService#modifyUserInformation(chinaren.model.User)
	 */
	@Override
	public Result<Boolean> modifyUserInformation(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see chinaren.service.UserService#modifyHeadImage(long, org.springframework.web.multipart.MultipartFile)
	 */
	@Override
	public Result<Boolean> modifyHeadImage(long userId, MultipartFile image) {
		// TODO Auto-generated method stub
		return null;
	}

}
