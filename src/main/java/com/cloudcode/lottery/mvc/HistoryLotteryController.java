package com.cloudcode.lottery.mvc;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cloudcode.framework.controller.CrudController;
import com.cloudcode.framework.rest.ReturnResult;
import com.cloudcode.framework.service.ServiceResult;
import com.cloudcode.framework.utils.UUID;
import com.cloudcode.lottery.dao.HistoryDao;
import com.cloudcode.lottery.model.History;
import com.cloudcode.lottery.util.LotteryUtil;

@Controller
@RequestMapping({ "/historyLottery" })
public class HistoryLotteryController extends CrudController<History> {

	@Autowired
	private  HistoryDao historyDao;
	@Autowired
	private LotteryUtil lotteryUtil;
	@RequestMapping(value = "/addHistory", method = RequestMethod.POST)
	public @ResponseBody
	void addHistory(@RequestBody  History history) {
		history.setId(UUID.generateUUID());
		historyDao.create(history);
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
		//for(History history:lists){
		for(int i=0;i<lists.size();i++){
			History history=lists.get(i);
			if((i+1)<lists.size()){
			  History phistory=lists.get(i+1);
			  lotteryUtil.getNewSideRepeatNo(history, phistory);
			}
			lotteryUtil.arrSort(history);
			lotteryUtil.calcLottery(history);
			historyDao.updateObject(history);
		}
		return new ServiceResult(ReturnResult.SUCCESS,"");
	}
}
