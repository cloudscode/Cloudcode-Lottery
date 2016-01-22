package com.cloudcode.lottery.util;

public class LotteryUtil {
	/**
	 * 奇偶数判断
	 * 
	 * @param num
	 * @return true奇false偶
	 */
	public static boolean oddeven(int num) {
		if ((num & 1) != 0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(LotteryUtil.oddeven(17));
	}
}
