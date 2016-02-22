package com.cloudcode.lottery.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cloudcode.framework.controller.CrudController;
import com.cloudcode.lottery.model.Lottery;

@Controller
@RequestMapping({ "/lottery" })
public class LotteryController extends CrudController<Lottery> {

	
}
