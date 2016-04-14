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
import com.cloudcode.lottery.dao.ForecastDao;
import com.cloudcode.lottery.model.Forecast;

@Controller
@RequestMapping({ "/forecast" })
public class ForecastController extends CrudController<Forecast> {

	@Autowired
	private  ForecastDao forecastDao;
	 
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
		return modelAndView;
	}
	@RequestMapping(value = "/search",  method = {
			RequestMethod.POST,RequestMethod.GET}, produces = "application/json")
	public @ResponseBody
	Object search(HttpServletRequest request) {
		String OddEven=request.getParameter("oddeven");
		 
		return new ServiceResult(ReturnResult.SUCCESS,"");
	}
}
