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

import com.cloudcode.lottery.dao.LotteryDao;
import com.cloudcode.lottery.model.Lottery;

@Repository
public class LotteryRunnable implements Runnable{
	
	private LotteryDao lotteryDao;
	private List<Lottery> list;
	public void run() {
		for(Lottery lottery:getList()){
			LotteryUtil.getHorver(LotteryUtil.tolist(lottery), lottery);
			getLotteryDao().updateObject(lottery);  
		}  
	}
	public LotteryDao getLotteryDao() {
		return lotteryDao;
	}
	public void setLotteryDao(LotteryDao lotteryDao) {
		this.lotteryDao = lotteryDao;
	}
	public List<Lottery> getList() {
		return list;
	}
	public void setList(List<Lottery> list) {
		this.list = list;
	}

}

