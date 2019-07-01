package com.erpSys.main.entity;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.erpSys.main.utils.HabitUtils;

public class EasyuiPage<T> implements Serializable {


	private static final long serialVersionUID = 337297181251071639L;
	
	private Integer page;//当前页 
	private Integer rows;//页大小
	private Integer totalRecord;// 总记录 数
	private List<T> list;//页面数据列表
	private String keyWord;//查询关键字
	
	private T paramEntity;//多条件查询
	private Integer start;//开始的页数
	private String sort; //排序的字段  用与动态的排序
	private String order; // 排序的顺序   用与动态的排序
	private Map<String, Object> pageMap = new HashMap<String, Object>() ;
	public Map<String, Object> getPageMap() {
		return pageMap;
	}
	public T getParamEntity() {
		return paramEntity;
	}
	public void setParamEntity(T paramEntity) {
		this.paramEntity = paramEntity;
	}
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getRows() {
		return rows;
	}
	public void setRows(Integer rows) {
		this.rows = rows;
	}
	public void setTotalRecord(Integer totalRecord) {
		pageMap.put("total", totalRecord); //totalRecord
		this.totalRecord = totalRecord;
	}
	public void setList(List<T> list) {
		pageMap.put("rows", list); //rows 数据
		this.list = list;
	}
	public String getKeyWord() {
		return keyWord;
	}
	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}
	public Integer getStart() {
		this.start = (page-1)*rows;
		return start;
	}
	public void setStart(Integer start) {
		this.start = start;
	}
	
	
	
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		String daxieTo_ = HabitUtils.daxieTo_(sort);
		this.sort = daxieTo_;
	}
	public String getOrder() {
		return order;
	}
	public void setOrder(String order) {
		this.order = order;
	}
	@Override
	public String toString() {
		return "Page [page=" + page + ", rows=" + rows + ", totalRecord="
				+ totalRecord + ", list=" + list + ", keyWord=" + keyWord
				+ ", paramEntity=" + paramEntity + ", start=" + start + "]";
	}

}

