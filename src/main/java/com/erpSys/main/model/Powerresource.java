package com.erpSys.main.model;

import java.util.Date;

import com.erpSys.main.utils.HabitUtils;

public class Powerresource {
	private int id;

	private String type;

	private String url;

	private String pathname;

	private String developer;

	private String creationtime;

	private String modificationtime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type == null ? null : type.trim();
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url == null ? null : url.trim();
	}

	public String getPathname() {
		return pathname;
	}

	public void setPathname(String pathname) {
		this.pathname = pathname == null ? null : pathname.trim();
	}

	public String getDeveloper() {
		return developer;
	}

	public void setDeveloper(String developer) {
		this.developer = developer == null ? null : developer.trim();
	}

	public String getCreationtime() {
		return creationtime;
	}

	public void setCreationtime(Date creationtime) {
		this.creationtime = HabitUtils.DateToStr2(creationtime);
	}

	public String getModificationtime() {
		return modificationtime;
	}

	public void setModificationtime(Date modificationtime) {
		this.modificationtime = HabitUtils.DateToStr2(modificationtime);
	}
}