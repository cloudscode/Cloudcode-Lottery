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
import com.cloudcode.lottery.model.Lottery2;
import com.cloudcode.lottery.util.LotteryUtil;

@Repository
public class LotteryDao2 extends BaseModelObjectDao<Lottery2> {
	@Resource(name = ProjectConfig.PREFIX + "lotteryDao2")
	private ModelObjectDao<Lottery2> lotteryDao2;
	@Autowired
	private LotteryUtil Lottery2Util;
	
	public void addLottery2(Lottery2 entity) {
		lotteryDao2.createObject(entity);
	}
	public void updateObject(Lottery2 entity) {
		lotteryDao2.updateObject(entity);
	}
	public PaginationSupport<Lottery2> queryPagingData(Lottery2 hhXtCd, PageRange pageRange) {
		HQLParamList hqlParamList = new HQLParamList();
		List<Object> list=null;
		return this.queryPaginationSupport(Lottery2.class, hqlParamList, pageRange);
	}
	public List<Lottery2> getLottery2List(){
		//String sql="select c.*  from Lottery2_Lottery2  c where c.horver is null or c.horver ='' limit 0,35000";
		/*String sql="select top 35000 c.*  from Lottery2_Lottery2  c where c.horver is null or c.horver ='' ";
		Query query = lotteryDao2.getSession().createSQLQuery(sql).addEntity(Lottery2.class);
		query.setProperties(Lottery2.class);
		List<Lottery2> phistory = query.list();*/
		String sql="from Lottery2  c  where c.horver is null or c.horver ='' ";
		List<Lottery2> list=lotteryDao2.getSession().createQuery(sql).setFirstResult(0).setMaxResults(5000).list();
		return list;
	}
	public void calcLottery2(){
		List<Lottery2> list =getLottery2List();
		for(Lottery2 Lottery2:list){
			Lottery2Util.getHorver(Lottery2Util.tolist(Lottery2), Lottery2);
			lotteryDao2.updateObject(Lottery2);
		}
	}
	public List<Lottery2> getLottery2List(LotteryDao2 lotteryDao2){
		/*String sql="select c.*  from Lottery2_Lottery2  c where c.horver is null limit 0,5";
		Query query = lotteryDao2.getSessionFactory().getCurrentSession().createSQLQuery(sql).addEntity(Lottery2.class);
		query.setProperties(Lottery2.class);
		List<Lottery2> phistory = query.list();*/
		String sql="from Lottery2  c  where c.horver is null or c.horver ='' ";
		List<Lottery2> list=lotteryDao2.getSession().createQuery(sql).setFirstResult(0).setMaxResults(5).list();
		return list;
	}
	
}
