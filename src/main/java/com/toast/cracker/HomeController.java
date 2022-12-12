package com.toast.cracker;

import java.util.List;
import java.util.Locale;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.toast.cracker.service.PlanService;
import com.toast.cracker.vo.PlanVO;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Inject
	private PlanService planService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String userList(Model model) throws Exception{
		
		
		List<PlanVO> userList = planService.selectUserId();
		
		model.addAttribute("userList", userList);
		logger.info("userList", userList);
		
		return "home";
	}
	
	
}
