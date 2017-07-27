package chinaren.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import chinaren.dao.BaseDao;

/**
 * 班级实体类
 * @ClassName Class
 * @author 李浩然
 * @date 2017年7月20日
 * @version 1.0
 */
@Entity
@Table(name = BaseDao.TABLE_CLASS)
public class Class implements Serializable{

	private static final long serialVersionUID = -4499276679953479446L;
	
	/**
	 * 班级ID
	 */
	@Column(name = BaseDao.COL_CLASS_ID)
	private long classId;

	/**
	 * 班级所在学校
	 */
	@Column(name = BaseDao.COL_SCHOOL)
	private String school;

	/**
	 * 班级名称
	 */
	@Column(name = BaseDao.COL_CLASS_NAME)
	private String className;

	/**
	 * 班级年份
	 */
	@Column(name = BaseDao.COL_GRADE_YEAR)
	private String gradeYear;

	/**
	 * 班级描述
	 */
	@Column(name = BaseDao.COL_DESCRIPTION)
	private String description;

	/**
	 * 班级所在省份
	 */
	@Column(name = BaseDao.COL_PROVINCE)
	private String province;

	/**
	 * 班级所在城市
	 */
	@Column(name = BaseDao.COL_CITY)
	private String city;

	/**
	 * 班级所在地区
	 */
	@Column(name = BaseDao.COL_AREA)
	private String area;

	/**
	 * 班级管理者ID
	 */
	@Column(name = BaseDao.COL_MANAGER_ID)
	private long managerId;

	@Column(name = BaseDao.COL_MANAGER_NAME)
	private String managerName;
	
	/**
	 * 班级中所有同学的ID列表
	 */
	private List<Long> classmates;
	
	/**
	 * 申请加入班级的用户的ID列表
	 */
	private List<Long> notApplys;
	
	/**
	 * 构造函数，初始化classmates为空列表
	 */
	public Class() {
		classmates = new ArrayList<Long>();
	}

	/**
	 * 获取班级ID
	 * @author 李浩然
	 * @return 班级ID
	 */
	public long getClassId() {
		return classId;
	}

	/**
	 * 设置班级ID
	 * @author 李浩然
	 * @param classId 班级ID
	 */
	public void setClassId(long classId) {
		this.classId = classId;
	}

	/**
	 * 获取学校名称
	 * @author 李浩然
	 * @return 学校名称
	 */
	public String getSchool() {
		return school;
	}

	/**
	 * 设置学校名称
	 * @author 李浩然
	 * @param school 学校名称
	 */
	public void setSchool(String school) {
		this.school = school;
	}

	/**
	 * 获取班级名称
	 * @author 李浩然
	 * @return 班级名称
	 */
	public String getClassName() {
		return className;
	}

	/**
	 * 设置班级名称
	 * @author 李浩然
	 * @param className 班级名称
	 */
	public void setClassName(String className) {
		this.className = className;
	}

	/**
	 * 获取年级
	 * @author 李浩然
	 * @return 年级
	 */
	public String getGradeYear() {
		return gradeYear;
	}

	/**
	 * 设置年级
	 * @author 李浩然
	 * @param gradeYear 年级
	 */
	public void setGradeYear(String gradeYear) {
		this.gradeYear = gradeYear;
	}
	

	/**
	 * 获取班级描述
	 * @author 李浩然
	 * @return 班级描述
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * 设置班级描述
	 * @author 李浩然
	 * @param description 班级描述
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * 获取班级所属省份
	 * @author 李浩然
	 * @return 班级所属省份
	 */
	public String getProvince() {
		return province;
	}

	/**
	 * 设置班级所属省份
	 * @author 李浩然
	 * @param province 班级所属省份
	 */
	public void setProvince(String province) {
		this.province = province;
	}

	/**
	 * 获取班级所属城市
	 * @author 李浩然
	 * @return 班级所属城市
	 */
	public String getCity() {
		return city;
	}

	/**
	 * 设置班级所属城市
	 * @author 李浩然
	 * @param city 班级所属城市
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * 获取班级所属地区
	 * @author 李浩然
	 * @return 班级所属地区
	 */
	public String getArea() {
		return area;
	}

	/**
	 * 设置班级所属地区
	 * @author 李浩然
	 * @param area 班级所属地区
	 */
	public void setArea(String area) {
		this.area = area;
	}

	/**
	 * 获取班级管理者ID
	 * @author 李浩然
	 * @return 获取班级管理者ID
	 */
	public long getManagerId() {
		return managerId;
	}

	/**
	 * 设置班级管理者ID
	 * @author 李浩然
	 * @param managerId 获取班级管理者ID
	 */
	public void setManagerId(long managerId) {
		this.managerId = managerId;
	}

	/**
	 * 获取班级管理者姓名
	 * @author 李浩然
	 * @return 班级管理者姓名
	 */
	public String getManagerName() {
		return managerName;
	}

	/**
	 * 设置班级管理者姓名
	 * @author 李浩然
	 * @param managerName 班级管理者姓名
	 */
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	
	
	/**
	 * 获取班级同学ID列表
	 * @author 李浩然
	 * @return 班级同学ID列表
	 */
	public List<Long> getClassmates() {
		return classmates;
	}

	/**
	 * 设置班级同学ID列表
	 * @author 李浩然
	 * @param classmates 班级同学ID列表
	 */
	public void setClassmates(List<Long> classmates) {
		this.classmates = classmates;
	}

	/**
	 * 获取待审核用户ID列表
	 * @author 李浩然
	 * @return 待审核用户ID列表
	 */
	public List<Long> getNotApplys() {
		return notApplys;
	}

	/**
	 * 设置待审核用户ID列表
	 * @author 李浩然
	 * @param notApplys 待审核用户ID列表
	 */
	public void setNotApplys(List<Long> notApplys) {
		this.notApplys = notApplys;
	}
	
	/**
	 * 判断用户是否在班级中
	 * @author 李浩然
	 * @param userId 待判断用户的ID
	 * @return 若在班级中，返回true；否则，返回false
	 */
	public boolean contain(long userId) {
		for (Long id : classmates) {
			if (id == userId) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * 判断用户是否为班级管理者
	 * @author 李浩然
	 * @param userId 待判断用户的ID
	 * @return 若是管理者，返回true；否则，返回false
	 */
	public boolean isManager(long userId) {
		return userId == this.managerId;
	}
}

