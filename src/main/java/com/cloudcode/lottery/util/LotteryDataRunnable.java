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

import com.cloudcode.framework.utils.ListUtils;
import com.cloudcode.lottery.dao.LotteryDao;
import com.cloudcode.lottery.model.Lottery;

@Repository
public class LotteryDataRunnable implements Runnable {

	private LotteryDao lotteryDao;
	
	public void run() {
		int num = 1;
		do {
			List<Lottery> resultList = getLotteryDao().getLotteryList();
			List<List<Lottery>> lists=ListUtils.splitList(resultList, LotteryUtil.PageSize1);
			for(List<Lottery> list:lists){
				 
			}
			try {
				Thread.sleep(30000);
			} catch (InterruptedException e) {
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

}
