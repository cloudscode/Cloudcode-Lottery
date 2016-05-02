/**
 * Project Name:Cloudcode-Lottery
 * File Name:ForecastUtil.java
 * Package Name:com.cloudcode.lottery.util
 * Date:2016-4-28下午5:06:49
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.
 *
 */

package com.cloudcode.lottery.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cloudcode.framework.utils.ListUtils;
import com.cloudcode.lottery.dao.LotteryDao;
import com.cloudcode.lottery.model.Lottery;

@Repository
public class LotteryRunnable implements Runnable {

	private LotteryDao lotteryDao;
	
	public void run() {
		int num = 1;
	    int pageSize=2;
		do {
			List<Lottery> resultList = getLotteryDao().getLotteryList();
			List<List<Lottery>> lists=ListUtils.splitList(resultList, pageSize);
			for(List<Lottery> list:lists){
				calc(getLotteryDao(), list);
			}			
			num = getLotteryDao().getLotteryList().size();
			System.out.println("***************************" + num);
		} while (num != 0);
	}

	public LotteryDao getLotteryDao() {
		return lotteryDao;
	}

	public void setLotteryDao(LotteryDao lotteryDao) {
		this.lotteryDao = lotteryDao;
	}

	public synchronized void calc(LotteryDao lotteryDao, List<Lottery> list) {

		GenerateLottery generateNumber1 = new GenerateLottery(lotteryDao, list);
		Thread t1 = new Thread(generateNumber1);
		t1.start();
	}

	static class GenerateLottery extends Thread {
		public GenerateLottery() {

		}

		public GenerateLottery(LotteryDao lotteryDao, List<Lottery> list) {
			this.lotteryDao = lotteryDao;
			this.list = list;
		}

		private LotteryDao lotteryDao;
		private List<Lottery> list;

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

		public void run() {
			List<Lottery> list = getList();
			for (Lottery lottery : list) {
				LotteryUtil.getHorver(LotteryUtil.tolist(lottery), lottery);
				getLotteryDao().updateObject(lottery);
			}
		}
	}
}
