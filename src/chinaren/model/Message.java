package chinaren.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import chinaren.dao.BaseDao;

/**
 * 留言实体类
 * @ClassName Message
 * @author 李浩然
 * @date 2017年7月20日
 * @version 1.0
 */
@Entity
@Table(name = BaseDao.TABLE_MESSAGE)
public class Message implements Serializable, Comparable<Message> {

	private static final long serialVersionUID = -3394925740684560555L;

	/**
	 * 留言ID
	 */
	@Column(name = BaseDao.COL_MESSAGE_ID)
	private long messageId;

	/**
	 * 留言内容
	 */
	@Column(name = BaseDao.COL_CONTENT)
	private String content;

	/**
	 * 留言时间
	 */
	@Column(name = BaseDao.COL_MSG_TIME)
	private Date msgTime;

	/**
	 * 发布留言的用户的ID
	 */
	@Column(name = BaseDao.COL_USER_ID)
	private long userId;

	/**
	 * 发布留言的用户的姓名
	 */
	@Column(name = BaseDao.COL_NAME)
	private String name;

	/**
	 * 留言所属班级的ID
	 */
	@Column(name = BaseDao.COL_CLASS_ID)
	private long classId;

	/**
	 * 留言所属班级的名称
	 */
	@Column(name = BaseDao.COL_CLASS_NAME)
	private String className;

	/**
	 * 获取留言ID
	 * @author 李浩然
	 * @return 留言ID
	 */
	public long getMessageId() {
		return messageId;
	}

	/**
	 * 设置留言ID
	 * @author 李浩然
	 * @param messageId 留言ID
	 */
	public void setMessageId(long messageId) {
		this.messageId = messageId;
	}

	/**
	 * 获取留言内容
	 * @author 李浩然
	 * @return 留言内容
	 */
	public String getContent() {
		return content;
	}

	/**
	 * 设置留言内容
	 * @author 李浩然
	 * @param content 留言内容
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * 获取留言时间
	 * @author 李浩然
	 * @return 留言时间
	 */
	public Date getMsgTime() {
		return msgTime;
	}

	/**
	 * 设置留言时间
	 * @author 李浩然
	 * @param msgTime 留言时间
	 */
	public void setMsgTime(Date msgTime) {
		this.msgTime = msgTime;
	}

	/**
	 * 获取发布留言的用户的ID
	 * @author 李浩然
	 * @return 发布留言的用户的ID
	 */
	public long getUserId() {
		return userId;
	}

	/**
	 * 设置发布留言的用户的ID
	 * @author 李浩然
	 * @param userId 发布留言的用户的ID
	 */
	public void setUserId(long userId) {
		this.userId = userId;
	}

	/**
	 * 获取发布留言的用户的姓名
	 * @author 李浩然
	 * @return 发布留言的用户的姓名
	 */
	public String getName() {
		return name;
	}

	/**
	 * 设置发布留言的用户的姓名
	 * @author 李浩然
	 * @param name 发布留言的用户的姓名
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * 获取留言所属班级的ID
	 * @author 李浩然
	 * @return 留言所属班级的ID
	 */
	public long getClassId() {
		return classId;
	}

	/**
	 * 设置留言所属班级的ID
	 * @author 李浩然
	 * @param classId 留言所属班级的ID
	 */
	public void setClassId(long classId) {
		this.classId = classId;
	}

	/**
	 * 获取留言所属班级的名称
	 * @author 李浩然
	 * @return 留言所属班级的名称
	 */
	public String getClassName() {
		return className;
	}

	/**
	 * 设置留言所属班级的名称
	 * @author 李浩然
	 * @param className 留言所属班级的名称
	 */
	public void setClassName(String className) {
		this.className = className;
	}

	/**
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Message o) {
		return -this.msgTime.compareTo(o.getMsgTime());
	}
}
