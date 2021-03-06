/**
 * Project Name:Cloudcode-Lottery
 * File Name:ForecastUtil.java
 * Package Name:com.cloudcode.lottery.util
 * Date:2016-4-28下午5:06:49
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.
 *
 */

package com.cloudcode.lottery.util;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.web.socket.TextMessage;

import com.cloudcode.framework.utils.ListUtils;
import com.cloudcode.lottery.dao.ForecastDao;
import com.cloudcode.lottery.model.Forecast;
import com.cloudcode.lottery.model.History;
import com.cloudcode.lottery.model.base.Model;
import com.cloudcode.push.utils.SocketSessionUtils;

@Repository
public class ForecastRunnable extends Thread {
	private List<Forecast> lists;
	private ForecastDao forecastDao;
	private History phistory;
	private List<Model> lists3;
	private SocketSessionUtils socketSessionUtils;
	public void run() {

		for (Forecast forecast : getLists()) {
			LotteryUtil.getIntervaland(forecast, getPhistory());
			LotteryUtil.getHeat(forecast, getPhistory());
			LotteryUtil.getRatioNoNumbers(forecast, getLists3(), 0);
			LotteryUtil.getNewSideRepeatNo(forecast, getPhistory());
			LotteryUtil.getHorver(LotteryUtil.tolist(forecast), forecast);
		}
		getForecastDao().addForecast(getLists());
	}

	public List<Forecast> getLists() {
		return lists;
	}

	public void setLists(List<Forecast> lists) {
		this.lists = lists;
	}

	public ForecastDao getForecastDao() {
		return forecastDao;
	}

	public void setForecastDao(ForecastDao forecastDao) {
		this.forecastDao = forecastDao;
	}

	public History getPhistory() {
		return phistory;
	}

	public void setPhistory(History phistory) {
		this.phistory = phistory;
	}

	public List<Model> getLists3() {
		return lists3;
	}

	public void setLists3(List<Model> lists3) {
		this.lists3 = lists3;
	}
	public void delForecast(List<Forecast> lists, ForecastDao forecastDao) {
		List<List<Forecast>> result =ListUtils.splitList(lists, LotteryUtil.PageSize3); 
		for(List<Forecast> list:result){
			DelIssue delissue = new DelIssue(list, forecastDao);
			Thread s = new Thread(delissue);
			s.start();
		}
	}
	public void remindForecast(String issueId, ForecastDao forecastDao,SocketSessionUtils socketSessionUtils,Integer num) throws InterruptedException {
		remindIssue delissue = new remindIssue(issueId, forecastDao,socketSessionUtils,num);
		Thread s = new Thread(delissue);
		s.sleep(num*1000);
		s.start();
	}
	static class DelIssue extends Thread {
		private ForecastDao forecastDao;
		private List<Forecast> lists;

		public DelIssue() {
		}

		public DelIssue(List<Forecast> lists, ForecastDao forecastDao) {
			this.lists = lists;
			this.forecastDao = forecastDao;
		}

		public void run() {
			for (Forecast forecast : getLists()) {
					getForecastDao().deleteObject(forecast);
			}
		}
		public ForecastDao getForecastDao() {
			return forecastDao;
		}

		public void setForecastDao(ForecastDao forecastDao) {
			this.forecastDao = forecastDao;
		}

		public List<Forecast> getLists() {
			return lists;
		}

		public void setLists(List<Forecast> lists) {
			this.lists = lists;
		}

	}
	static class remindIssue extends Thread {
		private ForecastDao forecastDao;
		private String issueId;
		private SocketSessionUtils socketSessionUtils;
		private Integer num;
		public remindIssue(){}
		public remindIssue(String issueId, ForecastDao forecastDao,SocketSessionUtils socketSessionUtils,Integer num) {
			this.issueId = issueId;
			this.forecastDao = forecastDao;
			this.socketSessionUtils=socketSessionUtils;
			this.num = num;
		}

		public void run() {
			boolean r=false;
			do{
				if(num==0 || getForecastDao().findForRemind(getIssueId()).size()==0){
					TextMessage returnMessage = new TextMessage("系统提示：预测成功！");
					getSocketSessionUtils().sendMessageToUsers(returnMessage);
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
			}while(r);
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
		public SocketSessionUtils getSocketSessionUtils() {
			return socketSessionUtils;
		}

		public void setSocketSessionUtils(SocketSessionUtils socketSessionUtils) {
			this.socketSessionUtils = socketSessionUtils;
		}
		
	}
	public SocketSessionUtils getSocketSessionUtils() {
		return socketSessionUtils;
	}

	public void setSocketSessionUtils(SocketSessionUtils socketSessionUtils) {
		this.socketSessionUtils = socketSessionUtils;
	}
	
}
