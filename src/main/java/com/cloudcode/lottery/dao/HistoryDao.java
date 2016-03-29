package com.cloudcode.lottery.dao;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.cloudcode.framework.dao.BaseModelObjectDao;
import com.cloudcode.framework.dao.ModelObjectDao;
import com.cloudcode.lottery.ProjectConfig;
import com.cloudcode.lottery.model.History;

@Repository
public class HistoryDao extends BaseModelObjectDao<History> {
	@Resource(name = ProjectConfig.PREFIX + "historyDao")
	private ModelObjectDao<History> historyDao;
	
}
