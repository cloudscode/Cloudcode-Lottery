package com.cloudcode.lottery.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.cloudcode.framework.model.BaseModelObject;
import com.cloudcode.lottery.ProjectConfig;

@Entity(name = ProjectConfig.NAME + "forecastissue")
@Table(name = ProjectConfig.NAME + "_forecastissue")
@org.hibernate.annotations.Entity(dynamicInsert = true, dynamicUpdate = true)
public class ForecastIssue extends BaseModelObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3565908821393470609L;
	private String issue;
	private Date drawtime;
	private int forecastcount;
	private String logs;

	public String getIssue() {
		return issue;
	}

	public void setIssue(String issue) {
		this.issue = issue;
	}

	public Date getDrawtime() {
		return drawtime;
	}

	public void setDrawtime(Date drawtime) {
		this.drawtime = drawtime;
	}

	public int getForecastcount() {
		return forecastcount;
	}

	public void setForecastcount(int forecastcount) {
		this.forecastcount = forecastcount;
	}

	public String getLogs() {
		return logs;
	}

	public void setLogs(String logs) {
		this.logs = logs;
	}

}
