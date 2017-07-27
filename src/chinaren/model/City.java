package chinaren.model;

import chinaren.dao.BaseDao;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 城市实体类
 * @ClassName City 
 * @author 李浩然
 * @date 2017年7月27日
 * @version 1.0
 */
@Entity
@Table(name = BaseDao.TABLE_CITY)
public class City implements Serializable{

	private static final long serialVersionUID = 7771633329482739999L;

	/**
	 * 城市ID
	 */
    @Column(name = BaseDao.COL_CITY_ID)
    private String cityId;

    /**
     * 城市名称
     */
    @Column(name = BaseDao.COL_CITY)
    private String city;

    /**
     * 城市所属省份的ID
     */
    @Column(name = BaseDao.COL_FATHER)
    private String father;

    /**
     * 获取城市ID
     * @author 李浩然
     * @return 城市ID
     */
    public String getCityId() {
        return cityId;
    }

    /**
     * 设置城市ID
     * @author 李浩然
     * @param cityId 城市ID
     */
    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    /**
     * 获取城市名称
     * @author 李浩然
     * @return 城市名称
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置城市名称
     * @author 李浩然
     * @param city 城市名称
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 获取城市所属省份的ID
     * @author 李浩然
     * @return 城市所属省份的ID
     */
    public String getFather() {
        return father;
    }

    /**
     * 设置城市所属省份的ID
     * @author 李浩然
     * @param father 城市所属省份的ID
     */
    public void setFather(String father) {
        this.father = father;
    }
}
