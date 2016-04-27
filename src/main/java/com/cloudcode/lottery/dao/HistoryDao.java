package com.cloudcode.lottery.dao;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.persistence.Transient;

import org.hibernate.Query;
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
import com.cloudcode.lottery.model.History;
import com.cloudcode.lottery.model.base.Model;
import com.cloudcode.lottery.util.LotteryUtil;

@Repository
public class HistoryDao extends BaseModelObjectDao<History> {
	@Resource(name = ProjectConfig.PREFIX + "historyDao")
	private ModelObjectDao<History> historyDao;
	@Autowired
	private LotteryUtil lotteryUtil;
	
	@Transient
	public void createHistory(History history){
		List<History> phistoryList = this.getNewHistoryList(); 
		History phistory=this.getNewHistory(); 
		lotteryUtil.arrSort(history);
		lotteryUtil.calcLottery(history);
		lotteryUtil.getNewSideRepeatNo(history, phistory);
		history.initIntervaland0(history);	
		List<History> lists2=phistoryList;
		List<Model> lists3= new ArrayList<Model>();
		lists3.addAll(lists2);
		lotteryUtil.getIntervaland(history, phistory);
		lotteryUtil.getHeat(history, phistory, 0);
		lotteryUtil.getRatioNoNumbers(history,lists3, 0);
		this.createObject(history);
	}
	public PaginationSupport<History> queryPagingData(History hhXtCd, PageRange pageRange) {
		HQLParamList hqlParamList = new HQLParamList();
		List<Object> list=null;
		hqlParamList.addCondition(Order.desc("issue"));
		return this.queryPaginationSupport(History.class, hqlParamList, pageRange);
	}
	public History getNewHistory(){
		String sql="select c.*  from lottery_history  c order by c.issue desc limit 0,1";
		Query query = historyDao.getSession().createSQLQuery(sql).addEntity(History.class);
		query.setProperties(History.class);
		History phistory =  (History) query.uniqueResult();
		return phistory;
	}
	public List<History> getNewHistoryList(){
		String sql="select c.*  from lottery_history  c order by c.issue desc limit 0,10";
		Query query = historyDao.getSession().createSQLQuery(sql).addEntity(History.class);
		query.setProperties(History.class);
		List<History> phistory = query.list();
		return phistory;
	}
	public String getCurrentIssue(){
		History phistory = getNewHistory();
		return phistory.getIssue();
	}
	public String getNewIssue(){
		History phistory = getNewHistory();
		Integer issue =Integer.parseInt(phistory.getIssue())+1;
		return issue.toString();
	}
}
