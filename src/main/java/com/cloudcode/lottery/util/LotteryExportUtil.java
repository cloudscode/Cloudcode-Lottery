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
	
	
	public ByteArrayOutputStream getExportData(String id)throws Exception{
		ByteArrayOutputStream baos = new ByteArrayOutputStream();

		ExcelExportSetInfo setInfo = new ExcelExportSetInfo();
		List<String[]> nameList = new ArrayList<String[]>();
		List<String[]> fieldNameList = new ArrayList<String[]>();
		nameList.add(new String[] { "a" });
		fieldNameList.add(new String[] { "a"});
		Map<String, List<Map<String, Object>>> map = new LinkedHashMap<String, List<Map<String, Object>>>();
		String sql=" select a from lottery_forecast ";
		List<Map<String, Object>> dataList=new ArrayList<Map<String,Object>>();
		dataList = forecastDao.queryForMapListBySQL(sql, null);
		map.put("预测", dataList);
		
		setInfo.setObjsMap(map);
		setInfo.setFieldNames(nameList);
		String[] titleList = new String[]{"预测"};

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

