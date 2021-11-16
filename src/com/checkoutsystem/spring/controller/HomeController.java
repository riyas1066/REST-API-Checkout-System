package com.checkoutsystem.spring.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.checkoutsystem.spring.model.User;

@Controller
public class HomeController {

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {


		return "home";
	}

	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public String user(@Validated User user, Model model) {
		System.out.println("User Page Requested");
		double total = (1*user.getQuanOne())+(0.60*user.getQuanTwo())+(0.40*user.getQuanThree());
		model.addAttribute("quanOne",(1*user.getQuanOne()));
		model.addAttribute("quanTwo", Math.round((0.60*user.getQuanTwo())));
		model.addAttribute("quanThree", Math.round((0.40*user.getQuanThree())));
		model.addAttribute("quanOneOrg",user.getQuanOne());
		model.addAttribute("quanTwoOrg", user.getQuanTwo());
		model.addAttribute("quanThreeOrg", user.getQuanThree());
		
		model.addAttribute("total", (int)Math.round(total));
		int brdQun = user.getQuanOne() + user.getQuanOne();
		model.addAttribute("brdQun",brdQun);
		int milkQun = user.getQuanTwo();
		model.addAttribute("milkQun",milkQun);
		float milkQunAmt = Math.round(((user.getQuanTwo()/3)*(0.60*2))+((user.getQuanTwo()%3)*0.60));
		model.addAttribute("milkQunAmt",milkQunAmt);
		int butrQun = user.getQuanThree()+(user.getQuanThree()/2);
		model.addAttribute("butrQun",butrQun);
		float butrQunAmt = Math.round(((user.getQuanThree()/3)*(0.40*2))+((user.getQuanThree()%3)*0.40));
		model.addAttribute("butrQunAmt",butrQunAmt);
		model.addAttribute("alltotal",user.getQuanOne()+milkQunAmt+butrQunAmt);
		return "user";
	}
}
