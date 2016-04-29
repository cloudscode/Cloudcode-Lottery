package com.cloudcode.lottery.mvc;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.cloudcode.framework.controller.CrudController;
import com.cloudcode.framework.rest.ReturnResult;
import com.cloudcode.framework.service.ServiceResult;
import com.cloudcode.framework.utils.PageRange;
import com.cloudcode.framework.utils.PaginationSupport;
import com.cloudcode.framework.utils.UUID;
import com.cloudcode.lottery.dao.LotteryDao;
import com.cloudcode.lottery.model.Lottery;
import com.cloudcode.lottery.util.LotteryRunnable;
import com.cloudcode.lottery.util.LotteryUtil;

@Controller
@RequestMapping({ "/lottery" })
public class LotteryController extends CrudController<Lottery> {

	@Autowired
	private  LotteryDao lotteryDao;
	@Autowired
	private LotteryUtil lotteryUtil;
	@Autowired
	private LotteryRunnable lotteryRunnable;
	@RequestMapping(value = "/addLottery", method = RequestMethod.POST)
	public @ResponseBody
	void addLottery(@RequestBody  Lottery lottery) {
		lottery.setId(UUID.generateUUID());
		lotteryDao.create(lottery);
	}
	@RequestMapping(value = "/calcLottery",  method = {
			RequestMethod.POST,RequestMethod.GET}, produces = "application/json")
	public @ResponseBody
	Object calcLottery(@ModelAttribute("num")  String num,HttpServletRequest request) {
		String result=request.getParameter("num");
		System.out.println(result+"***"+num);
		if(num.endsWith(",")){
			num = num.substring(0, num.length()-1);
		}
		String[] nums=num.split(",");
		List<Integer> list = new ArrayList<Integer>();
		int[] number = new int[7];
		for(int i=0;i<nums.length;i++){
			number[i]=Integer.parseInt(nums[i]);
		}
		
		Lottery lottery = new Lottery();
		lotteryUtil.arrSort(number,lottery);
		lotteryUtil.calcBaseLottery(lottery);
		return new ServiceResult(ReturnResult.SUCCESS,"",lottery);
	}
	@RequestMapping(value = "calculation")
	public ModelAndView calculation() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("classpath:com/cloudcode/lottery/ftl/detail.ftl");
		
		return modelAndView;
	}
	@RequestMapping(value = "view")
	public ModelAndView view(HttpServletRequest request) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("classpath:com/cloudcode/lottery/ftl/view.ftl");
		String num=request.getParameter("num");
		System.out.println("***"+num);
		if(num.endsWith(",")){
			num = num.substring(0, num.length()-1);
		}
		String[] nums=num.split(",");
		List<Integer> list = new ArrayList<Integer>();
		int[] number = new int[7];
		for(int i=0;i<nums.length;i++){
			number[i]=Integer.parseInt(nums[i]);
		}
		
		Lottery lottery = new Lottery();
		lotteryUtil.arrSort(number,lottery);
		lotteryUtil.calcBaseLottery(lottery);
		modelAndView.addObject("lottery", lottery);
		return modelAndView;
	}
	@RequestMapping(value = "/init",  method = {
			RequestMethod.POST,RequestMethod.GET}, produces = "application/json")
	public @ResponseBody
	Object init( HttpServletRequest request) {
		 
		 
		lotteryUtil.initBaseLotteryThread( lotteryDao);
		return new ServiceResult(ReturnResult.SUCCESS,"");
	}
	@RequestMapping(value = "query", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody
	PaginationSupport<Lottery> query(Lottery history, PageRange pageRange) {
		PaginationSupport<Lottery> result = lotteryDao.queryPagingData(history, pageRange);
		return result;
	}
	@RequestMapping(value = "toList")
	public ModelAndView toList() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("classpath:com/cloudcode/lottery/ftl/lottery/list.ftl");
		return modelAndView;
	}
	@RequestMapping(value = "/{id}/toView")
	public ModelAndView toView(@PathVariable("id") String id) {
		Lottery history =lotteryDao.loadObject(id);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("classpath:com/cloudcode/lottery/ftl/lottery/view.ftl");
		modelAndView.addObject("history",history);
		return modelAndView;
	}
	@RequestMapping(value = "/toCalc",  method = {
			RequestMethod.POST,RequestMethod.GET}, produces = "application/json")
	public @ResponseBody Object toCalc( HttpServletRequest request) {
		lotteryUtil.calc(lotteryDao, lotteryUtil);
		return new ServiceResult(ReturnResult.SUCCESS,"");
	}
	@RequestMapping(value = "/toCalc2",  method = {
			RequestMethod.POST,RequestMethod.GET}, produces = "application/json")
	public @ResponseBody Object toCalc2( HttpServletRequest request) {
		lotteryRunnable.setList(lotteryDao.getLotteryList());
		lotteryRunnable.setLotteryDao(lotteryDao);
		lotteryRunnable.run();
		return new ServiceResult(ReturnResult.SUCCESS,"");
	}
}
