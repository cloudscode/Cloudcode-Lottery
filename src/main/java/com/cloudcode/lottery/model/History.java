package com.cloudcode.lottery.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.cloudcode.lottery.ProjectConfig;
import com.cloudcode.lottery.model.base.Model;

@Entity//(name = ProjectConfig.NAME + "history")
@Table(name = ProjectConfig.NAME + "_history")
@org.hibernate.annotations.Entity(dynamicInsert = true, dynamicUpdate = true)
public class History extends Model{
	/**
	 * 
	 */
	private static final long serialVersionUID = -676274772235252137L;
	private String issue;
	private String serialnum;
	private Integer specialnum;
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
	public Integer getSpecialnum() {
		return specialnum;
	}
	public void setSpecialnum(Integer specialnum) {
		this.specialnum = specialnum;
	}
	
}
