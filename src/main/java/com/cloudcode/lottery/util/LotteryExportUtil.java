/**
 * Project Name:Cloudcode-Lottery
 * File Name:LotteryExportUtil.java
 * Package Name:com.cloudcode.lottery.util
 * Date:2016-5-5上午10:22:26
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.
 *
*/

package com.cloudcode.lottery.util;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cloudcode.framework.utils.ExcelExportSetInfo;
import com.cloudcode.framework.utils.ExcelUtil;
import com.cloudcode.lottery.dao.ForecastDao;

@Repository
public class LotteryExportUtil {
	@Autowired
	private  ForecastDao forecastDao;
	
	
	public ByteArrayOutputStream getExportData(List<Map<String, Object>> dataList,String title)throws Exception{
		ByteArrayOutputStream baos = new ByteArrayOutputStream();

		ExcelExportSetInfo setInfo = new ExcelExportSetInfo();
		List<String[]> nameList = new ArrayList<String[]>();
		List<String[]> fieldNameList = new ArrayList<String[]>();
		nameList.add(new String[] { "strnum","odd","even","thanthreeratio0","thanthreeratio1","thanthreeratio2",
				"thanfiveratio0","thanfiveratio1","thanfiveratio2","thanfiveratio3","thanfiveratio4",
				"thansevenratio0","thansevenratio1","thansevenratio2","thansevenratio3","thansevenratio4","thansevenratio5","thansevenratio6",
				"upperareas","lowerareas","fourtharea1","fourtharea2","fourtharea3","fourtharea4",
				"sixarea1","sixarea2","sixarea3","sixarea4","sixarea5","sixarea6",
				"ninearea1","ninearea2","ninearea3","ninearea4","ninearea5","ninearea6","ninearea7","ninearea8","ninearea9",
				"consecutivenumber","length","total","thanthehorizontalspacingadd","thanthehorizontalspacing","t","lastvalueappears","horver","firstnum" });
		fieldNameList.add(new String[] { "号码","奇数","偶数","余3个数比0","余3个数比1","余3个数比2"
				,"余5个数比0","余5个数比1","余5个数比2","余5个数比3","余5个数比4",
				"余7个数比0","余7个数比1","余7个数比2","余7个数比3","余7个数比4","余7个数比5","余7个数比6"
				,"上区个数","下区个数","4区之比1","4区之比2","4区之比3","4区之比4",
				"6区之比1","6区之比2","6区之比3","6区之比4","6区之比5","6区之比6",
				"9区之比1","9区之比2","9区之比3","9区之比4","9区之比5","9区之比6","9区之比7","9区之比8","9区之比9",
				"连号个数","长度","总和","横向间隔和","横向间隔比","T值","出现尾数值","横纵比","起始号码"});
		Map<String, List<Map<String, Object>>> map = new LinkedHashMap<String, List<Map<String, Object>>>();
		map.put(title, dataList);
		
		setInfo.setObjsMap(map);
		setInfo.setFieldNames(nameList);
		String[] titleList = new String[]{title};

		setInfo.setTitles(titleList);
		setInfo.setHeadNames(fieldNameList);
		setInfo.setOut(baos);
		try {
			ExcelUtil.export2Excel(setInfo);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return baos;
	}
}

