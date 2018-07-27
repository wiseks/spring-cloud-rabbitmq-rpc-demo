package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ConsumerController {

	@Autowired
	private AccountService accountService;
	
	@RequestMapping("/test")
	@ResponseBody
	public String test(){
		long time = System.currentTimeMillis();
		accountService.test();
		System.out.println(System.currentTimeMillis()-time);
		return "test1";
	}
}
