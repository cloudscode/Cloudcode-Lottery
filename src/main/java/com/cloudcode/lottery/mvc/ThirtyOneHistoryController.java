package com.cloudcode.lottery.mvc;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
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
import com.cloudcode.lottery.dao.ThirtyOneHistoryDao;
import com.cloudcode.lottery.model.ThirtyOneHistory;
import com.cloudcode.lottery.model.base.Model;
import com.cloudcode.lottery.util.LotteryExportUtil;
import com.cloudcode.lottery.util.LotteryUtil;

@Controller
@RequestMapping({ "/thirtyOneHistory" })
public class ThirtyOneHistoryController extends CrudController<ThirtyOneHistory> {

	@Autowired
	private  ThirtyOneHistoryDao thirtyOneHistoryDao;
	@Autowired
	private LotteryUtil lotteryUtil;
	@Autowired
	private LotteryExportUtil lotteryExportUtil;
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public @ResponseBody Object create(@ModelAttribute ThirtyOneHistory history,
			HttpServletRequest request) {
		history.setId(UUID.generateUUID());
		thirtyOneHistoryDao.createThirtyOneHistory(history);
		return new ServiceResult(ReturnResult.SUCCESS,"",history);
	}
	@RequestMapping(value = "/{id}/update", method = { RequestMethod.POST,
			RequestMethod.GET })
	public @ResponseBody Object update(@PathVariable("id") String id,
			@ModelAttribute ThirtyOneHistory updateObject, HttpServletRequest request) {
		ThirtyOneHistory history = thirtyOneHistoryDao.loadObject(id);
		if (history != null) {
			BeanUpdater.copyProperties(updateObject, history);
			thirtyOneHistoryDao.updateThirtyOneHistory(history);
			return new ServiceResult(ReturnResult.SUCCESS);
		}
		return null;
	}
	@RequestMapping(value = "/calcThirtyOneHistory",  method = {
			RequestMethod.POST,RequestMethod.GET}, produces = "application/json")
	public @ResponseBody
	Object calcThirtyOneHistory(@ModelAttribute("num")  String num,HttpServletRequest request) {
		String result=request.getParameter("num");
		System.out.println(result+"***"+num);
		String[] nums=num.split(",");
		List<Integer> list = new ArrayList<Integer>();
		int[] number = new int[7];
		for(int i=0;i<nums.length;i++){
			number[i]=Integer.parseInt(nums[i]);
		}
		
		ThirtyOneHistory history = new ThirtyOneHistory();
		/*historyUtil.arrSort(number,history);
		historyUtil.calcThirtyOneHistory(history);*/
		return new ServiceResult(ReturnResult.SUCCESS,"",history);
	}
	@RequestMapping(value = "/init",  method = {
			RequestMethod.POST,RequestMethod.GET}, produces = "application/json")
	public @ResponseBody
	Object init() {
		Criteria criterion = thirtyOneHistoryDao.getSession().createCriteria(ThirtyOneHistory.class);
		criterion.addOrder(Order.desc("issue"));
		List<ThirtyOneHistory> lists=thirtyOneHistoryDao.loadAll(criterion);
		for(int i=0;i<lists.size();i++){
			ThirtyOneHistory history=lists.get(i);
			lotteryUtil.arrSort(history);
			lotteryUtil.calcLottery(history);
			if((i+1)<lists.size()){
			  ThirtyOneHistory phistory=lists.get(i+1);
			  lotteryUtil.getNewSideRepeatNo(history, phistory);
			}
			/*if((i-1)<lists.size()){
				if(i-1 ==-1){
					history.initIntervaland1(history);
				}else if(i-1 >=0){
				  ThirtyOneHistory phistory=lists.get(i-1);
				  lotteryUtil.getIntervaland(history, phistory);
				  lotteryUtil.getHeat(history, phistory, i);
				}
			}*/
			List<ThirtyOneHistory> listH = thirtyOneHistoryDao.getCurrentThirtyOneHistoryList(history.getIssue());
			List<Model> lists3= new ArrayList<Model>();
			lists3.addAll(listH);
			lotteryUtil.getRatioNoNumbers(history,lists3, i);
			thirtyOneHistoryDao.updateObject(history);
		}
		Criteria criterion2 = thirtyOneHistoryDao.getSession().createCriteria(ThirtyOneHistory.class);
		criterion2.addOrder(Order.asc("issue"));
		List<ThirtyOneHistory> lists2=thirtyOneHistoryDao.loadAll(criterion2);
		List<Model> lists3= new ArrayList<Model>();
		lists3.addAll(lists2);
		for(int i=0;i<lists2.size();i++){
			ThirtyOneHistory history=lists2.get(i);
			if((i-1)<lists.size()){
				if(i-1 ==-1){
					history.initIntervaland1(history);
				}else if(i-1 >=0){
				  ThirtyOneHistory phistory=lists2.get(i-1);
				  lotteryUtil.getIntervaland(history, phistory);
				  lotteryUtil.getHeat(history, phistory, i);
				}
			}
			thirtyOneHistoryDao.updateObject(history);
		}
		return new ServiceResult(ReturnResult.SUCCESS,"");
	}
	@RequestMapping(value = "query", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody
	PaginationSupport<ThirtyOneHistory> query(ThirtyOneHistory history, PageRange pageRange) {
		PaginationSupport<ThirtyOneHistory> result = thirtyOneHistoryDao.queryPagingData(history, pageRange);
		return result;
	}
	@RequestMapping(value = "toList")
	public ModelAndView toList() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("classpath:com/cloudcode/lottery/ftl/thirtyone/list.ftl");
		return modelAndView;
	}
	@RequestMapping(value = "toList1")
	public ModelAndView toList1() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("classpath:com/cloudcode/lottery/ftl/thirtyone/list1.ftl");
		return modelAndView;
	}
	@RequestMapping(value = "toCreate")
	public ModelAndView toCreate() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("classpath:com/cloudcode/lottery/ftl/thirtyone/detail.ftl");
		modelAndView.addObject("entityAction", "create");
		ThirtyOneHistory history = new ThirtyOneHistory();
		ThirtyOneHistory phistory = thirtyOneHistoryDao.getNewThirtyOneHistory();
		String oldIssue = "";
		if(null != phistory){
			Integer issue =Integer.parseInt(phistory.getIssue())+1;
		    oldIssue = issue.toString();
		    Integer serialnum =Integer.parseInt(phistory.getSerialnum())+1;
		    modelAndView.addObject("serialnum", serialnum.toString());
		}
		
		history = lotteryUtil.getThirtyOneHistor(oldIssue);
		modelAndView.addObject("history", history);
		return modelAndView;
	}
	@RequestMapping(value = "/{id}/toUpdate")
	public ModelAndView toUpdate(@PathVariable("id") String id) {
		ThirtyOneHistory history = thirtyOneHistoryDao.loadObject(id);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("classpath:com/cloudcode/lottery/ftl/thirtyone/detail.ftl");
		modelAndView.addObject("entityAction", "update");
		modelAndView.addObject("history", history);
		return modelAndView;
	}
	@RequestMapping(value = "/{id}/toView")
	public ModelAndView toView(@PathVariable("id") String id) {
		ThirtyOneHistory history =thirtyOneHistoryDao.loadObject(id);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("classpath:com/cloudcode/lottery/ftl/thirtyone/view.ftl");
		modelAndView.addObject("history",history);
		return modelAndView;
	}
	@RequestMapping(value = "/{id}/delete",  method = {
			RequestMethod.POST,RequestMethod.GET}, produces = "application/json")
	public @ResponseBody Object delete(@PathVariable("id") String id) {
		thirtyOneHistoryDao.deleteObject(id);
		return new ServiceResult(ReturnResult.SUCCESS,"");
	}
	@RequestMapping(value = "/deleteAll")
	public @ResponseBody Object deleteAll(HttpServletRequest request) {
		String ids = request.getParameter("ids");
		String[] arrayId = ids.split(",");
		for(String id:arrayId){
			thirtyOneHistoryDao.deleteObject(id);
		}
		return new ServiceResult(ReturnResult.SUCCESS);
	}
	@RequestMapping(value = "/test")
	public @ResponseBody Object test(HttpServletRequest request) {
			thirtyOneHistoryDao.getCurrentThirtyOneHistoryList("16038");
		return new ServiceResult(ReturnResult.SUCCESS);
	}
	@RequestMapping(value = "/export",  method = {
			RequestMethod.POST,RequestMethod.GET})
	public void export(HttpServletRequest req, HttpServletResponse response) throws IOException {
		String issueid = req.getParameter("issueid");
		response.setContentType("application/octet-stream");
		String fileName = "开奖信息";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss");
		String date = sdf.format(new Date());
		fileName +="-"+date;
		fileName+=".xls";
		if (req.getHeader("User-Agent").toUpperCase().indexOf("MSIE") > -1) {
			fileName = URLEncoder.encode(fileName, "UTF-8");
		} else if (req.getHeader("User-Agent").indexOf("Trident") > -1 && req.getHeader("User-Agent").indexOf("rv:11.0") >-1) {//ie11
			fileName = URLEncoder.encode(fileName, "UTF-8");
		}else{
			fileName = new String(fileName.getBytes("UTF-8"), "ISO8859-1");
		}
		response.addHeader("Content-Disposition", "attachment;filename="
				+ fileName);
		ByteArrayOutputStream baos = null;
		try {
			String sql=" select * from lottery_history ";
			List<Map<String, Object>> dataList=new ArrayList<Map<String,Object>>();
			dataList = thirtyOneHistoryDao.queryForMapListBySQL(sql, null);
			baos =  lotteryExportUtil.getExportData(dataList,fileName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		IOUtils.copy(new ByteArrayInputStream(baos.toByteArray()),
				response.getOutputStream());
	}
}
