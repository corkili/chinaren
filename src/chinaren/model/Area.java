package chinaren.model;

import chinaren.dao.BaseDao;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 地区实体类
 * @ClassName Area 
 * @author 李浩然
 * @date 2017年7月27日
 * @version 1.0
 */
@Entity
@Table(name = BaseDao.TABLE_AREA)
public class Area implements Serializable{

	private static final long serialVersionUID = 8330170251940288409L;

	/**
	 * 地区ID
	 */
    @Column(name = BaseDao.COL_AREA_ID)
    private String areaId;

    /**
     * 地区名称
     */
    @Column(name = BaseDao.COL_AREA)
    private String area;

    /**
     * 地区所属城市的ID
     */
    @Column(name = BaseDao.COL_FATHER)
    private String father;

    /**
     * 获取地区ID
     * @author 李浩然
     * @return 地区ID
     */
    public String getAreaId() {
        return areaId;
    }

    /**
     * 设置地区ID
     * @author 李浩然
     * @param areaId 地区ID
     */
    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    /**
     * 获取地区名称
     * @author 李浩然
     * @return 地区名称
     */
    public String getArea() {
        return area;
    }

    /**
     * 设置地区名称
     * @author 李浩然
     * @param area 地区名称
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * 获取地区所属城市的ID
     * @author 李浩然
     * @return 地区所属城市的ID
     */
    public String getFather() {
        return father;
    }

    /**
     * 设置地区所属城市的ID
     * @author 李浩然
     * @param father 地区所属城市的ID
     */
    public void setFather(String father) {
        this.father = father;
    }
}
