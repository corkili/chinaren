package chinaren.dao;

import java.text.SimpleDateFormat;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import chinaren.model.Class;
import chinaren.model.Result;

/**
 * 班级数据持久层实现类
 * @ClassName ClassDaoImpl
 * @author 李浩然
 * @date 2017年7月20日
 * @version 1.0
 */
@Repository
public class ClassDaoImpl extends BaseDao implements ClassDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private Logger logger = Logger.getLogger(ClassDaoImpl.class);

	private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss - ");
	
	/**
	 * 构造函数
	 */
	public ClassDaoImpl() {
		
	}

	/**
	 * @see chinaren.dao.ClassDao#selectClassByClassId(long)
	 */
	@Override
	public Result<Class> selectClassByClassId(long classId) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see chinaren.dao.ClassDao#selectClass(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public Result<Class> selectClass(String province, String city, String area, String school, String gradeYear,
			String className) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see chinaren.dao.ClassDao#selectClassesByManagerId(long)
	 */
	@Override
	public Result<List<Class>> selectClassesByManagerId(long managerId) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see chinaren.dao.ClassDao#selectClasses(java.lang.String)
	 */
	@Override
	public Result<List<Class>> selectClasses(String province) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see chinaren.dao.ClassDao#selectClasses(java.lang.String, java.lang.String)
	 */
	@Override
	public Result<List<Class>> selectClasses(String province, String city) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see chinaren.dao.ClassDao#selectClasses(java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public Result<List<Class>> selectClasses(String province, String city, String area) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see chinaren.dao.ClassDao#selectClasses(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public Result<List<Class>> selectClasses(String province, String city, String area, String school) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see chinaren.dao.ClassDao#selectClasses(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public Result<List<Class>> selectClasses(String province, String city, String area, String school,
			String gradeYear) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see chinaren.dao.ClassDao#selectClasses(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public Result<List<Class>> selectClasses(String province, String city, String area, String school, String gradeYear,
			String className) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see chinaren.dao.ClassDao#insertClass(chinaren.model.Class)
	 */
	@Override
	public Result<Class> insertClass(Class clazz) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see chinaren.dao.ClassDao#deleteClass(long)
	 */
	@Override
	public Result<Boolean> deleteClass(long classId) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see chinaren.dao.ClassDao#updateDescription(long, java.lang.String)
	 */
	@Override
	public Result<Class> updateDescription(long classId, String description) {
		// TODO Auto-generated method stub
		return null;
	}

}
