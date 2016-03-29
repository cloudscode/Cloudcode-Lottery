package com.cloudcode.lottery.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.cloudcode.lottery.ProjectConfig;

@Entity(name = ProjectConfig.NAME + "history")
@Table(name = ProjectConfig.NAME + "_history")
@org.hibernate.annotations.Entity(dynamicInsert = true, dynamicUpdate = true)
public class History extends Lottery{
	/**
	 * 
	 */
	private static final long serialVersionUID = -676274772235252137L;
	private int issue;
	private int serialnum;
	public int getIssue() {
		return issue;
	}
	public void setIssue(int issue) {
		this.issue = issue;
	}
	public int getSerialnum() {
		return serialnum;
	}
	public void setSerialnum(int serialnum) {
		this.serialnum = serialnum;
	}
	
}
