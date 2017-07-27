package chinaren.model;

import java.util.ArrayList;
import java.util.List;


/**
 * 留言计数器类
 * @ClassName MessageCounter 
 * @author 李浩然
 * @date 2017年7月27日
 * @version 1.0
 */
public class MessageCounter {
	/**
	 * 留言日期字符串
	 */
    private String date;

    /**
     * 留言所属班级的ID
     */
    private long classId;

    /**
     * 留言所属班级的名称
     */
    private String className;

    /**
     * 留言列表
     */
    private List<Message> messages;

    /**
     * 构造函数
     */
    public MessageCounter() {
        messages = new ArrayList<>();
    }

    /**
     * 留言日期字符串
     * @author 李浩然
     * @return 留言日期字符串
     */
    public String getDate() {
        return date;
    }

    /**
     * 设置留言日期字符串
     * @author 李浩然
     * @param date 留言日期字符串
     */
    public void setDate(String date) {
        this.date = date;
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
     * 获取留言列表
     * @author 李浩然
     * @return 留言列表
     */
    public List<Message> getMessages() {
        return messages;
    }

    /**
     * 设置留言列表
     * @author 李浩然
     * @param messages 留言列表
     */
    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }
}
