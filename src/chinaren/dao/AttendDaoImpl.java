/**
 * 
 */
package chinaren.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import chinaren.model.Result;

/**
 * @ClassName AttendDaoImpl
 * @Description 班级-同学关系数据持久层实现类
 * @author 李浩然
 * @date 2017年7月20日
 * @version 1.0
 */
public class AttendDaoImpl extends BaseDao implements AttendDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private Logger logger = Logger.getLogger(AttendDaoImpl.class);
	
	/**
	 * 构造函数
	 */
	public AttendDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see chinaren.dao.AttendDao#selectUserIdByClassId(long)
	 */
	@Override
	public Result<List<Long>> selectUserIdByClassId(long classId) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see chinaren.dao.AttendDao#selectClassIdByUserId(long)
	 */
	@Override
	public Result<List<Long>> selectClassIdByUserId(long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see chinaren.dao.AttendDao#insertAttend(long, long)
	 */
	@Override
	public Result<Boolean> insertAttend(long userId, long classId) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see chinaren.dao.AttendDao#deleteAttend(long, long)
	 */
	@Override
	public Result<Boolean> deleteAttend(long userId, long classId) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see chinaren.dao.AttendDao#deleteAttendByClassId(long)
	 */
	@Override
	public Result<Boolean> deleteAttendByClassId(long classId) {
		// TODO Auto-generated method stub
		return null;
	}

}
