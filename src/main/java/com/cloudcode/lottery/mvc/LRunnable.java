/**
 * Project Name:Cloudcode-Lottery
 * File Name:LRunnable.java
 * Package Name:com.cloudcode.lottery.mvc
 * Date:2016-4-30上午8:45:05
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.
 *
*/

package com.cloudcode.lottery.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cloudcode.lottery.dao.LotteryDao;
import com.cloudcode.lottery.util.LotteryRunnable;

/**
 * ClassName:LRunnable <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2016-4-30 上午8:45:05 <br/>
 * @author   cloudscode   ljzhuanjiao@Gmail.com 
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
@Service
public class LRunnable {
	@Autowired
	private LotteryRunnable lotteryRunnable;
	@Autowired
	private LotteryRunnable lotteryRunnable1;
	@Autowired
	private LotteryRunnable lotteryRunnable2;
	@Autowired
	private LotteryRunnable lotteryRunnable3;
	
	public void toCalc2(LotteryDao lotteryDao) {
		lotteryRunnable.setLotteryDao(lotteryDao);
		lotteryRunnable.run();
		/*lotteryRunnable1.setLotteryDao(lotteryDao);
		lotteryRunnable1.run();
		lotteryRunnable2.setLotteryDao(lotteryDao);
		lotteryRunnable2.run();
		lotteryRunnable3.setLotteryDao(lotteryDao);
		lotteryRunnable3.run();*/
	}
}

