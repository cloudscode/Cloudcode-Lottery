package com.cloudcode.lottery.mvc;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.Criteria;
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
import com.cloudcode.framework.utils.CriterionUtil;
import com.cloudcode.framework.utils.PageRange;
import com.cloudcode.framework.utils.PaginationSupport;
import com.cloudcode.framework.utils.UUID;
import com.cloudcode.lottery.dao.ForecastDao;
import com.cloudcode.lottery.dao.ForecastIssueDao;
import com.cloudcode.lottery.dao.HistoryDao;
import com.cloudcode.lottery.dao.LotteryDao;
import com.cloudcode.lottery.model.Forecast;
import com.cloudcode.lottery.model.ForecastIssue;
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
	@Autowired
	private  ForecastIssueDao forecastIssueDao;
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
	@RequestMapping(value = "forecastquery", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody
	PaginationSupport<Forecast> forecastquery(Forecast forecast, PageRange pageRange,HttpServletRequest request) {
		String repeatStart=request.getParameter("repeatStart");
		PaginationSupport<Forecast> result = forecastDao.queryForecastPagingData(forecast, pageRange,request);
		return result;
	}
	@RequestMapping(value = "toList")
	public ModelAndView toList(HttpServletRequest request) {
		String issueid=request.getParameter("issueid");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("classpath:com/cloudcode/lottery/ftl/forecast/list.ftl");
		modelAndView.addObject("issueid", issueid);
		return modelAndView;
	}
	@RequestMapping(value = "toForecastList")
	public ModelAndView toForecastList(HttpServletRequest request) {
		ModelAndView modelAndView = new ModelAndView();
		String issueid=request.getParameter("issueid");
		String intervalAndTotalStrart = request.getParameter("intervalAndTotalStrart");
		String intervalAndTotalEnd = request.getParameter("intervalAndTotalEnd");
		String horVer = request.getParameter("horVer");
		Map<String, String[]> map = request.getParameterMap();  
        Set<Entry<String, String[]>> set = map.entrySet();  
        Iterator<Entry<String, String[]>> it = set.iterator();  
        while (it.hasNext()) {  
            Entry<String, String[]> entry = it.next(); 
            if(null != entry.getValue()){
            	for (String i : entry.getValue()) {  
            		modelAndView.addObject(entry.getKey(), i);
            	}
            }else{
            	modelAndView.addObject(entry.getKey(), "");
            }
        }  
		modelAndView.setViewName("classpath:com/cloudcode/lottery/ftl/forecast/forecastlist.ftl");
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
	public ModelAndView toCalcSearch(HttpServletRequest request) {
		String issueid=request.getParameter("issueid");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("classpath:com/cloudcode/lottery/ftl/forecast/searchcalc.ftl");
		modelAndView.addObject("issueid", issueid);
		return modelAndView;
	}
	
	@RequestMapping(value = "/search",  method = {
			RequestMethod.POST,RequestMethod.GET})
	public @ResponseBody
	Object search(HttpServletRequest request) {
		String issue=request.getParameter("issue");
		String OddEven=request.getParameter("oddeven");
		String consecutiveNumber = request.getParameter("consecutiveNumber");
		String totalStrart=request.getParameter("totalStrart");
		String totalEnd=request.getParameter("totalEnd");
		String tStrart=request.getParameter("tStrart");
		String tEnd=request.getParameter("tEnd");
		String lengthStart=request.getParameter("lengthStart");
		String lengthEnd=request.getParameter("lengthEnd");
		String thanTheHorizontalSpacingAddStart=request.getParameter("thanTheHorizontalSpacingAddStart");
		String thanTheHorizontalSpacingAddEnd=request.getParameter("thanTheHorizontalSpacingAddEnd");
		String upperAreasStart=request.getParameter("upperAreasStart");
		String upperAreasEnd=request.getParameter("upperAreasEnd");
		String lowerAreasStart=request.getParameter("lowerAreasStart");
		String lowerAreasEnd=request.getParameter("lowerAreasEnd");
		String fourthArea1Start=request.getParameter("fourthArea1Start");
		String fourthArea1End=request.getParameter("fourthArea1End");
		String fourthArea2Start=request.getParameter("fourthArea2Start");
		String fourthArea2End=request.getParameter("fourthArea2End");
		String fourthArea3Start=request.getParameter("fourthArea3Start");
		String fourthArea3End=request.getParameter("fourthArea3End");
		String fourthArea4Start=request.getParameter("fourthArea4Start");
		String fourthArea4End=request.getParameter("fourthArea4End");
		String sixArea1Start=request.getParameter("sixArea1Start");
		String sixArea1End=request.getParameter("sixArea1End");
		String sixArea2Start=request.getParameter("sixArea2Start");
		String sixArea2End=request.getParameter("sixArea2End");
		String sixArea3Start=request.getParameter("sixArea3Start");
		String sixArea3End=request.getParameter("sixArea3End");
		String sixArea4Start=request.getParameter("sixArea4Start");
		String sixArea4End=request.getParameter("sixArea4End");
		String sixArea5Start=request.getParameter("sixArea5Start");
		String sixArea5End=request.getParameter("sixArea5End");
		String sixArea6Start=request.getParameter("sixArea6Start");
		String sixArea6End=request.getParameter("sixArea6End");
		String nineArea1Start=request.getParameter("nineArea1Start");
		String nineArea1End=request.getParameter("nineArea1End");
		String nineArea2Start=request.getParameter("nineArea2Start");
		String nineArea2End=request.getParameter("nineArea2End");
		String nineArea3Start=request.getParameter("nineArea3Start");
		String nineArea3End=request.getParameter("nineArea3End");
		String nineArea4Start=request.getParameter("nineArea4Start");
		String nineArea4End=request.getParameter("nineArea4End");
		String nineArea5Start=request.getParameter("nineArea5Start");
		String nineArea5End=request.getParameter("nineArea5End");
		String nineArea6Start=request.getParameter("nineArea6Start");
		String nineArea6End=request.getParameter("nineArea6End");
		String nineArea7Start=request.getParameter("nineArea7Start");
		String nineArea7End=request.getParameter("nineArea7End");
		String nineArea8Start=request.getParameter("nineArea8Start");
		String nineArea8End=request.getParameter("nineArea8End");
		String nineArea9Start=request.getParameter("nineArea9Start");
		String nineArea9End=request.getParameter("nineArea9End");
		String thanThreeRatio0Start=request.getParameter("thanThreeRatio0Start");
		String thanThreeRatio0End=request.getParameter("thanThreeRatio0End");
		String thanThreeRatio1Start=request.getParameter("thanThreeRatio1Start");
		String thanThreeRatio1End=request.getParameter("thanThreeRatio1End");
		String thanThreeRatio2Start=request.getParameter("thanThreeRatio2Start");
		String thanThreeRatio2End=request.getParameter("thanThreeRatio2End");
		String thanFiveRatio0Start=request.getParameter("thanFiveRatio0Start");
		String thanFiveRatio0End=request.getParameter("thanFiveRatio0End");
		String thanFiveRatio1Start=request.getParameter("thanFiveRatio1Start");
		String thanFiveRatio1End=request.getParameter("thanFiveRatio1End");
		String thanFiveRatio2Start=request.getParameter("thanFiveRatio2Start");
		String thanFiveRatio2End=request.getParameter("thanFiveRatio2End");
		String thanFiveRatio3Start=request.getParameter("thanFiveRatio3Start");
		String thanFiveRatio3End=request.getParameter("thanFiveRatio3End");
		String thanFiveRatio4Start=request.getParameter("thanFiveRatio4Start");
		String thanFiveRatio4End=request.getParameter("thanFiveRatio4End");
		String thanSevenRatio0Start=request.getParameter("thanSevenRatio0Start");
		String thanSevenRatio0End=request.getParameter("thanSevenRatio0End");
		String thanSevenRatio1Start=request.getParameter("thanSevenRatio1Start");
		String thanSevenRatio1End=request.getParameter("thanSevenRatio1End");
		String thanSevenRatio2Start=request.getParameter("thanSevenRatio2Start");
		String thanSevenRatio2End=request.getParameter("thanSevenRatio2End");
		String thanSevenRatio3Start=request.getParameter("thanSevenRatio3Start");
		String thanSevenRatio3End=request.getParameter("thanSevenRatio3End");
		String thanSevenRatio4Start=request.getParameter("thanSevenRatio4Start");
		String thanSevenRatio4End=request.getParameter("thanSevenRatio4End");
		String thanSevenRatio5Start=request.getParameter("thanSevenRatio5Start");
		String thanSevenRatio5End=request.getParameter("thanSevenRatio5End");
		String thanSevenRatio6Start=request.getParameter("thanSevenRatio6Start");
		String thanSevenRatio6End=request.getParameter("thanSevenRatio6End");
		
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
		//总和
		CriterionUtil.setCriterion(totalStrart, totalEnd, criterion, "total");
		//T值
		CriterionUtil.setCriterion(tStrart, tEnd, criterion, "t");
		//长度
		CriterionUtil.setCriterion(lengthStart, lengthEnd, criterion, "length");
		//横向间隔和
		CriterionUtil.setCriterion(thanTheHorizontalSpacingAddStart, thanTheHorizontalSpacingAddEnd, criterion, "thanthehorizontalspacingadd");
		//上下区个数比 上区
		CriterionUtil.setCriterion(upperAreasStart, upperAreasEnd, criterion, "upperareas");
		CriterionUtil.setCriterion(lowerAreasStart, lowerAreasEnd, criterion, "lowerareas");//下区
		//4区之比
		CriterionUtil.setCriterion(fourthArea1Start, fourthArea1End, criterion, "fourtharea1");
		CriterionUtil.setCriterion(fourthArea2Start, fourthArea2End, criterion, "fourtharea2");
		CriterionUtil.setCriterion(fourthArea3Start, fourthArea3End, criterion, "fourtharea3");
		CriterionUtil.setCriterion(fourthArea4Start, fourthArea4End, criterion, "fourtharea4");
		//6区之比
		CriterionUtil.setCriterion(sixArea1Start, sixArea1End, criterion, "sixarea1");
		CriterionUtil.setCriterion(sixArea2Start, sixArea2End, criterion, "sixarea2");
		CriterionUtil.setCriterion(sixArea3Start, sixArea3End, criterion, "sixarea3");
		CriterionUtil.setCriterion(sixArea4Start, sixArea4End, criterion, "sixarea4");
		CriterionUtil.setCriterion(sixArea5Start, sixArea5End, criterion, "sixarea5");
		CriterionUtil.setCriterion(sixArea6Start, sixArea6End, criterion, "sixarea6");
		//9区之比
		CriterionUtil.setCriterion(nineArea1Start, nineArea1End, criterion, "ninearea1");
		CriterionUtil.setCriterion(nineArea2Start, nineArea2End, criterion, "ninearea2");
		CriterionUtil.setCriterion(nineArea3Start, nineArea3End, criterion, "ninearea3");
		CriterionUtil.setCriterion(nineArea4Start, nineArea4End, criterion, "ninearea4");
		CriterionUtil.setCriterion(nineArea5Start, nineArea5End, criterion, "ninearea5");
		CriterionUtil.setCriterion(nineArea6Start, nineArea6End, criterion, "ninearea6");
		CriterionUtil.setCriterion(nineArea7Start, nineArea7End, criterion, "ninearea7");
		CriterionUtil.setCriterion(nineArea8Start, nineArea8End, criterion, "ninearea8");
		CriterionUtil.setCriterion(nineArea9Start, nineArea9End, criterion, "ninearea9");
		//余3个数比
		CriterionUtil.setCriterion(thanThreeRatio0Start, thanThreeRatio0End, criterion, "thanthreeratio0");
		CriterionUtil.setCriterion(thanThreeRatio1Start, thanThreeRatio1End, criterion, "thanthreeratio1");
		CriterionUtil.setCriterion(thanThreeRatio2Start, thanThreeRatio2End, criterion, "thanthreeratio2");
		//余5个数比
		CriterionUtil.setCriterion(thanFiveRatio0Start, thanFiveRatio0End, criterion, "thanfiveratio0");
		CriterionUtil.setCriterion(thanFiveRatio1Start, thanFiveRatio1End, criterion, "thanfiveratio1");
		CriterionUtil.setCriterion(thanFiveRatio2Start, thanFiveRatio2End, criterion, "thanfiveratio2");
		CriterionUtil.setCriterion(thanFiveRatio3Start, thanFiveRatio3End, criterion, "thanfiveratio3");
		CriterionUtil.setCriterion(thanFiveRatio4Start, thanFiveRatio4End, criterion, "thanfiveratio4");
		//余7个数比
		CriterionUtil.setCriterion(thanSevenRatio0Start, thanSevenRatio0End, criterion, "thansevenratio0");
		CriterionUtil.setCriterion(thanSevenRatio1Start, thanSevenRatio1End, criterion, "thansevenratio1");
		CriterionUtil.setCriterion(thanSevenRatio2Start, thanSevenRatio2End, criterion, "thansevenratio2");
		CriterionUtil.setCriterion(thanSevenRatio3Start, thanSevenRatio3End, criterion, "thansevenratio3");
		CriterionUtil.setCriterion(thanSevenRatio4Start, thanSevenRatio4End, criterion, "thansevenratio4");
		CriterionUtil.setCriterion(thanSevenRatio5Start, thanSevenRatio5End, criterion, "thansevenratio5");
		CriterionUtil.setCriterion(thanSevenRatio6Start, thanSevenRatio6End, criterion, "thansevenratio6");
		String issueid = UUID.generateUUID();
		List<Lottery> lists=lotteryDao.loadAll(criterion);
		List<Forecast> lists2=new ArrayList<Forecast>();
		for(Lottery lottery:lists){
			Forecast forecast=new Forecast();
			BeanUtils.copyProperties(lottery, forecast);
			forecast.setId(UUID.generateUUID());
			forecast.setIssue(issue);
			forecast.setIssueid(issueid);
			lists2.add(forecast);
		}
		History phistory = historyDao.getNewHistory(); 
		List<History> phistoryList = historyDao.getNewHistoryList(); 
		List<Model> lists3= new ArrayList<Model>();
		lists3.addAll(phistoryList);
		for(int i=0;i<lists2.size();i++){
			Forecast forecast=lists2.get(i);
		    lotteryUtil.getIntervaland(forecast, phistory);
		    lotteryUtil.getHeat(forecast, phistory);
		    lotteryUtil.getRatioNoNumbers(forecast,lists3, 0);
		    lotteryUtil.getNewSideRepeatNo(forecast, phistory);
			//forecastDao.addForecast(forecast);
		}
		forecastDao.addForecast(lists2);
		ForecastIssue forecastIssue=new ForecastIssue();
		forecastIssue.setId(issueid);
		forecastIssue.setIssue(issue);
		forecastIssue.setForecastcount(lists2.size());
		forecastIssue.setDrawtime(new Date());
		forecastIssueDao.addForecastIssue(forecastIssue);
		return new ServiceResult(ReturnResult.SUCCESS,"");
	}
	@RequestMapping(value = "/{id}/delete",  method = {
			RequestMethod.POST,RequestMethod.GET}, produces = "application/json")
	public @ResponseBody Object delete(@PathVariable("id") String id) {
			forecastDao.deleteObject(id);
		return new ServiceResult(ReturnResult.SUCCESS,"");
	}
}
