package chinaren.model;

import chinaren.dao.BaseDao;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 省份实体类
 * @ClassName Province 
 * @author 李浩然
 * @date 2017年7月27日
 * @version 1.0
 */
@Entity
@Table(name = BaseDao.TABLE_PROVINCE)
public class Province implements Serializable{

	private static final long serialVersionUID = 4428174841618511234L;

	/**
	 * 省份ID
	 */
	@Column(name = BaseDao.COL_PROVINCE_ID)
    private String provinceId;

	/**
	 * 省份名称
	 */
    @Column(name = BaseDao.COL_PROVINCE)
    private String province;

    /**
     * 获取省份ID
     * @author 李浩然
     * @return 省份ID
     */
    public String getProvinceId() {
        return provinceId;
    }

    /**
     * 设置省份ID
     * @author 李浩然
     * @param provinceId 省份ID
     */
    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId;
    }

    /**
     * 获取省份名称
     * @author 李浩然
     * @return 省份名称
     */
    public String getProvince() {
        return province;
    }

    /**
     * 设置省份名称
     * @author 李浩然
     * @param province 省份名称
     */
    public void setProvince(String province) {
        this.province = province;
    }
}
