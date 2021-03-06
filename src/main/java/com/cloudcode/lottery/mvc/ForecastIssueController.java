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
import com.cloudcode.lottery.dao.ForecastIssueDao;
import com.cloudcode.lottery.model.ForecastIssue;
import com.cloudcode.lottery.util.ForecastRunnable;

@Controller
@RequestMapping({ "/forecastIssue" })
public class ForecastIssueController extends CrudController<ForecastIssue> {

	@Autowired
	private ForecastIssueDao forecastIssueDao;
	@Autowired
	private ForecastDao forecastDao;
	@Autowired
	private ForecastRunnable forecastRunnable;

	@RequestMapping(value = "/addForecastIssue", method = RequestMethod.POST)
	public @ResponseBody
	void addForecastIssue(@RequestBody ForecastIssue forecastIssue) {
		forecastIssue.setId(UUID.generateUUID());
		forecastIssueDao.create(forecastIssue);
	}

	@RequestMapping(value = "/calcForecastIssue", method = {
			RequestMethod.POST, RequestMethod.GET }, produces = "application/json")
	public @ResponseBody
	Object calcForecastIssue(@ModelAttribute("num") String num,
			HttpServletRequest request) {
		String result = request.getParameter("num");
		System.out.println(result + "***" + num);
		String[] nums = num.split(",");
		List<Integer> list = new ArrayList<Integer>();
		int[] number = new int[7];
		for (int i = 0; i < nums.length; i++) {
			number[i] = Integer.parseInt(nums[i]);
		}

		ForecastIssue forecastIssue = new ForecastIssue();
		/*
		 * forecastIssueUtil.arrSort(number,forecastIssue);
		 * forecastIssueUtil.calcForecastIssue(forecastIssue);
		 */
		return new ServiceResult(ReturnResult.SUCCESS, "", forecastIssue);
	}

	@RequestMapping(value = "/init", method = { RequestMethod.POST,
			RequestMethod.GET }, produces = "application/json")
	public @ResponseBody
	Object init() {
		Criteria criterion = forecastIssueDao.getSession().createCriteria(
				ForecastIssue.class);
		criterion.addOrder(Order.desc("issue"));
		List<ForecastIssue> lists = forecastIssueDao.loadAll(criterion);

		return new ServiceResult(ReturnResult.SUCCESS, "");
	}

	@RequestMapping(value = "query", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody
	PaginationSupport<ForecastIssue> query(ForecastIssue forecastIssue,
			PageRange pageRange) {
		PaginationSupport<ForecastIssue> result = forecastIssueDao
				.queryPagingData(forecastIssue, pageRange);
		return result;
	}

	@RequestMapping(value = "toList")
	public ModelAndView toList(HttpServletRequest request) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("classpath:com/cloudcode/lottery/ftl/fissue/list.ftl");
		modelAndView.addObject("port", request.getLocalPort());
		modelAndView.addObject("ip", request.getLocalAddr());
		return modelAndView;
	}

	@RequestMapping(value = "/{id}/toView")
	public ModelAndView toView(@PathVariable("id") String id) {
		ForecastIssue forecastIssue = forecastIssueDao.loadObject(id);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView
				.setViewName("classpath:com/cloudcode/lottery/ftl/fissue/view.ftl");
		modelAndView.addObject("forecastIssue", forecastIssue);
		return modelAndView;
	}

	@RequestMapping(value = "/{id}/delete", method = { RequestMethod.POST,
			RequestMethod.GET }, produces = "application/json")
	public @ResponseBody
	Object delete(@PathVariable("id") String id) {
		ForecastIssue forecastIssue = forecastIssueDao.loadObject(id);
		if(null != forecastIssue){
			forecastRunnable.delForecast(forecastDao.findByIssue(forecastIssue.getId()), forecastDao);
			forecastIssueDao.deleteObject(forecastIssue);
		}
		return new ServiceResult(ReturnResult.SUCCESS, "");
	}

	@RequestMapping(value = "/{id}/deleteAll")
	public @ResponseBody
	Object deleteAll(HttpServletRequest request) {
		String ids = request.getParameter("ids");
		String[] arrayId = ids.split(",");
		for (String deid : arrayId) {
			this.delete(deid);
		}
		return new ServiceResult(ReturnResult.SUCCESS);
	}
}
