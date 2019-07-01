package com.erpSys.main.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.erpSys.main.entity.EasyuiPage;

public interface IBaseService<T> {
	
	//添加单个对象
	public int insert (T entity) throws Exception;
	
	//修改单个对象
	public int update(T entity) throws Exception;
	 
	//删除单个对象
	public int delete(T entity) throws Exception;
	
	//通过主键（数组）批量删除数据
	public int deleteList(String [] pks) throws Exception;
	
	// 获取最大的ID
	public int selectByMaxId();
	//查询单个对象
	public T select(T entity);
	
	//通过关键字分页查询
	public EasyuiPage<T> selectPage(EasyuiPage<T> page); 
	
	
	//通过多条件分页查询
	public EasyuiPage<T> selectPageUseDyc(EasyuiPage<T> page); 
	
	//查询出所有的数据，不分页
	public List<T> selectList();
	
	
	//查询出所有的数据，不分页
	public List<T> selectResIdList(Integer resId);
	
	//通过ID查询 
	public List<T> selectId(T entity);
	
	//通过多个ID 查询多条记录
	public List<T> selectIdsList(String [] pks);
	
	//通过外键ID查询所有
	public List<T> selectForeignKey(T entity);
	
	/**
	 * 自定义条件查询
	 * @param entity
	 * @return
	 */
	public List<T> selectByEntity(T entity);
	
	//逆向生成
	//根据id查询
	public T selectById(String id);
	
	//根据id查询
	public T selectById(Long id);
	
	//根据Id删除单个
	public int deleteById(String id);
	
	//根据Id删除单个
	public int deleteById(Long id);
	
	//根据Id删除单个
	public int deleteById(Integer id);
	
	//通过外键ID 查List
	public List<T> comboBoxList(String q);
	
	
	//查询多条件
	public List<T> selectAnyList(Map<Object,Object> map);
	
	public T selectAnyOne(Map<Object,Object> map);
	
	public HashMap<Object,Object> selectMap=new HashMap<Object,Object>();
	/**
	 * 有条件的添加
	 * @param entity
	 * @return
	 */
	public int insertSelective(T entity);
	
	/**
	 * 根据有条件的修改
	 * @param entity
	 * @return
	 */
	public int updateByIdSelective(T entity);
	
	/**
	 * 根据ID修改全部
	 * @param entity
	 * @return
	 */
	public int updateById(T entity);
	
	//根据id查询
	public T selectById(T entity);
	
	//根据id查询
	public T selectById(Integer id);
	
	//通过外键ID 查List
	public List<T> 	selectByOuterIdList(String outerId);
	
	//通过外键ID 查List
	public List<T> 	selectByOuterIdList(Integer outerId);
	
	/**
	 * 批量添加
	 * @param t
	 * @return
	 */
	public int insertList(List<T> list);
	
	/**
	 * 查询修改后的所有的单据
	 * @param entity
	 * @return
	 */
	public List<T> selectUpdateList(T entity);
	
	public Integer getTotalRecord(EasyuiPage<T> page);
	
	
	
}
