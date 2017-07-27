package chinaren.model;

import java.util.List;

/**
 * 留言数据统计结果
 * @ClassName StatisticsResult 
 * @author 李浩然
 * @date 2017年7月27日
 * @version 1.0
 */
public class StatisticsResult {
	/**
	 * 日期字符串列表
	 */
    private List<String> dataString;

    /**
     * 班级名称列表
     */
    private List<String> classNames;

    /**
     * 二维计数数组（行：日期；列：班级）
     */
    private int[][] counts;

    /**
     * 构造函数
     * @param dataString 日期字符串列表
     * @param classNames 班级名称列表
     * @param counts 二维计数数组（行：日期；列：班级）
     */
    public StatisticsResult(List<String> dataString, List<String> classNames, int[][] counts) {
        this.dataString = dataString;
        this.classNames = classNames;
        this.counts = counts;
    }
    
    /**
     * 获取日期字符串列表
     * @author 李浩然
     * @return 日期字符串列表
     */
    public List<String> getDataString() {
        return dataString;
    }

    /**
     * 获取班级名称列表
     * @author 李浩然
     * @return 班级名称列表
     */
    public List<String> getClassNames() {
        return classNames;
    }

    /**
     * 获取二维计数数组（行：日期；列：班级）
     * @author 李浩然
     * @return 二维计数数组（行：日期；列：班级）
     */
    public int[][] getCounts() {
        return counts;
    }

}
