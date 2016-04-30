package com.cloudcode.lottery.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cloudcode.framework.dao.BaseModelObjectDao;
import com.cloudcode.framework.dao.ModelObjectDao;
import com.cloudcode.framework.utils.HQLParamList;
import com.cloudcode.framework.utils.PageRange;
import com.cloudcode.framework.utils.PaginationSupport;
import com.cloudcode.lottery.ProjectConfig;
import com.cloudcode.lottery.model.Forecast;
import com.cloudcode.lottery.model.ForecastIssue;

@Repository
public class ForecastIssueDao extends BaseModelObjectDao<ForecastIssue> {
	@Resource(name = ProjectConfig.PREFIX + "forecastIssueDao")
	private ModelObjectDao<ForecastIssue> forecastIssueDao;
	@Autowired
	private ForecastDao forecastDao;

	public void addForecastIssue(ForecastIssue entity) {
		forecastIssueDao.createObject(entity);
	}

	public PaginationSupport<ForecastIssue> queryPagingData(
			ForecastIssue hhXtCd, PageRange pageRange) {
		HQLParamList hqlParamList = new HQLParamList();
		List<Object> list = null;
		hqlParamList.addCondition(Order.desc("issue"));
		hqlParamList.addCondition(Order.desc("drawtime"));
		return this.queryPaginationSupport(ForecastIssue.class, hqlParamList,
				pageRange);
	}

	public List<Forecast> findByIssue(String issueId) {
		Criteria criterion = forecastDao.getSession().createCriteria(
				Forecast.class);
		criterion.add(Restrictions.eq("issueid", issueId));
		return forecastDao.loadAll(criterion);
	}
}
