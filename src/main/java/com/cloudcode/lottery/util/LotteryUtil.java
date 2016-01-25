package com.cloudcode.lottery.util;

import com.cloudcode.lottery.model.Lottery;

public class LotteryUtil {
	/**
	 * 奇偶数判断
	 * 
	 * @param num
	 * @return true奇false偶
	 */
	public static boolean getOddEven(int num) {
		if ((num & 1) != 0) {
			return true;
		}
		return false;
	}
	public static int getTotal(Lottery lottery){
		int total = lottery.getA()+lottery.getB()+lottery.getC()+lottery.getD()+lottery.getE()+lottery.getF()+lottery.getG();
		return total;
	}
	public static int getTotalAvg(Lottery lottery){
		return getTotal(lottery)/6;
	}
	public static void main(String[] args) {
		System.out.println(LotteryUtil.getOddEven(17));
		
	}
}
