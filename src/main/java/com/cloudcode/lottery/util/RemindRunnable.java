package com.cloudcode.lottery.util;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;

import com.cloudcode.lottery.dao.ForecastDao;
import com.cloudcode.push.utils.SocketSessionUtils;

@Repository
public class RemindRunnable extends Thread {
	private ForecastDao forecastDao;
	private String issueId;
	private SocketSessionUtils socketSessionUtils;
	private Integer num;
	private JdbcTemplate jdbcTemplate;
	public RemindRunnable(){}
	public RemindRunnable(String issueId, ForecastDao forecastDao,SocketSessionUtils socketSessionUtils,Integer num) {
		this.issueId = issueId;
		this.forecastDao = forecastDao;
		this.socketSessionUtils=socketSessionUtils;
		this.num = num;
	}

	public void run() {
		boolean r=false;
		do{
		  try {
			  	Thread.sleep(900);
				if(num==0 || (getForecastDao().countForRemind(getIssueId()))==0){
					if(sendMessage()){
						r=true;
					}
				}
				if(num !=0){
					Thread.sleep(num*1000);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}while(r!=true);
	}
	public boolean sendMessage(){
		   for (WebSocketSession user : getSocketSessionUtils().getClients().values()) {
			   if(user.getAttributes().containsKey("fissue")){
				    TextMessage returnMessage = new TextMessage("success");
				    getSocketSessionUtils().sendMessageToUser(user,returnMessage);
					System.out.println("****************系统提示：预测成功！******************");
					return true;
			   }
		   }
		return false;
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
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public SocketSessionUtils getSocketSessionUtils() {
		return socketSessionUtils;
	}
	public void setSocketSessionUtils(SocketSessionUtils socketSessionUtils) {
		this.socketSessionUtils = socketSessionUtils;
	}
	
}
