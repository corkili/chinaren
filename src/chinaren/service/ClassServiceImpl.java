package chinaren.service;

import java.util.List;

import org.springframework.stereotype.Service;

import chinaren.model.Class;
import chinaren.model.Result;

/**
 * 班级相关数据处理，服务层实现类
 * @ClassName ClassServiceImpl 
 * @author 李浩然
 * @date 2017年7月21日
 * @version 1.0
 */
@Service
public class ClassServiceImpl implements ClassService {

	/**
	 * 
	 */
	public ClassServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see chinaren.service.ClassService#getClassInformation(long)
	 */
	@Override
	public Result<Class> getClassInformation(long classId) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see chinaren.service.ClassService#getClasses(long, boolean)
	 */
	@Override
	public Result<List<Class>> getClasses(long userId, boolean status) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see chinaren.service.ClassService#getManageClasses(long)
	 */
	@Override
	public Result<List<Class>> getManageClasses(long managerId) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see chinaren.service.ClassService#searchClasses(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public Result<List<Class>> searchClasses(String province, String city, String area, String school, String gradeYear,
			String className) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see chinaren.service.ClassService#createClass(chinaren.model.Class)
	 */
	@Override
	public Result<Boolean> createClass(Class clazz) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see chinaren.service.ClassService#applyJoinClass(long, long)
	 */
	@Override
	public Result<Boolean> applyJoinClass(long userId, long classId) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see chinaren.service.ClassService#exitClass(long, long)
	 */
	@Override
	public Result<Boolean> exitClass(long userId, long classId) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see chinaren.service.ClassService#allowJoinClass(long, long, long)
	 */
	@Override
	public Result<Boolean> allowJoinClass(long managerId, long userId, long classId) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see chinaren.service.ClassService#refuseJoinClass(long, long, long)
	 */
	@Override
	public Result<Boolean> refuseJoinClass(long managerId, long userId, long classId) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see chinaren.service.ClassService#removeClassmate(long, long, long)
	 */
	@Override
	public Result<Boolean> removeClassmate(long managerId, long userId, long classId) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see chinaren.service.ClassService#removeClass(long, long)
	 */
	@Override
	public Result<Boolean> removeClass(long managerId, long classId) {
		// TODO Auto-generated method stub
		return null;
	}

}
