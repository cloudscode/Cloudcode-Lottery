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
		lottery.setTotal(total);
		return total;
	}
	public static int getTotalAvg(Lottery lottery){
		int totalavg = getTotal(lottery)/6;
		lottery.setTotalavg(totalavg);
		return totalavg;
	}
	public static int getLength(Lottery lottery){
		int length = lottery.getG()-lottery.getA();
		lottery.setLength(length);
		return length;
	}
	public static void getThanthree(Lottery lottery){
		thanthree(lottery.getA()%3, lottery);
		thanthree(lottery.getB()%3, lottery);
		thanthree(lottery.getC()%3, lottery);
		thanthree(lottery.getD()%3, lottery);
		thanthree(lottery.getE()%3, lottery);
		thanthree(lottery.getF()%3, lottery);
		thanthree(lottery.getG()%3, lottery);
		
	}
	public static void thanthree(int three,Lottery lottery){
		if(three ==0){
			lottery.setThanthreeratio0(lottery.getThanthreeratio0()+1);
		}else if(three ==1){
			lottery.setThanthreeratio1(lottery.getThanthreeratio1()+1);
		}else if(three ==2){
			lottery.setThanthreeratio2(lottery.getThanthreeratio2()+1);
		}
		
	}
	public static void getThanfive(Lottery lottery){
		thanfive(lottery.getA()%5, lottery);
		thanfive(lottery.getB()%5, lottery);
		thanfive(lottery.getC()%5, lottery);
		thanfive(lottery.getD()%5, lottery);
		thanfive(lottery.getE()%5, lottery);
		thanfive(lottery.getF()%5, lottery);
		thanfive(lottery.getG()%5, lottery);
		
	}
	public static void thanfive(int three,Lottery lottery){
		if(three ==0){
			lottery.setThanfiveratio0(lottery.getThanfiveratio0()+1);
		}else if(three ==1){
			lottery.setThanfiveratio1(lottery.getThanfiveratio1()+1);
		}else if(three ==2){
			lottery.setThanfiveratio2(lottery.getThanfiveratio2()+1);
		}else if(three ==3){
			lottery.setThanfiveratio3(lottery.getThanfiveratio3()+1);
		}else if(three ==4){
			lottery.setThanfiveratio4(lottery.getThanfiveratio4()+1);
		}
		
	}
	public static void main(String[] args) {
		System.out.println(LotteryUtil.getOddEven(17));
		System.out.println(8%3);
	}
}
