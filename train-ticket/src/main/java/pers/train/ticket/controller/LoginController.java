package pers.train.ticket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	@RequestMapping("/login")
	public String toLogin(){
		return "login.jsp";
	}
	
	@RequestMapping("/toindex")
	public String toindex(){
		return "main.jsp";
	}
}
