package com.erpSys.main.entity;

import java.util.List;

/**
 *  EasyuiTree 树形结构
 * @author lyh
 *
 */
public class EasyuiTree {
	/* 转成json  需要的一个json格式
	 {  "id": 1,
	 	"text": "文本",
	 	"state" : "open",
	 	"checked" : fasle,
	 	children:[
	 		{},{},{}
	 	]
	 }
	 
	
	
	*/
	
	private Integer id;//    节点ID，对加载远程数据很重要。
	private String text;//  显示节点文本。
	private String state;// 节点状态，'open' 或 'closed'，默认；'open'。如果为'closed'的时候，将不自动展开该节点。
	private Boolean checked;// 表示该节点是否被选中。
	private Object attributes;// 被添加到节点的自定义属性。
	private List<EasyuiTree> children;// 一个节点数组声明了若干节点。
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Boolean getChecked() {
		return checked;
	}
	public void setChecked(Boolean checked) {
		this.checked = checked;
	}
	public Object getAttributes() {
		return attributes;
	}
	public void setAttributes(Object attributes) {
		this.attributes = attributes;
	}
	public List<EasyuiTree> getChildren() {
		return children;
	}
	public void setChildren(List<EasyuiTree> children) {
		this.children = children;
	}
	
	
	

}
