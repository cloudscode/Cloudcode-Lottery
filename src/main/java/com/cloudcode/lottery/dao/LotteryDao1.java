package com.cloudcode.lottery.dao;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cloudcode.framework.dao.BaseModelObjectDao;
import com.cloudcode.framework.dao.ModelObjectDao;
import com.cloudcode.framework.utils.HQLParamList;
import com.cloudcode.framework.utils.PageRange;
import com.cloudcode.framework.utils.PaginationSupport;
import com.cloudcode.lottery.ProjectConfig;
import com.cloudcode.lottery.model.Lottery1;
import com.cloudcode.lottery.util.LotteryUtil;

@Repository
public class LotteryDao1 extends BaseModelObjectDao<Lottery1> {
	@Resource(name = ProjectConfig.PREFIX + "lotteryDao1")
	private ModelObjectDao<Lottery1> lotteryDao1;
	@Autowired
	private LotteryUtil Lottery1Util;
	
	public void addLottery1(Lottery1 entity) {
		lotteryDao1.createObject(entity);
	}
	public void updateObject(Lottery1 entity) {
		lotteryDao1.updateObject(entity);
	}
	public PaginationSupport<Lottery1> queryPagingData(Lottery1 hhXtCd, PageRange pageRange) {
		HQLParamList hqlParamList = new HQLParamList();
		List<Object> list=null;
		return this.queryPaginationSupport(Lottery1.class, hqlParamList, pageRange);
	}
	public List<Lottery1> getLottery1List(){
		//String sql="select c.*  from Lottery1_Lottery1  c where c.horver is null or c.horver ='' limit 0,35000";
		/*String sql="select top 35000 c.*  from Lottery1_Lottery1  c where c.horver is null or c.horver ='' ";
		Query query = lotteryDao1.getSession().createSQLQuery(sql).addEntity(Lottery1.class);
		query.setProperties(Lottery1.class);
		List<Lottery1> phistory = query.list();*/
		String sql="from Lottery1  c  where c.horver is null or c.horver ='' ";
		List<Lottery1> list=lotteryDao1.getSession().createQuery(sql).setFirstResult(0).setMaxResults(5000).list();
		return list;
	}
	public void calcLottery1(){
		List<Lottery1> list =getLottery1List();
		for(Lottery1 Lottery1:list){
			Lottery1Util.getHorver(Lottery1Util.tolist(Lottery1), Lottery1);
			lotteryDao1.updateObject(Lottery1);
		}
	}
	public List<Lottery1> getLottery1List(LotteryDao1 lotteryDao1){
		/*String sql="select c.*  from Lottery1_Lottery1  c where c.horver is null limit 0,5";
		Query query = lotteryDao1.getSessionFactory().getCurrentSession().createSQLQuery(sql).addEntity(Lottery1.class);
		query.setProperties(Lottery1.class);
		List<Lottery1> phistory = query.list();*/
		String sql="from Lottery1  c  where c.horver is null or c.horver ='' ";
		List<Lottery1> list=lotteryDao1.getSession().createQuery(sql).setFirstResult(0).setMaxResults(5).list();
		return list;
	}
	
}
