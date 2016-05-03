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

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.socket.TextMessage;

import com.cloudcode.framework.utils.ListUtils;
import com.cloudcode.lottery.dao.ForecastDao;
import com.cloudcode.lottery.model.Forecast;
import com.cloudcode.lottery.model.ForecastIssue;
import com.cloudcode.lottery.model.History;
import com.cloudcode.lottery.model.base.Model;
import com.cloudcode.push.hndler.SystemWebSocketHandler;

@Repository
public class ForecastRunnable extends Thread {
	private List<Forecast> lists;
	private ForecastDao forecastDao;
	private History phistory;
	private List<Model> lists3;
	private SystemWebSocketHandler systemWebSocketHandler;
	public void run() {

		for (Forecast forecast : getLists()) {
			LotteryUtil.getIntervaland(forecast, getPhistory());
			LotteryUtil.getHeat(forecast, getPhistory());
			LotteryUtil.getRatioNoNumbers(forecast, getLists3(), 0);
			LotteryUtil.getNewSideRepeatNo(forecast, getPhistory());
			LotteryUtil.getHorver(LotteryUtil.tolist(forecast), forecast);
		}
		getForecastDao().addForecast(getLists());
		TextMessage returnMessage = new TextMessage("系统提示：预测成功！");
		systemWebSocketHandler.sendMessageToUsers(returnMessage);
		System.out.println("****************系统提示：预测成功！******************");
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

	public SystemWebSocketHandler getSystemWebSocketHandler() {
		return systemWebSocketHandler;
	}

	public void setSystemWebSocketHandler(
			SystemWebSocketHandler systemWebSocketHandler) {
		this.systemWebSocketHandler = systemWebSocketHandler;
	}

	public void delForecast(List<Forecast> lists, ForecastDao forecastDao) {
		List<List<Forecast>> result =ListUtils.splitList(lists, LotteryUtil.PageSize3); 
		for(List<Forecast> list:result){
			DelIssue delissue = new DelIssue(list, forecastDao);
			Thread s = new Thread(delissue);
			s.start();
		}
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
}
