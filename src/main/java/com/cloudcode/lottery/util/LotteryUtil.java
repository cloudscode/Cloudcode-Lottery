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

	/**
	 * 总和
	 * 
	 * @param lottery
	 * @return
	 */
	public static int getTotal(Lottery lottery) {
		int total = lottery.getA() + lottery.getB() + lottery.getC()
				+ lottery.getD() + lottery.getE() + lottery.getF()
				+ lottery.getG();
		lottery.setTotal(total);
		return total;
	}

	/**
	 * 总和平均
	 * 
	 * @param lottery
	 * @return
	 */
	public static int getTotalAvg(Lottery lottery) {
		int totalavg = getTotal(lottery) / 6;
		lottery.setTotalavg(totalavg);
		return totalavg;
	}

	/**
	 * 长度
	 * 
	 * @param lottery
	 * @return
	 */
	public static int getLength(Lottery lottery) {
		int length = lottery.getG() - lottery.getA();
		lottery.setLength(length);
		return length;
	}

	/**
	 * 余3
	 * 
	 * @param lottery
	 */
	public static void getThanthree(Lottery lottery) {
		thanthree(lottery.getA() % 3, lottery);
		thanthree(lottery.getB() % 3, lottery);
		thanthree(lottery.getC() % 3, lottery);
		thanthree(lottery.getD() % 3, lottery);
		thanthree(lottery.getE() % 3, lottery);
		thanthree(lottery.getF() % 3, lottery);
		thanthree(lottery.getG() % 3, lottery);

	}

	public static void thanthree(int three, Lottery lottery) {
		if (three == 0) {
			lottery.setThanthreeratio0(lottery.getThanthreeratio0() + 1);
		} else if (three == 1) {
			lottery.setThanthreeratio1(lottery.getThanthreeratio1() + 1);
		} else if (three == 2) {
			lottery.setThanthreeratio2(lottery.getThanthreeratio2() + 1);
		}

	}

	/**
	 * 余5
	 * 
	 * @param lottery
	 */
	public static void getThanfive(Lottery lottery) {
		thanfive(lottery.getA() % 5, lottery);
		thanfive(lottery.getB() % 5, lottery);
		thanfive(lottery.getC() % 5, lottery);
		thanfive(lottery.getD() % 5, lottery);
		thanfive(lottery.getE() % 5, lottery);
		thanfive(lottery.getF() % 5, lottery);
		thanfive(lottery.getG() % 5, lottery);

	}

	public static void thanfive(int three, Lottery lottery) {
		if (three == 0) {
			lottery.setThanfiveratio0(lottery.getThanfiveratio0() + 1);
		} else if (three == 1) {
			lottery.setThanfiveratio1(lottery.getThanfiveratio1() + 1);
		} else if (three == 2) {
			lottery.setThanfiveratio2(lottery.getThanfiveratio2() + 1);
		} else if (three == 3) {
			lottery.setThanfiveratio3(lottery.getThanfiveratio3() + 1);
		} else if (three == 4) {
			lottery.setThanfiveratio4(lottery.getThanfiveratio4() + 1);
		}

	}

	/**
	 * 余7
	 * 
	 * @param lottery
	 */
	public static void getThanseven(Lottery lottery) {
		thanseven(lottery.getA() % 7, lottery);
		thanseven(lottery.getB() % 7, lottery);
		thanseven(lottery.getC() % 7, lottery);
		thanseven(lottery.getD() % 7, lottery);
		thanseven(lottery.getE() % 7, lottery);
		thanseven(lottery.getF() % 7, lottery);
		thanseven(lottery.getG() % 7, lottery);

	}

	public static void thanseven(int three, Lottery lottery) {
		if (three == 0) {
			lottery.setThansevenratio0(lottery.getThansevenratio0() + 1);
		} else if (three == 1) {
			lottery.setThansevenratio1(lottery.getThansevenratio1() + 1);
		} else if (three == 2) {
			lottery.setThansevenratio2(lottery.getThansevenratio2() + 1);
		} else if (three == 3) {
			lottery.setThansevenratio3(lottery.getThansevenratio3() + 1);
		} else if (three == 4) {
			lottery.setThansevenratio4(lottery.getThansevenratio4() + 1);
		} else if (three == 5) {
			lottery.setThansevenratio5(lottery.getThansevenratio5() + 1);
		} else if (three == 6) {
			lottery.setThansevenratio6(lottery.getThansevenratio6() + 1);
		}
	}

	/**
	 * 上下区间
	 * 
	 * @param lottery
	 */
	public static void getUpperLowerareas(Lottery lottery) {
		upperLowerareas(lottery.getA(), lottery);
		upperLowerareas(lottery.getB(), lottery);
		upperLowerareas(lottery.getC(), lottery);
		upperLowerareas(lottery.getD(), lottery);
		upperLowerareas(lottery.getE(), lottery);
		upperLowerareas(lottery.getF(), lottery);
		upperLowerareas(lottery.getG(), lottery);

	}

	public static void upperLowerareas(int lo, Lottery lottery) {
		if (lo <= 18) {
			lottery.setUpperareas(lottery.getUpperareas() + 1);
		} else {
			lottery.setLowerareas(lottery.getLowerareas() + 1);
		}

	}

	/**
	 * 4区
	 * 
	 * @param lottery
	 */
	public static void getfourtharea(Lottery lottery) {
		fourtharea(lottery.getA(), lottery);
		fourtharea(lottery.getB(), lottery);
		fourtharea(lottery.getC(), lottery);
		fourtharea(lottery.getD(), lottery);
		fourtharea(lottery.getE(), lottery);
		fourtharea(lottery.getF(), lottery);
		fourtharea(lottery.getG(), lottery);

	}

	public static void fourtharea(int lo, Lottery lottery) {
		if (lo <= 9) {
			lottery.setFourtharea1(lottery.getFourtharea1() + 1);
		} else if (lo > 9 && lo <= 18) {
			lottery.setFourtharea2(lottery.getFourtharea2() + 1);
		} else if (lo > 18 && lo <= 27) {
			lottery.setFourtharea3(lottery.getFourtharea3() + 1);
		} else if (lo > 27 && lo <= 36) {
			lottery.setFourtharea4(lottery.getFourtharea4() + 1);
		}
	}

	/**
	 * 6区
	 * 
	 * @param lottery
	 */
	public static void getsixarea(Lottery lottery) {
		sixarea(lottery.getA(), lottery);
		sixarea(lottery.getB(), lottery);
		sixarea(lottery.getC(), lottery);
		sixarea(lottery.getD(), lottery);
		sixarea(lottery.getE(), lottery);
		sixarea(lottery.getF(), lottery);
		sixarea(lottery.getG(), lottery);

	}

	public static void sixarea(int lo, Lottery lottery) {
		if (lo <= 6) {
			lottery.setSixarea1(lottery.getSixarea1() + 1);
		} else if (lo > 7 && lo <= 12) {
			lottery.setSixarea2(lottery.getSixarea2() + 1);
		} else if (lo > 12 && lo <= 18) {
			lottery.setSixarea3(lottery.getSixarea3() + 1);
		} else if (lo > 18 && lo <= 24) {
			lottery.setSixarea4(lottery.getSixarea4() + 1);
		} else if (lo > 24 && lo <= 30) {
			lottery.setSixarea5(lottery.getSixarea5() + 1);
		} else if (lo > 30 && lo <= 36) {
			lottery.setSixarea6(lottery.getSixarea6() + 1);
		}
	}

	/**
	 * 9区
	 * 
	 * @param lottery
	 */
	public static void getninearea(Lottery lottery) {
		ninearea(lottery.getA(), lottery);
		ninearea(lottery.getB(), lottery);
		ninearea(lottery.getC(), lottery);
		ninearea(lottery.getD(), lottery);
		ninearea(lottery.getE(), lottery);
		ninearea(lottery.getF(), lottery);
		ninearea(lottery.getG(), lottery);

	}

	public static void ninearea(int lo, Lottery lottery) {
		if (lo <= 4) {
			lottery.setNinearea1(lottery.getNinearea1() + 1);
		} else if (lo > 4 && lo <= 8) {
			lottery.setNinearea2(lottery.getNinearea2() + 1);
		} else if (lo > 8 && lo <= 12) {
			lottery.setNinearea3(lottery.getNinearea3() + 1);
		} else if (lo > 12 && lo <= 16) {
			lottery.setNinearea4(lottery.getNinearea4() + 1);
		} else if (lo > 16 && lo <= 20) {
			lottery.setNinearea5(lottery.getNinearea5() + 1);
		} else if (lo > 20 && lo <= 24) {
			lottery.setNinearea6(lottery.getNinearea6() + 1);
		} else if (lo > 24 && lo <= 28) {
			lottery.setNinearea7(lottery.getNinearea7() + 1);
		} else if (lo > 28 && lo <= 32) {
			lottery.setNinearea8(lottery.getNinearea8() + 1);
		} else if (lo > 32 && lo <= 36) {
			lottery.setNinearea9(lottery.getNinearea9() + 1);
		}
	}

	/**
	 * 连号个数
	 * 
	 * @param lottery
	 * @return
	 */
	public static int getConsecutivenumber(Lottery lottery) {
		int count = 0;
		if (lottery.getA() + 1 == lottery.getB()) {
			count++;
		}
		if (lottery.getB() + 1 == lottery.getC()) {
			count++;
		}
		if (lottery.getC() + 1 == lottery.getD()) {
			count++;
		}
		if (lottery.getD() + 1 == lottery.getE()) {
			count++;
		}
		if (lottery.getE() + 1 == lottery.getF()) {
			count++;
		}
		if (lottery.getF() + 1 == lottery.getG()) {
			count++;
		}
		lottery.setConsecutivenumber(count);
		return count;
	}
	/**
	 * 期号
	 * @param interval
	 * @param lottery
	 * @return
	 */
	public static String getNumber(String interval, Lottery lottery) {
		StringBuffer sb = new StringBuffer();
		sb.append(lottery.getA());
		sb.append(interval);
		sb.append(lottery.getB());
		sb.append(interval);
		sb.append(lottery.getC());
		sb.append(interval);
		sb.append(lottery.getD());
		sb.append(interval);
		sb.append(lottery.getE());
		sb.append(interval);
		sb.append(lottery.getF());
		sb.append(interval);
		sb.append(lottery.getG());
		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println(LotteryUtil.getOddEven(17));
		System.out.println(8 % 3);
		Lottery lottery = new Lottery();
		lottery.setA(3);
		lottery.setB(6);
		lottery.setC(7);
		lottery.setD(15);
		lottery.setE(16);
		lottery.setF(17);
		lottery.setG(35);
		LotteryUtil.getConsecutivenumber(lottery);
		System.out.println("连号个数：" + lottery.getConsecutivenumber());
	}
}
