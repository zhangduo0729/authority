package net.wangxj.authority.dao.base;

import java.util.List;

/**
 * Dao层通用接口
 * @author huoshan
 */
public interface IBaseDao<T> {

	/**
	 * 插入一条数据
	 * @param po 
	 * @return 插入条数
	 */
	public Integer insert(T po);
	
	/**
	 * 根据主键更新
	 * @param po
	 * @return 更新条数
	 */
	public Integer updateByUuid(T po);
	
	/**
	 * 条件查询
	 * @param po
	 * @return 结果List
	 */
	public List<T> selectListByCondition(T po);

	/**
	 * 分页条件查询
	 * @param po
	 * @param pageNum 页码
	 * @param limit	  每页条数
	 * @param order   排序方式desc asc
	 * @param sort    排序字段
	 * @return 结果List
	 */
	public List<T> selectPageListByCondition(T po, int pageNum, int limit,String order,String sort);

	/**
	 * 查询符合条件的数量
	 * @param obj
	 * @return 符合条件的数量
	 */
	public Integer getCountByCondition(T obj);
}