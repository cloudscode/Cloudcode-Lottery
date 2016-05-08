package com.cloudcode.lottery.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.socket.TextMessage;

import com.cloudcode.lottery.dao.ForecastDao;
import com.cloudcode.push.hndler.SystemWebSocketHandler;

@Repository
public class RemindRunnable extends Thread {
	private ForecastDao forecastDao;
	private String issueId;
	private SystemWebSocketHandler systemWebSocketHandler;
	private Integer num;
	private JdbcTemplate jdbcTemplate;
	public RemindRunnable(){}
	public RemindRunnable(String issueId, ForecastDao forecastDao,SystemWebSocketHandler systemWebSocketHandler,Integer num) {
		this.issueId = issueId;
		this.forecastDao = forecastDao;
		this.systemWebSocketHandler=systemWebSocketHandler;
		this.num = num;
	}

	public void run() {
		
		boolean r=false;
		do{
			if(num==0 || (getForecastDao().countForRemind(getIssueId()))==0){
				TextMessage returnMessage = new TextMessage("系统提示：预测成功！");
				getSystemWebSocketHandler().sendMessageToUsers(returnMessage);
				System.out.println("****************系统提示：预测成功！******************");
				r=true;
			}
			try {
				if(num !=0){
					Thread.sleep(num*100);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}while(r!=true);
	}
	public ForecastDao getForecastDao() {
		return forecastDao;
	}

	public void setForecastDao(ForecastDao forecastDao) {
		this.forecastDao = forecastDao;
	}
	public String getIssueId() {
		return issueId;
	}
	public void setIssueId(String issueId) {
		this.issueId = issueId;
	}
	public SystemWebSocketHandler getSystemWebSocketHandler() {
		return systemWebSocketHandler;
	}
	public void setSystemWebSocketHandler(
			SystemWebSocketHandler systemWebSocketHandler) {
		this.systemWebSocketHandler = systemWebSocketHandler;
	}
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
}
