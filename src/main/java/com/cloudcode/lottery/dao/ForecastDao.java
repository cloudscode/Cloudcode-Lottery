package com.cloudcode.lottery.dao;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.cloudcode.framework.dao.BaseModelObjectDao;
import com.cloudcode.framework.dao.ModelObjectDao;
import com.cloudcode.framework.utils.HQLParamList;
import com.cloudcode.framework.utils.PageRange;
import com.cloudcode.framework.utils.PaginationSupport;
import com.cloudcode.framework.utils.StringUtils;
import com.cloudcode.lottery.ProjectConfig;
import com.cloudcode.lottery.model.Forecast;

@Repository
public class ForecastDao extends BaseModelObjectDao<Forecast> {
	@Resource(name = ProjectConfig.PREFIX + "forecastDao")
	private ModelObjectDao<Forecast> forecastDao;

	public void addForecast(Forecast entity) {
		forecastDao.createObject(entity);
	}
	public void addForecast(List<Forecast> list) {
		for(Forecast entity:list){
			forecastDao.createObject(entity);
		}
		
	}
	public PaginationSupport<Forecast> queryPagingData(Forecast hhXtCd, PageRange pageRange) {
		HQLParamList hqlParamList = new HQLParamList();
		List<Object> list=new ArrayList<Object>();
		if(!StringUtils.isEmpty(hhXtCd.getIssueid())){
			hqlParamList.addCondition(Restrictions.eq("issueid", hhXtCd.getIssueid()));
		}
		return this.queryPaginationSupport(Forecast.class, hqlParamList, pageRange);
	}
	public PaginationSupport<Forecast> queryForecastPagingData(Forecast hhXtCd, PageRange pageRange) {
		HQLParamList hqlParamList = new HQLParamList();
		List<Object> list=new ArrayList<Object>();
		if(!StringUtils.isEmpty(hhXtCd.getIssueid())){
			hqlParamList.addCondition(Restrictions.eq("issueid", hhXtCd.getIssueid()));
		}
		return this.queryPaginationSupport(Forecast.class, hqlParamList, pageRange);
	}
}
