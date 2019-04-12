package com.ssi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
public class SampleController {

	@RequestMapping("something")
	
	public void doSomething(@SessionAttribute("user") String id, @CookieValue("cname") String s){
		System.out.println("Welcome  : "+id);
		System.out.println("Doing Something");
		
	}
	
}

//@SessionAttribute is used for mapping a method arg to any member stored in session.
//@CookieValue is used for mapping a method arg to any member stored in cookie
