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
import com.cloudcode.lottery.model.Lottery4;
import com.cloudcode.lottery.util.LotteryUtil;

@Repository
public class LotteryDao4 extends BaseModelObjectDao<Lottery4> {
	@Resource(name = ProjectConfig.PREFIX + "lotteryDao4")
	private ModelObjectDao<Lottery4> lotteryDao4;
	@Autowired
	private LotteryUtil Lottery4Util;
	
	public void addLottery4(Lottery4 entity) {
		lotteryDao4.createObject(entity);
	}
	public void updateObject(Lottery4 entity) {
		lotteryDao4.updateObject(entity);
	}
	public PaginationSupport<Lottery4> queryPagingData(Lottery4 hhXtCd, PageRange pageRange) {
		HQLParamList hqlParamList = new HQLParamList();
		List<Object> list=null;
		return this.queryPaginationSupport(Lottery4.class, hqlParamList, pageRange);
	}
	public List<Lottery4> getLottery4List(){
		//String sql="select c.*  from Lottery4_Lottery4  c where c.horver is null or c.horver ='' limit 0,35000";
		/*String sql="select top 35000 c.*  from Lottery4_Lottery4  c where c.horver is null or c.horver ='' ";
		Query query = lotteryDao4.getSession().createSQLQuery(sql).addEntity(Lottery4.class);
		query.setProperties(Lottery4.class);
		List<Lottery4> phistory = query.list();*/
		String sql="from Lottery4  c  where c.horver is null or c.horver ='' ";
		List<Lottery4> list=lotteryDao4.getSession().createQuery(sql).setFirstResult(0).setMaxResults(5000).list();
		return list;
	}
	public void calcLottery4(){
		List<Lottery4> list =getLottery4List();
		for(Lottery4 Lottery4:list){
			Lottery4Util.getHorver(Lottery4Util.tolist(Lottery4), Lottery4);
			lotteryDao4.updateObject(Lottery4);
		}
	}
	public List<Lottery4> getLottery4List(LotteryDao4 lotteryDao4){
		/*String sql="select c.*  from Lottery4_Lottery4  c where c.horver is null limit 0,5";
		Query query = lotteryDao4.getSessionFactory().getCurrentSession().createSQLQuery(sql).addEntity(Lottery4.class);
		query.setProperties(Lottery4.class);
		List<Lottery4> phistory = query.list();*/
		String sql="from Lottery4  c  where c.horver is null or c.horver ='' ";
		List<Lottery4> list=lotteryDao4.getSession().createQuery(sql).setFirstResult(0).setMaxResults(5).list();
		return list;
	}
	
}
