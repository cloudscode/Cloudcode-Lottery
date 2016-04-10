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

@Repository
public class HistoryDao extends BaseModelObjectDao<History> {
	@Resource(name = ProjectConfig.PREFIX + "historyDao")
	private ModelObjectDao<History> historyDao;
	
	public PaginationSupport<History> queryPagingData(History hhXtCd, PageRange pageRange) {
		HQLParamList hqlParamList = new HQLParamList();
		List<Object> list=null;
		return this.queryPaginationSupport(History.class, hqlParamList, pageRange);
	}
}
