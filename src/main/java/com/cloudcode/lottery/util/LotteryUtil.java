package com.cloudcode.lottery.util;

import org.springframework.stereotype.Repository;

import com.cloudcode.framework.utils.Check;
import com.cloudcode.lottery.model.base.Model;
@Repository
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
	public static void calcOddEvens(int num,Model lottery) {
		if(getOddEven(num)){
			if(null != lottery.getOdd()){
				lottery.setOdd(lottery.getOdd()+1);
			}else{
				lottery.setOdd(1);
			}
		}else{
			if(null !=lottery.getEven()){
				lottery.setEven(lottery.getEven()+1);
			}else{
				lottery.setEven(1);
			}
		}
	}
	public static void getOddEvens(Model lottery) {
		calcOddEvens(lottery.getA() , lottery);
		calcOddEvens(lottery.getB(), lottery);
		calcOddEvens(lottery.getC() , lottery);
		calcOddEvens(lottery.getD() , lottery);
		calcOddEvens(lottery.getE() , lottery);
		calcOddEvens(lottery.getF(), lottery);
		calcOddEvens(lottery.getG() , lottery);
	}
	/**
	 * 总和
	 * 
	 * @param lottery
	 * @return
	 */
	public static int getTotal(Model lottery) {
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
	public static Double getTotalAvg(Model lottery) {
		Double totalavg = getTotal(lottery) / (6*1.00);
		lottery.setTotalavg(totalavg);
		return totalavg;
	}

	/**
	 * 长度
	 * 
	 * @param lottery
	 * @return
	 */
	public static int getLength(Model lottery) {
		int length = lottery.getG() - lottery.getA();
		lottery.setLength(length);
		return length;
	}

	/**
	 * 余3
	 * 
	 * @param lottery
	 */
	public static void getThanthree(Model lottery) {
		thanthree(lottery.getA() % 3, lottery);
		thanthree(lottery.getB() % 3, lottery);
		thanthree(lottery.getC() % 3, lottery);
		thanthree(lottery.getD() % 3, lottery);
		thanthree(lottery.getE() % 3, lottery);
		thanthree(lottery.getF() % 3, lottery);
		thanthree(lottery.getG() % 3, lottery);

	}

	public static void thanthree(int three, Model lottery) {
		if (three == 0) {
			lottery.setThanthreeratio0(Check.toString(lottery.getThanthreeratio0()) + 1);
		} else if (three == 1) {
			lottery.setThanthreeratio1(Check.toString(lottery.getThanthreeratio1())+ 1);
		} else if (three == 2) {
			lottery.setThanthreeratio2(Check.toString(lottery.getThanthreeratio2()) + 1);
		}

	}

	/**
	 * 余5
	 * 
	 * @param lottery
	 */
	public static void getThanfive(Model lottery) {
		thanfive(lottery.getA() % 5, lottery);
		thanfive(lottery.getB() % 5, lottery);
		thanfive(lottery.getC() % 5, lottery);
		thanfive(lottery.getD() % 5, lottery);
		thanfive(lottery.getE() % 5, lottery);
		thanfive(lottery.getF() % 5, lottery);
		thanfive(lottery.getG() % 5, lottery);

	}

	public static void thanfive(int three, Model lottery) {
		if (three == 0) {
			lottery.setThanfiveratio0(Check.toString(lottery.getThanfiveratio0()) + 1);
		} else if (three == 1) {
			lottery.setThanfiveratio1(Check.toString(lottery.getThanfiveratio1() )+ 1);
		} else if (three == 2) {
			lottery.setThanfiveratio2(Check.toString(lottery.getThanfiveratio2() )+ 1);
		} else if (three == 3) {
			lottery.setThanfiveratio3(Check.toString(lottery.getThanfiveratio3()) + 1);
		} else if (three == 4) {
			lottery.setThanfiveratio4(Check.toString(lottery.getThanfiveratio4()) + 1);
		}

	}

	/**
	 * 余7
	 * 
	 * @param lottery
	 */
	public static void getThanseven(Model lottery) {
		thanseven(lottery.getA() % 7, lottery);
		thanseven(lottery.getB() % 7, lottery);
		thanseven(lottery.getC() % 7, lottery);
		thanseven(lottery.getD() % 7, lottery);
		thanseven(lottery.getE() % 7, lottery);
		thanseven(lottery.getF() % 7, lottery);
		thanseven(lottery.getG() % 7, lottery);

	}

	public static void thanseven(int three, Model lottery) {
		if (three == 0) {
			lottery.setThansevenratio0(Check.toString(lottery.getThansevenratio0()) + 1);
		} else if (three == 1) {
			lottery.setThansevenratio1(Check.toString(lottery.getThansevenratio1()) + 1);
		} else if (three == 2) {
			lottery.setThansevenratio2(Check.toString(lottery.getThansevenratio2()) + 1);
		} else if (three == 3) {
			lottery.setThansevenratio3(Check.toString(lottery.getThansevenratio3()) + 1);
		} else if (three == 4) {
			lottery.setThansevenratio4(Check.toString(lottery.getThansevenratio4()) + 1);
		} else if (three == 5) {
			lottery.setThansevenratio5(Check.toString(lottery.getThansevenratio5()) + 1);
		} else if (three == 6) {
			lottery.setThansevenratio6(Check.toString(lottery.getThansevenratio6()) + 1);
		}
	}

	/**
	 * 上下区间
	 * 
	 * @param lottery
	 */
	public static void getUpperLowerareas(Model lottery) {
		upperLowerareas(lottery.getA(), lottery);
		upperLowerareas(lottery.getB(), lottery);
		upperLowerareas(lottery.getC(), lottery);
		upperLowerareas(lottery.getD(), lottery);
		upperLowerareas(lottery.getE(), lottery);
		upperLowerareas(lottery.getF(), lottery);
		upperLowerareas(lottery.getG(), lottery);

	}

	public static void upperLowerareas(int lo, Model lottery) {
		if (lo <= 18) {
			lottery.setUpperareas(Check.toString(lottery.getUpperareas()) + 1);
		} else {
			lottery.setLowerareas(Check.toString(lottery.getLowerareas()) + 1);
		}

	}

	/**
	 * 4区
	 * 
	 * @param lottery
	 */
	public static void getfourtharea(Model lottery) {
		fourtharea(lottery.getA(), lottery);
		fourtharea(lottery.getB(), lottery);
		fourtharea(lottery.getC(), lottery);
		fourtharea(lottery.getD(), lottery);
		fourtharea(lottery.getE(), lottery);
		fourtharea(lottery.getF(), lottery);
		fourtharea(lottery.getG(), lottery);

	}

	public static void fourtharea(int lo, Model lottery) {
		if (lo <= 9) {
			lottery.setFourtharea1(Check.toString(lottery.getFourtharea1()) + 1);
		} else if (lo > 9 && lo <= 18) {
			lottery.setFourtharea2(Check.toString(lottery.getFourtharea2()) + 1);
		} else if (lo > 18 && lo <= 27) {
			lottery.setFourtharea3(Check.toString(lottery.getFourtharea3()) + 1);
		} else if (lo > 27 && lo <= 36) {
			lottery.setFourtharea4(Check.toString(lottery.getFourtharea4()) + 1);
		}
	}

	/**
	 * 6区
	 * 
	 * @param lottery
	 */
	public static void getsixarea(Model lottery) {
		sixarea(lottery.getA(), lottery);
		sixarea(lottery.getB(), lottery);
		sixarea(lottery.getC(), lottery);
		sixarea(lottery.getD(), lottery);
		sixarea(lottery.getE(), lottery);
		sixarea(lottery.getF(), lottery);
		sixarea(lottery.getG(), lottery);

	}

	public static void sixarea(int lo, Model lottery) {
		if (lo <= 6) {
			lottery.setSixarea1(Check.toString(lottery.getSixarea1()) + 1);
		} else if (lo > 7 && lo <= 12) {
			lottery.setSixarea2(Check.toString(lottery.getSixarea2()) + 1);
		} else if (lo > 12 && lo <= 18) {
			lottery.setSixarea3(Check.toString(lottery.getSixarea3()) + 1);
		} else if (lo > 18 && lo <= 24) {
			lottery.setSixarea4(Check.toString(lottery.getSixarea4()) + 1);
		} else if (lo > 24 && lo <= 30) {
			lottery.setSixarea5(Check.toString(lottery.getSixarea5()) + 1);
		} else if (lo > 30 && lo <= 36) {
			lottery.setSixarea6(Check.toString(lottery.getSixarea6()) + 1);
		}
	}

	/**
	 * 9区
	 * 
	 * @param lottery
	 */
	public static void getninearea(Model lottery) {
		ninearea(lottery.getA(), lottery);
		ninearea(lottery.getB(), lottery);
		ninearea(lottery.getC(), lottery);
		ninearea(lottery.getD(), lottery);
		ninearea(lottery.getE(), lottery);
		ninearea(lottery.getF(), lottery);
		ninearea(lottery.getG(), lottery);

	}

	public static void ninearea(int lo, Model lottery) {
		if (lo <= 4) {
			lottery.setNinearea1(Check.toString(lottery.getNinearea1()) + 1);
		} else if (lo > 4 && lo <= 8) {
			lottery.setNinearea2(Check.toString(lottery.getNinearea2()) + 1);
		} else if (lo > 8 && lo <= 12) {
			lottery.setNinearea3(Check.toString(lottery.getNinearea3()) + 1);
		} else if (lo > 12 && lo <= 16) {
			lottery.setNinearea4(Check.toString(lottery.getNinearea4()) + 1);
		} else if (lo > 16 && lo <= 20) {
			lottery.setNinearea5(Check.toString(lottery.getNinearea5()) + 1);
		} else if (lo > 20 && lo <= 24) {
			lottery.setNinearea6(Check.toString(lottery.getNinearea6()) + 1);
		} else if (lo > 24 && lo <= 28) {
			lottery.setNinearea7(Check.toString(lottery.getNinearea7()) + 1);
		} else if (lo > 28 && lo <= 32) {
			lottery.setNinearea8(Check.toString(lottery.getNinearea8()) + 1);
		} else if (lo > 32 && lo <= 36) {
			lottery.setNinearea9(Check.toString(lottery.getNinearea9()) + 1);
		}
	}

	/**
	 * 连号个数
	 * 
	 * @param lottery
	 * @return
	 */
	public static int getConsecutivenumber(Model lottery) {
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
	 * 
	 * @param interval
	 * @param lottery
	 * @return
	 */
	public static String getNumber(String interval, Model lottery) {
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
		lottery.setStrnum(sb.toString());
		return sb.toString();
	}

	public static void arrSort(int[] list) {
		int i, j, temp;
		for (i = 0; i < list.length - 1; i++) {
			for (j = 0; j < list.length - 1 - i; j++) {
				if (list[j] > list[j + 1]) {
					temp = list[j];
					list[j] = list[j + 1];
					list[j + 1] = temp;
				}
			}
		}
	}
	public static void arrSort(int[] list, Model lottery) {
		arrSort(list);
		lottery.setA(list[0]);
		lottery.setB(list[1]);
		lottery.setC(list[2]);
		lottery.setD(list[3]);
		lottery.setE(list[4]);
		lottery.setF(list[5]);
		lottery.setG(list[6]);
		lottery.setFirstnum(list[0]);
	}
	public static void arrSort(Model lottery) {
		int[] list = new int[7];
		list[0]=lottery.getA();
		list[1]=lottery.getB();
		list[2]=lottery.getC();
		list[3]=lottery.getD();
		list[4]=lottery.getE();
		list[5]=lottery.getF();
		list[6]=lottery.getG();
		arrSort(list,lottery);		
	}
	public static void calcLottery(Model lottery) {
		getOddEvens(lottery);//奇偶
		getTotal(lottery);//总和
		getTotalAvg(lottery);
		getLength(lottery);//长度
		getThanthree(lottery);
		getThanfive(lottery);
		getThanseven(lottery);
		getUpperLowerareas(lottery);
		getfourtharea(lottery);
		getsixarea(lottery);
		getninearea(lottery);
		getConsecutivenumber(lottery);
		getNumber(",", lottery);
	}
	public static void main(String[] args) {
		System.out.println(LotteryUtil.getOddEven(17));
		System.out.println(8 % 3);
		Model lottery = new Model();
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
