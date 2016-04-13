package com.cloudcode.lottery.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.cloudcode.framework.utils.Check;
import com.cloudcode.framework.utils.UUID;
import com.cloudcode.lottery.dao.LotteryDao;
import com.cloudcode.lottery.model.Lottery;
import com.cloudcode.lottery.model.base.Base;
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
	public static void calcOddEvens(int num,Base lottery) {
		if(getOddEven(num)){
			lottery.setOdd(Check.toString(lottery.getOdd())+1);
		}else{
			lottery.setEven(Check.toString(lottery.getEven())+1);
		}
	}
	public static void getOddEvens(Base lottery) {
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
	public static int getTotal(Base lottery) {
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
	public static int getLength(Base lottery) {
		int length = lottery.getG() - lottery.getA();
		lottery.setLength(length);
		return length;
	}

	/**
	 * 余3
	 * 
	 * @param lottery
	 */
	public static void getThanthree(Base lottery) {
		thanthree(lottery.getA() % 3, lottery);
		thanthree(lottery.getB() % 3, lottery);
		thanthree(lottery.getC() % 3, lottery);
		thanthree(lottery.getD() % 3, lottery);
		thanthree(lottery.getE() % 3, lottery);
		thanthree(lottery.getF() % 3, lottery);
		thanthree(lottery.getG() % 3, lottery);

	}

	public static void thanthree(int three, Base lottery) {
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
	public static void getThanfive(Base lottery) {
		thanfive(lottery.getA() % 5, lottery);
		thanfive(lottery.getB() % 5, lottery);
		thanfive(lottery.getC() % 5, lottery);
		thanfive(lottery.getD() % 5, lottery);
		thanfive(lottery.getE() % 5, lottery);
		thanfive(lottery.getF() % 5, lottery);
		thanfive(lottery.getG() % 5, lottery);

	}

	public static void thanfive(int three, Base lottery) {
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
	public static void getThanseven(Base lottery) {
		thanseven(lottery.getA() % 7, lottery);
		thanseven(lottery.getB() % 7, lottery);
		thanseven(lottery.getC() % 7, lottery);
		thanseven(lottery.getD() % 7, lottery);
		thanseven(lottery.getE() % 7, lottery);
		thanseven(lottery.getF() % 7, lottery);
		thanseven(lottery.getG() % 7, lottery);

	}

	public static void thanseven(int three, Base lottery) {
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
	public static void getUpperLowerareas(Base lottery) {
		upperLowerareas(lottery.getA(), lottery);
		upperLowerareas(lottery.getB(), lottery);
		upperLowerareas(lottery.getC(), lottery);
		upperLowerareas(lottery.getD(), lottery);
		upperLowerareas(lottery.getE(), lottery);
		upperLowerareas(lottery.getF(), lottery);
		upperLowerareas(lottery.getG(), lottery);

	}

	public static void upperLowerareas(int lo, Base lottery) {
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
	public static void getfourtharea(Base lottery) {
		fourtharea(lottery.getA(), lottery);
		fourtharea(lottery.getB(), lottery);
		fourtharea(lottery.getC(), lottery);
		fourtharea(lottery.getD(), lottery);
		fourtharea(lottery.getE(), lottery);
		fourtharea(lottery.getF(), lottery);
		fourtharea(lottery.getG(), lottery);

	}

	public static void fourtharea(int lo, Base lottery) {
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
	public static void getsixarea(Base lottery) {
		sixarea(lottery.getA(), lottery);
		sixarea(lottery.getB(), lottery);
		sixarea(lottery.getC(), lottery);
		sixarea(lottery.getD(), lottery);
		sixarea(lottery.getE(), lottery);
		sixarea(lottery.getF(), lottery);
		sixarea(lottery.getG(), lottery);

	}

	public static void sixarea(int lo, Base lottery) {
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
	public static void getninearea(Base lottery) {
		ninearea(lottery.getA(), lottery);
		ninearea(lottery.getB(), lottery);
		ninearea(lottery.getC(), lottery);
		ninearea(lottery.getD(), lottery);
		ninearea(lottery.getE(), lottery);
		ninearea(lottery.getF(), lottery);
		ninearea(lottery.getG(), lottery);

	}

	public static void ninearea(int lo, Base lottery) {
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
	public static int getConsecutivenumber(Base lottery) {
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
	public static String getNumber(String interval, Base lottery) {
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
	public static void arrSort(int[] list, Base lottery) {
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
	public static void arrSort(Base lottery) {
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
		lottery.init(lottery);
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
		getT(lottery);
		getThanTheHorizontalSpacing(lottery);
		getLastValueAppears(lottery);
		//getNewSideRepeatNo(lottery, parent);
	}
	public static void lastValueAppears(Integer temp,List<Integer> list,Base lottery){
		Integer count=0;
		for(Integer num:list){
			if(num==temp){
				count++;
			}
		}
		if(count >=2){
			lottery.setLastvalueappears(Check.toString(lottery.getLastvalueappears())+""+temp+"+");
		}
	}
	public static void getLastValueAppears(Base lottery){
		List<Integer> list =new ArrayList<Integer>();
		list.add(lottery.getA() % 10);
		list.add(lottery.getB() % 10);
		list.add(lottery.getC() % 10);
		list.add(lottery.getD() % 10);
		list.add(lottery.getE() % 10);
		list.add(lottery.getF() % 10);
		list.add(lottery.getG() % 10);
		
		lastValueAppears(0,list, lottery);
		lastValueAppears(1,list, lottery);
		lastValueAppears(2,list, lottery);
		lastValueAppears(3,list, lottery);
		lastValueAppears(4,list, lottery);
		lastValueAppears(5,list, lottery);
		lastValueAppears(6,list, lottery);
		lastValueAppears(7,list, lottery);
		lastValueAppears(8,list, lottery);
		lastValueAppears(9,list, lottery);
		if(null != lottery.getLastvalueappears() && lottery.getLastvalueappears().endsWith("+"))
		lottery.setLastvalueappears(lottery.getLastvalueappears().substring(0,lottery.getLastvalueappears().length()-1));
	}
	public static void getThanTheHorizontalSpacing(Base lottery){
		lottery.setThanthehorizontalspacing((lottery.getB()-lottery.getA())+":"+(lottery.getC()-lottery.getB())
				+":"+(lottery.getD()-lottery.getC())
				+":"+(lottery.getE()-lottery.getD())
				+":"+(lottery.getF()-lottery.getE())
				+":"+(lottery.getG()-lottery.getF()));
		Integer thanthehorizontalspacingadd=(lottery.getB()-lottery.getA())+(lottery.getC()-lottery.getB())
				+(lottery.getD()-lottery.getC())
				+(lottery.getE()-lottery.getD())
				+(lottery.getF()-lottery.getE())
				+(lottery.getG()-lottery.getF());
		lottery.setThanthehorizontalspacingadd(thanthehorizontalspacingadd);
	}
	/**
	 * T值
	 * @param lottery
	 */
	public static void getT(Base lottery) {
		int[] list = new int[7];
		list[0]=lottery.getA();
		list[1]=lottery.getB();
		list[2]=lottery.getC();
		list[3]=lottery.getD();
		list[4]=lottery.getE();
		list[5]=lottery.getF();
		list[6]=lottery.getG();
		Map<Integer,Integer> map=new HashMap<Integer, Integer>();
		int temp=0,num=0;
		for (int i = 0; i < list.length - 1; i++) {
			num=list[i];
			for (int j = i+1; j < list.length; j++) {
				temp=list[j];
				if(temp > num && temp != num){
					//System.out.println(temp-num);
					map.put(temp-num, temp-num);
				}
			}
		}
		lottery.setT(map.size()-7);
		//System.out.println(map.size()-7);
	}
	/**
	 * 新边重号
	 * @param lottery
	 * @param parent
	 */
	public static void getNewSideRepeatNo(Model lottery,Model parent){
		List<Integer> list =tolist(lottery);
		Map<Integer,Integer> parentList =getMaps(parent);
		getNewSideRepeatNo( lottery.getA(), parentList,lottery);
		getNewSideRepeatNo( lottery.getB(), parentList,lottery);
		getNewSideRepeatNo( lottery.getC(), parentList,lottery);
		getNewSideRepeatNo( lottery.getD(), parentList,lottery);
		getNewSideRepeatNo( lottery.getE(), parentList,lottery);
		getNewSideRepeatNo( lottery.getF(), parentList,lottery);
		getNewSideRepeatNo( lottery.getG(), parentList,lottery);
	}
	public static void getNewSideRepeatNo(int temp,Map<Integer,Integer> parentList,Model lottery){
		int newno=0;
		int side=0;
		int repeat=0;	
		if(parentList.containsKey(temp+1) || parentList.containsKey(temp-1)){
				side++;
			}else if(parentList.containsKey(temp)){
				repeat++;
			}else if(!parentList.containsKey(temp+1) && !parentList.containsKey(temp-1) && !parentList.containsKey(temp)){
				newno++;
			}
		lottery.setNewno(Check.toString(lottery.getNewno())+newno);
		lottery.setRepeatno(Check.toString(lottery.getRepeatno())+repeat);
		lottery.setNoside(Check.toString(lottery.getNoside())+side);
	}
	
	public static List<Integer> tolist(Model lottery) {
		List<Integer> list =new ArrayList<Integer>();
		list.add(lottery.getA());
		list.add(lottery.getB());
		list.add(lottery.getC());
		list.add(lottery.getD());
		list.add(lottery.getE());
		list.add(lottery.getF());
		list.add(lottery.getG());
		return list;
	}
	/**
	 * 与上期号码数比
	 * @param lottery
	 * @param lists
	 * @param i
	 */
	public static void getRatioNoNumbers(Model lottery,List<Model> lists,int i){
		getRatioNoNumbers(lottery,lists, i,3);
		getRatioNoNumbers(lottery,lists, i,5);
		getRatioNoNumbers(lottery,lists, i,7);
		getRatioNoNumbers(lottery,lists, i,10);
	}
	public static void getRatioNoNumbers(Model lottery,List<Model> lists,int i,int t){
		 if(lists.size()>(i+t)){
			 Map<Integer,Integer> maps =new HashMap<Integer, Integer>();
			 for(int j=1;j<=t;j++){
				 maps.putAll(getMaps(lists.get(i+j)));
			 }
			 int count=0;
			 List<Integer> list = tolist(lottery);
			 for(Integer num:list){
				 count += ratioNoMaps(num,maps);
			 }
			String value=(7-count)+":"+count;
			if(t==3){
				lottery.setRatioonthethreenumbers(value);
			 }else if(t==5){
				 lottery.setRatioonthefivenumbers(value);
			 }else if(t==7){
				 lottery.setRatioonthesevennumbers(value);
			 }else if(t==10){
				 lottery.setRatioonthetennumbers(value);
			 }
		 }else{
			 if(t==3){
				 lottery.setRatioonthethreenumbers("与上三期号码数比：期数未达到条件");
			 }else if(t==5){
				 lottery.setRatioonthefivenumbers("与上五期号码数比：期数未达到条件");
			 }else if(t==7){
				 lottery.setRatioonthesevennumbers("与上七期号码数比：期数未达到条件");
			 }else if(t==10){
				 lottery.setRatioonthetennumbers("与上十期号码数比：期数未达到条件");
			 }
		 }
	}
	public static int ratioNoMaps(int num, Map<Integer,Integer> maps) {
		if(maps.containsKey(num)){
			return 1;
		}
		return 0;
	}
	public static Map<Integer,Integer> getMaps(Model lottery) {
		Map<Integer,Integer> list =new HashMap<Integer,Integer>();
		list.put(lottery.getA(),lottery.getA());
		list.put(lottery.getB(),lottery.getB());
		list.put(lottery.getC(),lottery.getC());
		list.put(lottery.getD(),lottery.getD());
		list.put(lottery.getE(),lottery.getE());
		list.put(lottery.getF(),lottery.getF());
		list.put(lottery.getG(),lottery.getG());
		return list;
	}
	public static void main(String[] args) {
		/*System.out.println(LotteryUtil.getOddEven(17));
		System.out.println(8 % 3);
		Model lottery = new Model();
		lottery.setA(3);
		lottery.setB(6);
		lottery.setC(7);
		lottery.setD(15);
		lottery.setE(16);
		lottery.setF(17);
		lottery.setG(35);
		Model plottery = new Model();
		plottery.setA(1);
		plottery.setB(8);
		plottery.setC(7);
		plottery.setD(13);
		plottery.setE(17);
		plottery.setF(19);
		plottery.setG(36);
		LotteryUtil.getLastValueAppears(lottery);
		System.out.println("LastValueAppears:"+lottery.getLastvalueappears());
		LotteryUtil.getConsecutivenumber(lottery);
		LotteryUtil.getNewSideRepeatNo(lottery, plottery);
		System.out.println(lottery.getNewno()+":"+lottery.getNoside()+":"+lottery.getRepeatno());
		System.out.println("连号个数：" + lottery.getConsecutivenumber());*/
		//Lottery( );
	}
	/**
	 * 热度
	 * @param lottery
	 * @param plottery
	 * @param i
	 */
	public static void getHeat(Model lottery,Model plottery,int i) {
		if(i==0){
			lottery.initHeat0(lottery);
		}else{
			 List<Integer> list = tolist(lottery);
			 for(Integer num:list){
				 lottery.copyHeat0(lottery, plottery);
				 lottery.calcHeat0(lottery, plottery, num);
			 }
		}
	}
	/**
	 * 间隔和
	 * @param lottery
	 * @param plottery
	 * @param i
	 */
	public static void getIntervaland(Model lottery,Model plottery,int i) {
//		if(i==0){
//			lottery.initIntervaland0(lottery);
//		}else{
			 List<Integer> list = tolist(lottery);
			 lottery.copyIntervaland0(lottery, plottery);
			 for(Integer num:list){
				 lottery.calcIntervaland0(lottery, plottery, num);
			 }
			 if(!Check.isEmpty(lottery.getIntegerervaland()) && lottery.getIntegerervaland().endsWith("+")){
				 lottery.setIntegerervaland(lottery.getIntegerervaland().substring(0, lottery.getIntegerervaland().length()-1));
			 }
//		}
	}
	public static void calcBaseLottery(Base lottery) {
		lottery.init(lottery);
		getOddEvens(lottery);//奇偶
		getTotal(lottery);//总和
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
		getT(lottery);
		getThanTheHorizontalSpacing(lottery);
		getLastValueAppears(lottery);
		
	}
	public static void initBaseLottery(LotteryDao lotteryDao) {
		for(int a=1;a<37;a++){
			for(int b=a+1;b<37;b++){
				for(int c=b+1;c<37;c++){
					for(int d=c+1;d<37;d++){
						for(int e=d+1;e<37;e++){
							for(int f=e+1;f<37;f++){
								for(int g=f+1;g<37;g++){
									Lottery lottery=new Lottery();
									lottery.setId(UUID.generateUUID());
									lottery.setA(a);
									lottery.setB(b);
									lottery.setC(c);
									lottery.setD(d);
									lottery.setE(e);
									lottery.setF(f);
									lottery.setG(g);
									arrSort(lottery);
									calcBaseLottery(lottery);
									lotteryDao.addLottery(lottery);
									System.out.println(a+":"+b+":"+c+":"+d+":"+e+":"+f+":"+g );
								}
							}
						}
					}
				}
			 
			}
		}
	}
}
