package com.cloudcode.lottery.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cloudcode.framework.controller.CrudController;
import com.cloudcode.lottery.model.ForecastIssue;

@Controller
@RequestMapping({ "/lmenu" })
public class LotteryMenuController extends CrudController<ForecastIssue> {

	
	@RequestMapping(value = "toIndex")
	public ModelAndView toList(HttpServletRequest request) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("classpath:com/cloudcode/lottery/ftl/menu/index.ftl");
		modelAndView.addObject("port", request.getLocalPort());
		modelAndView.addObject("ip", request.getLocalAddr());
		return modelAndView;
	}
	
}
