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
import org.springframework.stereotype.Repository;

import com.cloudcode.lottery.dao.ForecastDao;
import com.cloudcode.lottery.model.Forecast;
import com.cloudcode.lottery.model.ForecastIssue;
import com.cloudcode.lottery.model.History;
import com.cloudcode.lottery.model.base.Model;

@Repository
public class ForecastRunnable extends Thread {
	private List<Forecast> lists;
	private ForecastDao forecastDao;
	private History phistory;
	private List<Model> lists3;

	public void run() {

		for (Forecast forecast : getLists()) {
			LotteryUtil.getIntervaland(forecast, getPhistory());
			LotteryUtil.getHeat(forecast, getPhistory());
			LotteryUtil.getRatioNoNumbers(forecast, getLists3(), 0);
			LotteryUtil.getNewSideRepeatNo(forecast, getPhistory());
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

	public void delForecast(ForecastIssue forecastIssue, ForecastDao forecastDao) {
		DelIssue delissue = new DelIssue(forecastIssue.getId(), forecastDao);
		Thread s = new Thread(delissue);
		s.start();
	}

	static class DelIssue extends Thread {
		private String issueid;
		private ForecastDao forecastDao;
private List<Forecast> lists;
		public DelIssue() {
		}

		public DelIssue(String issueid, ForecastDao forecastDao) {
			this.issueid = issueid;
			this.forecastDao = forecastDao;
		}

		public void run() {
			for (Forecast forecast : getForecastDao().findByIssue(getIssueid())) {
				getForecastDao().deleteObject(forecast);
			}
		}

		public String getIssueid() {
			return issueid;
		}

		public void setIssueid(String issueid) {
			this.issueid = issueid;
		}

		public ForecastDao getForecastDao() {
			return forecastDao;
		}

		public void setForecastDao(ForecastDao forecastDao) {
			this.forecastDao = forecastDao;
		}

	}
}
