package chinaren.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import chinaren.model.Message;
import chinaren.model.Result;

/**
 * 留言数据持久层实现类
 * @ClassName MessageDaoImpl
 * @author 李浩然
 * @date 2017年7月20日
 * @version 1.0
 */
public class MessageDaoImpl extends BaseDao implements MessageDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private Logger logger = Logger.getLogger(MessageDaoImpl.class);
	
	/**
	 * 构造函数
	 */
	public MessageDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see chinaren.dao.MessageDao#selectMessageById(long)
	 */
	@Override
	public Result<Message> selectMessageById(long messageId) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see chinaren.dao.MessageDao#selectMessagesByClassId(long)
	 */
	@Override
	public Result<List<Message>> selectMessagesByClassId(long classId) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see chinaren.dao.MessageDao#selectMessageByUserId(long)
	 */
	@Override
	public Result<List<Message>> selectMessageByUserId(long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see chinaren.dao.MessageDao#insertMessage(chinaren.model.Message)
	 */
	@Override
	public Result<Message> insertMessage(Message message) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see chinaren.dao.MessageDao#deleteMessage(long)
	 */
	@Override
	public Result<Boolean> deleteMessage(long messageId) {
		// TODO Auto-generated method stub
		return null;
	}

}
