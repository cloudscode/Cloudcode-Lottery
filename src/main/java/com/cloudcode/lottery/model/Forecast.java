package com.cloudcode.lottery.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.cloudcode.lottery.ProjectConfig;
import com.cloudcode.lottery.model.base.Model;

@Entity(name = ProjectConfig.NAME + "forecast")
@Table(name = ProjectConfig.NAME + "_forecast")
@org.hibernate.annotations.Entity(dynamicInsert = true, dynamicUpdate = true)
public class Forecast extends Model{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3565908821393470609L;
	private String issue;
	private String serialnum;
	private String lid;
	public String getIssue() {
		return issue;
	}
	public void setIssue(String issue) {
		this.issue = issue;
	}
	public String getSerialnum() {
		return serialnum;
	}
	public void setSerialnum(String serialnum) {
		this.serialnum = serialnum;
	}
	public String getLid() {
		return lid;
	}
	public void setLid(String lid) {
		this.lid = lid;
	}
	
}
