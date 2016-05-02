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
		calcHistory(history,phistoryList,phistory);
		this.createObject(history);
	}
	@Transient
	public void updateHistory(History history){
		List<History> phistoryList = this.getCurrentHistoryList(history.getIssue()); 
		History phistory=this.getCurrentHistory(history.getIssue()); 
		calcHistory(history,phistoryList,phistory);
		this.updateObject(history);
	}
	public void calcHistory(History history,List<History> phistoryList,History phistory) {
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
	}
	public PaginationSupport<History> queryPagingData(History hhXtCd, PageRange pageRange) {
		HQLParamList hqlParamList = new HQLParamList();
		List<Object> list=null;
		hqlParamList.addCondition(Order.desc("issue"));
		return this.queryPaginationSupport(History.class, hqlParamList, pageRange);
	}
	public History getNewHistory(){
		//String sql="select c.*  from lottery_history  c order by c.issue desc limit 0,1";
		String sql="from History  c order by c.issue desc ";
		List<History> list=historyDao.getSession().createQuery(sql).setFirstResult(0).setMaxResults(1).list();
		/*Query query = historyDao.getSession().createSQLQuery(sql);//.addEntity(History.class);
		query.setProperties(History.class);*/
		History phistory = new History();
		if(list.size()>0){
			phistory =  list.get(0);
		}
		return phistory;
	}
	public List<History> getNewHistoryList(){
	/*	String sql="select c.*  from lottery_history  c order by c.issue desc limit 0,10";
		Query query = historyDao.getSession().createSQLQuery(sql).addEntity(History.class);
		query.setProperties(History.class);
		List<History> phistory = query.list();*/
		String sql="from History  c order by c.issue desc ";
		List<History> list=historyDao.getSession().createQuery(sql).setFirstResult(0).setMaxResults(10).list();
		return list;
	}
	public History getCurrentHistory(String issue){
		/*String sql="select c.*  from lottery_history  c  where c.issue <'"+issue+"' order by c.issue desc limit 0,1";
		Query query = historyDao.getSession().createSQLQuery(sql).addEntity(History.class);
		query.setProperties(History.class);
		History phistory =  (History) query.uniqueResult();*/
		String sql="from History  c  where c.issue <:issue order by c.issue desc ";
		List<History> list=historyDao.getSession().createQuery(sql).setFirstResult(0).setMaxResults(1).setParameter("issue",issue).list();
		History phistory = new History();
		if(list.size()>0){
			phistory =  list.get(0);
		}
		return phistory;
	}
	public List<History> getCurrentHistoryList(String issue){
		/*String sql="select c.*  from lottery_history  c where c.issue <'"+issue+"' order by c.issue desc limit 0,10";
		Query query = historyDao.getSession().createSQLQuery(sql).addEntity(History.class);
		query.setProperties(History.class);
		List<History> phistory = query.list();*/
		String sql="from History  c  where c.issue <:issue order by c.issue desc ";
		List<History> list=historyDao.getSession().createQuery(sql).setFirstResult(0).setMaxResults(10).setParameter("issue",issue).list();
		
		return list;
	}
	public String getCurrentIssue(){
		History phistory = getNewHistory();
		return phistory.getIssue();
	}
	public String getNewIssue(){
		History phistory = getNewHistory();
		if(null != phistory){
			Integer issue =Integer.parseInt(phistory.getIssue())+1;
			return issue.toString();
		}
		return "";
	}
}
