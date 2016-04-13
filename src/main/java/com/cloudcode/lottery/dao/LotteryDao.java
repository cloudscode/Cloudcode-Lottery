package com.cloudcode.lottery.dao;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.cloudcode.framework.dao.BaseModelObjectDao;
import com.cloudcode.framework.dao.ModelObjectDao;
import com.cloudcode.lottery.ProjectConfig;
import com.cloudcode.lottery.model.Lottery;

@Repository
public class LotteryDao extends BaseModelObjectDao<Lottery> {
	@Resource(name = ProjectConfig.PREFIX + "lotteryDao")
	private ModelObjectDao<Lottery> lotteryDao;

	public void addLottery(Lottery entity) {
		lotteryDao.createObject(entity);
	}
}
