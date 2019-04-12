package com.ssi.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;



@Controller
@SessionAttributes(names={"user","city"})
public class MyController {
	@RequestMapping("someotherpage")
	public String showSomeOtherPage(){
		return "otherpage";
	}
	@RequestMapping("verify")
	public ModelAndView verifyUser(@RequestParam("userid") String userid){
		if(userid.equals("manoj") || userid.equals("manish")){
			ModelAndView mv=new ModelAndView("loginsuccess");
			mv.addObject("user", userid); //stored in session
			mv.addObject("city", "indore"); //stored in session
			mv.addObject("state","mp");//stored in request
			//HttpSession session=request.getSession();
			//session.setAttribute("user", userid);
			//session.setAttribute("city","indore");
			return mv;
		}
		
		ModelAndView mv=new ModelAndView("login");
		return mv;
	}
	@RequestMapping("login")
	public String check(){
		return "login";
	}
}
