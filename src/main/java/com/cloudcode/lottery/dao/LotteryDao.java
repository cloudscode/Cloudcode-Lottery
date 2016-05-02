package com.cloudcode.lottery.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cloudcode.framework.dao.BaseModelObjectDao;
import com.cloudcode.framework.dao.ModelObjectDao;
import com.cloudcode.framework.utils.HQLParamList;
import com.cloudcode.framework.utils.PageRange;
import com.cloudcode.framework.utils.PaginationSupport;
import com.cloudcode.lottery.ProjectConfig;
import com.cloudcode.lottery.model.Lottery;
import com.cloudcode.lottery.util.LotteryUtil;

@Repository
public class LotteryDao extends BaseModelObjectDao<Lottery> {
	@Resource(name = ProjectConfig.PREFIX + "lotteryDao")
	private ModelObjectDao<Lottery> lotteryDao;
	@Autowired
	private LotteryUtil lotteryUtil;
	
	public void addLottery(Lottery entity) {
		lotteryDao.createObject(entity);
	}
	public void updateObject(Lottery entity) {
		lotteryDao.updateObject(entity);
	}
	public PaginationSupport<Lottery> queryPagingData(Lottery hhXtCd, PageRange pageRange) {
		HQLParamList hqlParamList = new HQLParamList();
		List<Object> list=null;
		return this.queryPaginationSupport(Lottery.class, hqlParamList, pageRange);
	}
	public List<Lottery> getLotteryList(){
		String sql="select c.*  from lottery_lottery  c where c.horver is null or c.horver ='' limit 0,5";
		Query query = lotteryDao.getSession().createSQLQuery(sql).addEntity(Lottery.class);
		query.setProperties(Lottery.class);
		List<Lottery> phistory = query.list();
		return phistory;
	}
	public void calcLottery(){
		List<Lottery> list =getLotteryList();
		for(Lottery lottery:list){
			lotteryUtil.getHorver(lotteryUtil.tolist(lottery), lottery);
			lotteryDao.updateObject(lottery);
		}
	}
	public List<Lottery> getLotteryList(LotteryDao lotteryDao){
		String sql="select c.*  from lottery_lottery  c where c.horver is null limit 0,5";
		Query query = lotteryDao.getSessionFactory().getCurrentSession().createSQLQuery(sql).addEntity(Lottery.class);
		query.setProperties(Lottery.class);
		List<Lottery> phistory = query.list();
		return phistory;
	}
	
}
