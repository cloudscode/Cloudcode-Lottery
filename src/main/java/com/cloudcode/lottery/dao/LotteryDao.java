package com.cloudcode.lottery.dao;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.cloudcode.framework.dao.BaseModelObjectDao;
import com.cloudcode.framework.dao.ModelObjectDao;
import com.cloudcode.framework.utils.HQLParamList;
import com.cloudcode.framework.utils.PageRange;
import com.cloudcode.framework.utils.PaginationSupport;
import com.cloudcode.lottery.ProjectConfig;
import com.cloudcode.lottery.model.History;
import com.cloudcode.lottery.model.Lottery;

@Repository
public class LotteryDao extends BaseModelObjectDao<Lottery> {
	@Resource(name = ProjectConfig.PREFIX + "lotteryDao")
	private ModelObjectDao<Lottery> lotteryDao;

	public void addLottery(Lottery entity) {
		lotteryDao.createObject(entity);
	}
	public PaginationSupport<Lottery> queryPagingData(Lottery hhXtCd, PageRange pageRange) {
		HQLParamList hqlParamList = new HQLParamList();
		List<Object> list=null;
		return this.queryPaginationSupport(Lottery.class, hqlParamList, pageRange);
	}
}
