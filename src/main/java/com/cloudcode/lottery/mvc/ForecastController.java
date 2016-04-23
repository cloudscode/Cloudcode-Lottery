package com.cloudcode.lottery.mvc;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
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
import com.cloudcode.framework.utils.Check;
import com.cloudcode.framework.utils.PageRange;
import com.cloudcode.framework.utils.PaginationSupport;
import com.cloudcode.framework.utils.UUID;
import com.cloudcode.lottery.dao.ForecastDao;
import com.cloudcode.lottery.dao.HistoryDao;
import com.cloudcode.lottery.dao.LotteryDao;
import com.cloudcode.lottery.model.Forecast;
import com.cloudcode.lottery.model.History;
import com.cloudcode.lottery.model.Lottery;
import com.cloudcode.lottery.model.base.Model;
import com.cloudcode.lottery.util.LotteryUtil;

@Controller
@RequestMapping({ "/forecast" })
public class ForecastController extends CrudController<Forecast> {

	@Autowired
	private  ForecastDao forecastDao;
	@Autowired
	private LotteryDao lotteryDao;
	@Autowired
	private HistoryDao historyDao;
	@Autowired
	private LotteryUtil lotteryUtil;
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@RequestMapping(value = "/addForecast", method = RequestMethod.POST)
	public @ResponseBody
	void addForecast(@RequestBody  Forecast forecast) {
		forecast.setId(UUID.generateUUID());
		forecastDao.create(forecast);
	}
	@RequestMapping(value = "/calcForecast",  method = {
			RequestMethod.POST,RequestMethod.GET}, produces = "application/json")
	public @ResponseBody
	Object calcForecast(@ModelAttribute("num")  String num,HttpServletRequest request) {
		String result=request.getParameter("num");
		System.out.println(result+"***"+num);
		String[] nums=num.split(",");
		List<Integer> list = new ArrayList<Integer>();
		int[] number = new int[7];
		for(int i=0;i<nums.length;i++){
			number[i]=Integer.parseInt(nums[i]);
		}
		
		Forecast forecast = new Forecast();
		/*forecastUtil.arrSort(number,forecast);
		forecastUtil.calcForecast(forecast);*/
		return new ServiceResult(ReturnResult.SUCCESS,"",forecast);
	}
	@RequestMapping(value = "/init",  method = {
			RequestMethod.POST,RequestMethod.GET}, produces = "application/json")
	public @ResponseBody
	Object init() {
		Criteria criterion = forecastDao.getSession().createCriteria(Forecast.class);
		criterion.addOrder(Order.desc("issue"));
		List<Forecast> lists=forecastDao.loadAll(criterion);
		 
		return new ServiceResult(ReturnResult.SUCCESS,"");
	}
	@RequestMapping(value = "query", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody
	PaginationSupport<Forecast> query(Forecast forecast, PageRange pageRange) {
		PaginationSupport<Forecast> result = forecastDao.queryPagingData(forecast, pageRange);
		return result;
	}
	@RequestMapping(value = "toList")
	public ModelAndView toList() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("classpath:com/cloudcode/lottery/ftl/forecast/list.ftl");
		return modelAndView;
	}
	@RequestMapping(value = "/{id}/toView")
	public ModelAndView toView(@PathVariable("id") String id) {
		Forecast forecast =forecastDao.loadObject(id);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("classpath:com/cloudcode/lottery/ftl/forecast/view.ftl");
		modelAndView.addObject("forecast",forecast);
		return modelAndView;
	}
	@RequestMapping(value = "toSearch")
	public ModelAndView toSearch() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("classpath:com/cloudcode/lottery/ftl/forecast/search.ftl");
		modelAndView.addObject("issue", historyDao.getNewIssue());
		return modelAndView;
	}
	@RequestMapping(value = "toCalcSearch")
	public ModelAndView toCalcSearch() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("classpath:com/cloudcode/lottery/ftl/forecast/searchcalc.ftl");
		return modelAndView;
	}
	@RequestMapping(value = "/search",  method = {
			RequestMethod.POST,RequestMethod.GET})
	public @ResponseBody
	Object search(HttpServletRequest request) {
		String OddEven=request.getParameter("oddeven");
		String consecutiveNumber = request.getParameter("consecutiveNumber");
		Criteria criterion = lotteryDao.getSession().createCriteria(Lottery.class);
		if(!Check.isEmpty(OddEven)){
			String odd=OddEven.split(":")[0];
			String even=OddEven.split(":")[1];
			criterion.add(Restrictions.eq("odd", Integer.parseInt(odd)) );
			criterion.add(Restrictions.eq("even", Integer.parseInt(even)) );
		}
		if(!Check.isEmpty(consecutiveNumber)){
			criterion.add(Restrictions.eq("consecutivenumber", consecutiveNumber));
		}
		List<Lottery> lists=lotteryDao.loadAll(criterion);
		/*List<Forecast> lists2=new ArrayList<Forecast>();
		for(Lottery lottery:lists){
			Forecast forecast=new Forecast();
			BeanUtils.copyProperties(lottery, forecast);
			forecast.setId(UUID.generateUUID());
			System.out.println(forecast.getA()+":"+lottery.getB());
			lists2.add(forecast);
		}
		History phistory = historyDao.getNewHistory(); 
		List<History> phistoryList = historyDao.getNewHistoryList(); 
		System.out.println(phistory.getIssue()+" "+phistory.getStrnum());
		List<Model> lists3= new ArrayList<Model>();
		lists3.addAll(phistoryList);
		for(int i=0;i<lists2.size();i++){
			Forecast forecast=lists2.get(i);
		    lotteryUtil.getIntervaland(forecast, phistory);
		    lotteryUtil.getHeat(forecast, phistory);
		    lotteryUtil.getRatioNoNumbers(forecast,lists3, 0);
			forecastDao.addForecast(forecast);
		}*/
		return new ServiceResult(ReturnResult.SUCCESS,"");
	}
}
