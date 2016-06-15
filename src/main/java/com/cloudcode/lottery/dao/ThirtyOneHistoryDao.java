package com.cloudcode.lottery.dao;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.persistence.Transient;

import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cloudcode.framework.dao.BaseModelObjectDao;
import com.cloudcode.framework.dao.ModelObjectDao;
import com.cloudcode.framework.utils.HQLParamList;
import com.cloudcode.framework.utils.PageRange;
import com.cloudcode.framework.utils.PaginationSupport;
import com.cloudcode.lottery.ProjectConfig;
import com.cloudcode.lottery.model.ThirtyOneHistory;
import com.cloudcode.lottery.model.base.Model;
import com.cloudcode.lottery.util.LotteryUtil;

@Repository
public class ThirtyOneHistoryDao extends BaseModelObjectDao<ThirtyOneHistory> {
	@Resource(name = ProjectConfig.PREFIX + "thirtyOneHistoryDao")
	private ModelObjectDao<ThirtyOneHistory> thirtyOneHistoryDao;
	@Autowired
	private LotteryUtil lotteryUtil;
	
	@Transient
	public void createThirtyOneHistory(ThirtyOneHistory ThirtyOneHistory){
		List<ThirtyOneHistory> pThirtyOneHistoryList = this.getNewThirtyOneHistoryList(); 
		ThirtyOneHistory pThirtyOneHistory=this.getNewThirtyOneHistory(); 
		calcThirtyOneHistory(ThirtyOneHistory,pThirtyOneHistoryList,pThirtyOneHistory);
		this.createObject(ThirtyOneHistory);
	}
	@Transient
	public void updateThirtyOneHistory(ThirtyOneHistory ThirtyOneHistory){
		List<ThirtyOneHistory> pThirtyOneHistoryList = this.getCurrentThirtyOneHistoryList(ThirtyOneHistory.getIssue()); 
		ThirtyOneHistory pThirtyOneHistory=this.getCurrentThirtyOneHistory(ThirtyOneHistory.getIssue()); 
		calcThirtyOneHistory(ThirtyOneHistory,pThirtyOneHistoryList,pThirtyOneHistory);
		this.updateObject(ThirtyOneHistory);
	}
	public void calcThirtyOneHistory(ThirtyOneHistory ThirtyOneHistory,List<ThirtyOneHistory> pThirtyOneHistoryList,ThirtyOneHistory pThirtyOneHistory) {
		lotteryUtil.arrSort(ThirtyOneHistory);
		lotteryUtil.calcLottery(ThirtyOneHistory);
		lotteryUtil.getNewSideRepeatNo(ThirtyOneHistory, pThirtyOneHistory);
		ThirtyOneHistory.initIntervaland0(ThirtyOneHistory);	
		List<ThirtyOneHistory> lists2=pThirtyOneHistoryList;
		List<Model> lists3= new ArrayList<Model>();
		lists3.addAll(lists2);
		lotteryUtil.getIntervaland(ThirtyOneHistory, pThirtyOneHistory);
		lotteryUtil.getHeat(ThirtyOneHistory, pThirtyOneHistory, 0);
		lotteryUtil.getRatioNoNumbers(ThirtyOneHistory,lists3, 0);
	}
	public PaginationSupport<ThirtyOneHistory> queryPagingData(ThirtyOneHistory hhXtCd, PageRange pageRange) {
		HQLParamList hqlParamList = new HQLParamList();
		List<Object> list=null;
		hqlParamList.addCondition(Order.desc("issue"));
		return this.queryPaginationSupport(ThirtyOneHistory.class, hqlParamList, pageRange);
	}
	public ThirtyOneHistory getNewThirtyOneHistory(){
		String sql="from ThirtyOneHistory  c order by c.issue desc ";
		List<ThirtyOneHistory> list=thirtyOneHistoryDao.getSession().createQuery(sql).setFirstResult(0).setMaxResults(1).list();
		ThirtyOneHistory pThirtyOneHistory = new ThirtyOneHistory();
		if(list.size()>0){
			pThirtyOneHistory =  list.get(0);
		}
		return pThirtyOneHistory;
	}
	public List<ThirtyOneHistory> getNewThirtyOneHistoryList(){
		String sql="from ThirtyOneHistory  c order by c.issue desc ";
		List<ThirtyOneHistory> list=thirtyOneHistoryDao.getSession().createQuery(sql).setFirstResult(0).setMaxResults(10).list();
		return list;
	}
	public ThirtyOneHistory getCurrentThirtyOneHistory(String issue){
		String sql="from ThirtyOneHistory  c  where c.issue <:issue order by c.issue desc ";
		List<ThirtyOneHistory> list=thirtyOneHistoryDao.getSession().createQuery(sql).setFirstResult(0).setMaxResults(1).setParameter("issue",issue).list();
		ThirtyOneHistory pThirtyOneHistory = new ThirtyOneHistory();
		if(list.size()>0){
			pThirtyOneHistory =  list.get(0);
		}
		return pThirtyOneHistory;
	}
	public List<ThirtyOneHistory> getCurrentThirtyOneHistoryList(String issue){
		String sql="from ThirtyOneHistory  c  where c.issue <:issue order by c.issue desc ";
		List<ThirtyOneHistory> list=thirtyOneHistoryDao.getSession().createQuery(sql).setFirstResult(0).setMaxResults(10).setParameter("issue",issue).list();
		return list;
	}
	public String getCurrentIssue(){
		ThirtyOneHistory pThirtyOneHistory = getNewThirtyOneHistory();
		return pThirtyOneHistory.getIssue();
	}
	public String getNewIssue(){
		ThirtyOneHistory pThirtyOneHistory = getNewThirtyOneHistory();
		if(null != pThirtyOneHistory){
			Integer issue =Integer.parseInt(pThirtyOneHistory.getIssue())+1;
			return issue.toString();
		}
		return "";
	}
}
