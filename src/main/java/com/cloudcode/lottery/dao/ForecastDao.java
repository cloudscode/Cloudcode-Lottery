package com.cloudcode.lottery.dao;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cloudcode.framework.dao.BaseModelObjectDao;
import com.cloudcode.framework.dao.ModelObjectDao;
import com.cloudcode.framework.utils.CriterionUtil;
import com.cloudcode.framework.utils.HQLParamList;
import com.cloudcode.framework.utils.PageRange;
import com.cloudcode.framework.utils.PaginationSupport;
import com.cloudcode.framework.utils.StringUtils;
import com.cloudcode.lottery.ProjectConfig;
import com.cloudcode.lottery.model.Forecast;
import com.cloudcode.lottery.model.Lottery;

@Repository
public class ForecastDao extends BaseModelObjectDao<Forecast> {
	@Resource(name = ProjectConfig.PREFIX + "forecastDao")
	private ModelObjectDao<Forecast> forecastDao;
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void addForecast(Forecast entity) {
		forecastDao.createObject(entity);
	}
	public void addForecast(List<Forecast> list) {
		for(Forecast entity:list){
			forecastDao.createObject(entity);
		}
		
	}
	public void deleteObject(Forecast entity) {
		forecastDao.deleteObject(entity);
	}
	public PaginationSupport<Forecast> queryPagingData(Forecast hhXtCd, PageRange pageRange) {
		HQLParamList hqlParamList = new HQLParamList();
		List<Object> list=new ArrayList<Object>();
		if(!StringUtils.isEmpty(hhXtCd.getIssueid())){
			hqlParamList.addCondition(Restrictions.eq("issueid", hhXtCd.getIssueid()));
		}
		return this.queryPaginationSupport(Forecast.class, hqlParamList, pageRange);
	}
	public PaginationSupport<Forecast> queryForecastPagingData(Forecast hhXtCd, PageRange pageRange,HttpServletRequest request) {
		HQLParamList hqlParamList = new HQLParamList();
		List<Object> list=new ArrayList<Object>();
		String issueid = request.getParameter("issueid");
		String intervalAndTotalStrart=request.getParameter("intervalAndTotalStrart");
		String intervalAndTotalEnd=request.getParameter("intervalAndTotalEnd");
		String horVer=request.getParameter("horVer");
		String repeatStart=request.getParameter("repeatStart");
		String repeatEnd=request.getParameter("repeatEnd");
		String noSideStart=request.getParameter("noSideStart");
		String noSideEnd=request.getParameter("noSideEnd");
		String newNoStart=request.getParameter("newNoStart");
		String newNoEnd=request.getParameter("newNoEnd");
		String lastValueAppears=request.getParameter("lastValueAppears");
		String ratioOnTheThreeNumbers=request.getParameter("ratioOnTheThreeNumbers");
		String ratioOnTheFiveNumbers=request.getParameter("ratioOnTheFiveNumbers");
		String ratioOnTheSevenNumbers=request.getParameter("ratioOnTheSevenNumbers");
		String ratioOnTheTenNumbers=request.getParameter("ratioOnTheTenNumbers");
		if(!StringUtils.isEmpty(issueid)){
			hqlParamList.addCondition(Restrictions.eq("issueid", issueid));
		}
		if(!StringUtils.isEmpty(horVer)){
			hqlParamList.addCondition(Restrictions.eq("horver", horVer));
		}
		if(!StringUtils.isEmpty(lastValueAppears)){
			hqlParamList.addCondition(Restrictions.eq("lastvalueappears", lastValueAppears));
		}
		if(!StringUtils.isEmpty(ratioOnTheThreeNumbers)){
			hqlParamList.addCondition(Restrictions.eq("ratioonthethreenumbers", ratioOnTheThreeNumbers));
		}
		if(!StringUtils.isEmpty(ratioOnTheFiveNumbers)){
			hqlParamList.addCondition(Restrictions.eq("ratioonthefivenumbers", ratioOnTheFiveNumbers));
		}
		if(!StringUtils.isEmpty(ratioOnTheSevenNumbers)){
			hqlParamList.addCondition(Restrictions.eq("ratioonthesevennumbers", ratioOnTheSevenNumbers));
		}
		if(!StringUtils.isEmpty(ratioOnTheTenNumbers)){
			hqlParamList.addCondition(Restrictions.eq("ratioonthetennumbers", ratioOnTheTenNumbers));
		}
		CriterionUtil.setCriterion(intervalAndTotalStrart, intervalAndTotalEnd, hqlParamList, "integerervalandtotal");
		CriterionUtil.setCriterion(repeatStart, repeatEnd, hqlParamList, "repeatno");
		CriterionUtil.setCriterion(noSideStart, noSideEnd, hqlParamList, "noside");
		CriterionUtil.setCriterion(newNoStart, newNoEnd, hqlParamList, "newno");
		
		return this.queryPaginationSupport(Forecast.class, hqlParamList, pageRange);
	}
	public List<Forecast> findByIssue(String issueId) {
		Criteria criterion = this.getSession().createCriteria(
				Forecast.class);
		criterion.add(Restrictions.eq("issueid", issueId));
		return criterion.list();
	}
	public List<Forecast> findForRemind(String issueId) {
		Criteria criterion = forecastDao.getSession().createCriteria(
				Forecast.class);
		criterion.add(Restrictions.eq("issueid", issueId));
		criterion.add(Restrictions.isNull("newno"));
		return criterion.list();
	}
	public int countForRemind(String issueId) {
		String sql="select count(0) from lottery_forecast where issueid='"+issueId+"' and (newno is null or newno ='') ";
		return jdbcTemplate.queryForInt(sql);
	}
}
