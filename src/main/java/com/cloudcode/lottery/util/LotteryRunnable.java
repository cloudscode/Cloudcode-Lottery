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

import com.cloudcode.lottery.dao.LotteryDao;
import com.cloudcode.lottery.model.Lottery;

@Repository
public class LotteryRunnable implements Runnable{
	
	private LotteryDao lotteryDao;
	public void run() {
		int num=1;
		do{
			List<Lottery> list =getLotteryDao().getLotteryList();
			calc(getLotteryDao(), list);
			for(Lottery lottery:list){
				LotteryUtil.getHorver(LotteryUtil.tolist(lottery), lottery);
				getLotteryDao().updateObject(lottery);  
			}           
			num = getLotteryDao().getLotteryList().size();
			System.out.println("***************************"+num);
		}while(num !=0);
		
	}
	public LotteryDao getLotteryDao() {
		return lotteryDao;
	}
	public void setLotteryDao(LotteryDao lotteryDao) {
		this.lotteryDao = lotteryDao;
	}
	public synchronized void calc(LotteryDao lotteryDao,List<Lottery> list){
		List<Lottery> list1= new ArrayList<Lottery>();
		List<Lottery> list2= new ArrayList<Lottery>();
		for(int i=0;i<list.size();i++){
			if(i<3){
				list1.add(list.get(i));
			}else{
				list2.add(list.get(i));
			}
		}
		GenerateLottery generateNumber1=new GenerateLottery(lotteryDao,list1);
		Thread t1 = new Thread(generateNumber1);
	    t1.start();
	    
	    GenerateLottery generateNumber2=new GenerateLottery(lotteryDao,list2);
		Thread t2 = new Thread(generateNumber2);
	    t2.start();
	    /*GenerateLottery generateNumber3=new GenerateLottery(lotteryDao,list);
		Thread t3 = new Thread(generateNumber3);
	    t3.start();
	    GenerateLottery generateNumber4=new GenerateLottery(lotteryDao,list);
		Thread t4 = new Thread(generateNumber4);
	    t4.start();
	    GenerateLottery generateNumber5=new GenerateLottery(lotteryDao,list);
		Thread t5 = new Thread(generateNumber5);
	    t5.start();
	    GenerateLottery generateNumber6=new GenerateLottery(lotteryDao,list);
		Thread t6 = new Thread(generateNumber6);
	    t6.start();
	    GenerateLottery generateNumber11=new GenerateLottery(lotteryDao,list);
		Thread t11 = new Thread(generateNumber11);
	    t11.start();
	    GenerateLottery generateNumber21=new GenerateLottery(lotteryDao,list);
		Thread t21 = new Thread(generateNumber21);
	    t21.start();
	    GenerateLottery generateNumber31=new GenerateLottery(lotteryDao,list);
		Thread t31 = new Thread(generateNumber31);
	    t31.start();
	    GenerateLottery generateNumber41=new GenerateLottery(lotteryDao,list);
		Thread t41 = new Thread(generateNumber41);
	    t41.start();
	    GenerateLottery generateNumber51=new GenerateLottery(lotteryDao,list);
		Thread t51 = new Thread(generateNumber51);
	    t51.start();
	    GenerateLottery generateNumber61=new GenerateLottery(lotteryDao,list);
		Thread t61 = new Thread(generateNumber61);
	    t61.start();*/
	}
	static class GenerateLottery extends Thread{
		 public GenerateLottery(){
			 
		 }
		 public GenerateLottery(LotteryDao lotteryDao,List<Lottery> list){
			 this.lotteryDao = lotteryDao;
			 this.list =list;
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
		public void run(){
			List<Lottery> list =getList();
			for(Lottery lottery:list){
				LotteryUtil.getHorver(LotteryUtil.tolist(lottery), lottery);
				getLotteryDao().updateObject(lottery);  
			}             
			System.out.println("******************end******************");
	     }
	 }
}

