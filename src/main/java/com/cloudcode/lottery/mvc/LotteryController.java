package com.cloudcode.lottery.mvc;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cloudcode.framework.controller.CrudController;
import com.cloudcode.framework.rest.ReturnResult;
import com.cloudcode.framework.service.ServiceResult;
import com.cloudcode.framework.utils.UUID;
import com.cloudcode.lottery.dao.LotteryDao;
import com.cloudcode.lottery.model.Lottery;
import com.cloudcode.lottery.util.LotteryUtil;

@Controller
@RequestMapping({ "/lottery" })
public class LotteryController extends CrudController<Lottery> {

	@Autowired
	private  LotteryDao lotteryDao;
	@Autowired
	private LotteryUtil lotteryUtil;
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
		String[] nums=num.split(",");
		List<Integer> list = new ArrayList<Integer>();
		int[] number = new int[7];
		for(int i=0;i<nums.length;i++){
			number[i]=Integer.parseInt(nums[i]);
		}
		
		Lottery lottery = new Lottery();
		lotteryUtil.arrSort(number,lottery);
		lotteryUtil.calcLottery(lottery);
		return new ServiceResult(ReturnResult.SUCCESS,"",lottery);
	}
	@Override
	protected Validator getValidator() {
		// TODO Auto-generated method stub
		return null;
	}
}
