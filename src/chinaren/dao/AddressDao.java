package chinaren.dao;

import chinaren.model.Area;
import chinaren.model.City;
import chinaren.model.Province;
import chinaren.model.Result;

import java.util.List;

/**
 * 地址数据持久层接口
 * @ClassName AddressDao 
 * @author 李浩然
 * @date 2017年7月24日
 * @version 1.0
 */
public interface AddressDao {
	/**
	 * 从数据库中获取所有的省份
	 * @author 李浩然
	 * @return 包含省份列表的结果集
	 */
    public Result<List<Province>> selectProvinces();

    /**
     * 从数据库中获取相应省份的所有城市
     * @author 李浩然
     * @param provinceId 省份的ID
     * @return 包含该省份所有城市列表的结果集
     */
    public Result<List<City>> selectCities(String provinceId);

    /**
     * 从数据库中获取相应城市的所有地区
     * @author 李浩然
     * @param cityId 城市的ID
     * @return 包含该城市所有地区列表的结果集
     */
    public Result<List<Area>> selectAreas(String cityId);
}
