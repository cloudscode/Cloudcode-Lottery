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
import com.cloudcode.lottery.model.Lottery3;
import com.cloudcode.lottery.util.LotteryUtil;

@Repository
public class LotteryDao3 extends BaseModelObjectDao<Lottery3> {
	@Resource(name = ProjectConfig.PREFIX + "lotteryDao3")
	private ModelObjectDao<Lottery3> lotteryDao3;
	@Autowired
	private LotteryUtil Lottery3Util;
	
	public void addLottery3(Lottery3 entity) {
		lotteryDao3.createObject(entity);
	}
	public void updateObject(Lottery3 entity) {
		lotteryDao3.updateObject(entity);
	}
	public PaginationSupport<Lottery3> queryPagingData(Lottery3 hhXtCd, PageRange pageRange) {
		HQLParamList hqlParamList = new HQLParamList();
		List<Object> list=null;
		return this.queryPaginationSupport(Lottery3.class, hqlParamList, pageRange);
	}
	public List<Lottery3> getLottery3List(){
		//String sql="select c.*  from Lottery3_Lottery3  c where c.horver is null or c.horver ='' limit 0,35000";
		/*String sql="select top 35000 c.*  from Lottery3_Lottery3  c where c.horver is null or c.horver ='' ";
		Query query = lotteryDao3.getSession().createSQLQuery(sql).addEntity(Lottery3.class);
		query.setProperties(Lottery3.class);
		List<Lottery3> phistory = query.list();*/
		String sql="from Lottery3  c  where c.horver is null or c.horver ='' ";
		List<Lottery3> list=lotteryDao3.getSession().createQuery(sql).setFirstResult(0).setMaxResults(5000).list();
		return list;
	}
	public void calcLottery3(){
		List<Lottery3> list =getLottery3List();
		for(Lottery3 Lottery3:list){
			Lottery3Util.getHorver(Lottery3Util.tolist(Lottery3), Lottery3);
			lotteryDao3.updateObject(Lottery3);
		}
	}
	public List<Lottery3> getLottery3List(LotteryDao3 lotteryDao3){
		/*String sql="select c.*  from Lottery3_Lottery3  c where c.horver is null limit 0,5";
		Query query = lotteryDao3.getSessionFactory().getCurrentSession().createSQLQuery(sql).addEntity(Lottery3.class);
		query.setProperties(Lottery3.class);
		List<Lottery3> phistory = query.list();*/
		String sql="from Lottery3  c  where c.horver is null or c.horver ='' ";
		List<Lottery3> list=lotteryDao3.getSession().createQuery(sql).setFirstResult(0).setMaxResults(5).list();
		return list;
	}
	
}
