package com.cloudcode.lottery.mvc;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.cloudcode.framework.controller.CrudController;
import com.cloudcode.framework.rest.ReturnResult;
import com.cloudcode.framework.service.ServiceResult;
import com.cloudcode.framework.utils.BeanUpdater;
import com.cloudcode.framework.utils.PageRange;
import com.cloudcode.framework.utils.PaginationSupport;
import com.cloudcode.framework.utils.UUID;
import com.cloudcode.lottery.dao.HistoryDao;
import com.cloudcode.lottery.model.History;
import com.cloudcode.lottery.model.base.Model;
import com.cloudcode.lottery.util.LotteryUtil;

@Controller
@RequestMapping({ "/historyLottery" })
public class HistoryLotteryController extends CrudController<History> {

	@Autowired
	private  HistoryDao historyDao;
	@Autowired
	private LotteryUtil lotteryUtil;

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public @ResponseBody Object create(@ModelAttribute History history,
			HttpServletRequest request) {
		history.setId(UUID.generateUUID());
		historyDao.createHistory(history);
		return new ServiceResult(ReturnResult.SUCCESS,"",history);
	}
	@RequestMapping(value = "/{id}/update", method = { RequestMethod.POST,
			RequestMethod.GET })
	public @ResponseBody Object update(@PathVariable("id") String id,
			@ModelAttribute History updateObject, HttpServletRequest request) {
		History history = historyDao.loadObject(id);
		if (history != null) {
			BeanUpdater.copyProperties(updateObject, history);
			historyDao.updateHistory(history);
			return new ServiceResult(ReturnResult.SUCCESS);
		}
		return null;
	}
	@RequestMapping(value = "/calcHistory",  method = {
			RequestMethod.POST,RequestMethod.GET}, produces = "application/json")
	public @ResponseBody
	Object calcHistory(@ModelAttribute("num")  String num,HttpServletRequest request) {
		String result=request.getParameter("num");
		System.out.println(result+"***"+num);
		String[] nums=num.split(",");
		List<Integer> list = new ArrayList<Integer>();
		int[] number = new int[7];
		for(int i=0;i<nums.length;i++){
			number[i]=Integer.parseInt(nums[i]);
		}
		
		History history = new History();
		/*historyUtil.arrSort(number,history);
		historyUtil.calcHistory(history);*/
		return new ServiceResult(ReturnResult.SUCCESS,"",history);
	}
	@RequestMapping(value = "/init",  method = {
			RequestMethod.POST,RequestMethod.GET}, produces = "application/json")
	public @ResponseBody
	Object init() {
		Criteria criterion = historyDao.getSession().createCriteria(History.class);
		criterion.addOrder(Order.desc("issue"));
		List<History> lists=historyDao.loadAll(criterion);
		List<Model> lists3= new ArrayList<Model>();
		lists3.addAll(lists);
		for(int i=0;i<lists.size();i++){
			History history=lists.get(i);
			lotteryUtil.arrSort(history);
			lotteryUtil.calcLottery(history);
			if((i+1)<lists.size()){
			  History phistory=lists.get(i+1);
			  lotteryUtil.getNewSideRepeatNo(history, phistory);
			}
			if((i-1)<lists.size()){
				if(i-1 ==-1){
					history.initIntervaland1(history);
				}else if(i-1 >=0){
				  History phistory=lists.get(i-1);
				  lotteryUtil.getIntervaland(history, phistory);
				  lotteryUtil.getHeat(history, phistory, i);
				}
			}
			lotteryUtil.getRatioNoNumbers(history,lists3, i);
			historyDao.updateObject(history);
		}
		return new ServiceResult(ReturnResult.SUCCESS,"");
	}
	@RequestMapping(value = "query", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody
	PaginationSupport<History> query(History history, PageRange pageRange) {
		PaginationSupport<History> result = historyDao.queryPagingData(history, pageRange);
		return result;
	}
	@RequestMapping(value = "toList")
	public ModelAndView toList() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("classpath:com/cloudcode/lottery/ftl/history/list.ftl");
		return modelAndView;
	}
	@RequestMapping(value = "toList1")
	public ModelAndView toList1() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("classpath:com/cloudcode/lottery/ftl/history/list1.ftl");
		return modelAndView;
	}
	@RequestMapping(value = "toCreate")
	public ModelAndView toCreate() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("classpath:com/cloudcode/lottery/ftl/history/detail.ftl");
		modelAndView.addObject("entityAction", "create");
		History history = new History();
		String oldIssue = historyDao.getNewIssue();
		history = lotteryUtil.getHistor(oldIssue);
		modelAndView.addObject("history", history);
		return modelAndView;
	}
	@RequestMapping(value = "/{id}/toUpdate")
	public ModelAndView toUpdate(@PathVariable("id") String id) {
		History history = historyDao.loadObject(id);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("classpath:com/cloudcode/lottery/ftl/history/detail.ftl");
		modelAndView.addObject("entityAction", "update");
		modelAndView.addObject("history", history);
		return modelAndView;
	}
	@RequestMapping(value = "/{id}/toView")
	public ModelAndView toView(@PathVariable("id") String id) {
		History history =historyDao.loadObject(id);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("classpath:com/cloudcode/lottery/ftl/history/view.ftl");
		modelAndView.addObject("history",history);
		return modelAndView;
	}
	@RequestMapping(value = "/{id}/delete",  method = {
			RequestMethod.POST,RequestMethod.GET}, produces = "application/json")
	public @ResponseBody Object delete(@PathVariable("id") String id) {
		historyDao.deleteObject(id);
		return new ServiceResult(ReturnResult.SUCCESS,"");
	}
}
