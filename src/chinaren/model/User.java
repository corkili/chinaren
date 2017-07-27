package chinaren.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import chinaren.dao.BaseDao;

/**
 * 用户实体类
 * @ClassName: User
 * @author 李浩然
 * @date 2017-7-20
 * @version 1.0
 */
@Entity
@Table(name = BaseDao.TABLE_USER)
public class User implements Serializable {

	private static final long serialVersionUID = 5419632301270768050L;

	/**
	 * 性别类型-男
	 */
	public static final String SEX_MAN = "男";

	/**
	 * 性别类型-女
	 */
	public static final String SEX_WOMAN = "女";

	/**
	 * 用户ID
	 */
	@Column(name = BaseDao.COL_USER_ID)
	private long userId;

	/**
	 * 用户邮箱
	 */
	@Column(name = BaseDao.COL_EMAIL)
	private String email;

	/**
	 * 用户密码哈希值
	 */
	@Column(name = BaseDao.COL_PASSWORD)
	private String password;

	/**
	 * 用户实名
	 */
	@Column(name = BaseDao.COL_NAME)
	private String name;

	/**
	 * 性别
	 */
	@Column(name = BaseDao.COL_SEX)
	private String sex;

	/**
	 * 手机号
	 */
	@Column(name = BaseDao.COL_PHONE)
	private String phone;

	/**
	 * 个人简介
	 */
	@Column(name = BaseDao.COL_INTRODUCTION)
	private String introduction;

	/**
	 * 头像文件路径
	 */
	@Column(name = BaseDao.COL_HEAD_IMAGE)
	private String headImage;

	/**
	 * 所在省份
	 */
	@Column(name = BaseDao.COL_PROVINCE)
	private String province;

	/**
	 * 所在城市
	 */
	@Column(name = BaseDao.COL_CITY)
	private String city;

	/**
	 * 所在地区
	 */
	@Column(name = BaseDao.COL_AREA)
	private String area;

	/**
	 * 用户所属班级的ID列表
	 */
	private List<Long> belongClass;

	/**
	 * 用户申请加入的班级的ID列表
	 */
	private List<Long> applyClass;
	
	/**
	 * 构造函数，初始化belongClass为空列表
	 */
	public User() {
		belongClass = new ArrayList<Long>();
	}
	
	/**
	 * 获取用户ID
	 * @author 李浩然
	 * @return 用户ID
	 */
	public long getUserId() {
		return userId;
	}

	/**
	 * 设置用户ID
	 * @author 李浩然
	 * @param userId 用户ID
	 */
	public void setUserId(long userId) {
		this.userId = userId;
	}

	/**
	 * 获取用户邮箱
	 * @author 李浩然
	 * @return 用户邮箱
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * 设置用户邮箱
	 * @author 李浩然
	 * @param email 用户邮箱
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * 获取用户密码哈希值
	 * @author 李浩然
	 * @return 用户密码哈希值
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * 设置用户密码哈希值
	 * @author 李浩然
	 * @param password 用户密码哈希值
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * 获取用户实名
	 * @author 李浩然
	 * @return 用户实名
	 */
	public String getName() {
		return name;
	}

	/**
	 * 设置用户实名
	 * @author 李浩然
	 * @param name 用户实名
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获取性别
	 * @author 李浩然
	 * @return 性别
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * 设置性别
	 * @author 李浩然
	 * @param sex 性别
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}

	/**
	 * 获取手机号
	 * @author 李浩然
	 * @return 手机号
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * 设置手机号
	 * @author 李浩然
	 * @param phone 手机号
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * 获取个人简介
	 * @author 李浩然
	 * @return 个人简介
	 */
	public String getIntroduction() {
		return introduction;
	}

	/**
	 * 设置个人简介
	 * @author 李浩然
	 * @param introduction 个人简介
	 */
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	/**
	 * 获取头像文件路径
	 * @author 李浩然
	 * @return 头像文件路径
	 */
	public String getHeadImage() {
		return headImage;
	}

	/**
	 * 设置头像文件路径
	 * @author 李浩然
	 * @param headImage 头像文件路径
	 */
	public void setHeadImage(String headImage) {
		this.headImage = headImage;
	}

	/**
	 * 获取所在省份
	 * @author 李浩然
	 * @return 所在省份
	 */
	public String getProvince() {
		return province;
	}

	/**
	 * 设置所在省份
	 * @author 李浩然
	 * @param province 所在省份
	 */
	public void setProvince(String province) {
		this.province = province;
	}

	/**
	 * 获取所在城市
	 * @author 李浩然
	 * @return 所在城市
	 */
	public String getCity() {
		return city;
	}

	/**
	 * 设置所在城市
	 * @author 李浩然
	 * @param city 所在城市
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * 获取所在地区
	 * @author 李浩然
	 * @return 所在地区
	 */
	public String getArea() {
		return area;
	}

	/**
	 * 设置所在地区
	 * @author 李浩然
	 * @param area 所在地区
	 */
	public void setArea(String area) {
		this.area = area;
	}

	/**
	 * 获取用户所属班级的ID列表
	 * @author 李浩然
	 * @return 用户所属班级的ID列表
	 */
	public List<Long> getBelongClass() {
		return belongClass;
	}

	/**
	 * 设置用户所属班级的ID列表
	 * @author 李浩然
	 * @param belongClass 用户所属班级的ID列表
	 */
	public void setBelongClass(List<Long> belongClass) {
		this.belongClass = belongClass;
	}

	/**
	 * 获取用户申请加入的班级的ID列表
	 * @author 李浩然
	 * @return 用户申请加入的班级的ID列表
	 */
	public List<Long> getApplyClass() {
		return applyClass;
	}

	/**
	 * 设置用户申请加入的班级的ID列表
	 * @author 李浩然
	 * @param applyClass 用户申请加入的班级的ID列表
	 */
	public void setApplyClass(List<Long> applyClass) {
		this.applyClass = applyClass;
	}
}
