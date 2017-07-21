package chinaren.service;

import java.util.List;

import chinaren.model.Message;
import chinaren.model.Result;

/**
 * 留言相关数据处理，服务层实现类
 * @ClassName MessageServiceImpl 
 * @author 李浩然
 * @date 2017年7月21日
 * @version 1.0
 */
public class MessageServiceImpl implements MessageService {

	/**
	 * 
	 */
	public MessageServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see chinaren.service.MessageService#releaseMessage(chinaren.model.Message)
	 */
	@Override
	public Result<Boolean> releaseMessage(Message message) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see chinaren.service.MessageService#deleteMessage(long)
	 */
	@Override
	public Result<Boolean> deleteMessage(long messageId) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see chinaren.service.MessageService#getUserMessages(long)
	 */
	@Override
	public Result<List<Message>> getUserMessages(long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see chinaren.service.MessageService#getClassMessages(long)
	 */
	@Override
	public Result<List<Message>> getClassMessages(long classId) {
		// TODO Auto-generated method stub
		return null;
	}

}
