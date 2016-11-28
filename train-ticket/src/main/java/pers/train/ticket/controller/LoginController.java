package pers.train.ticket.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import net.sf.json.JSONObject;
import pers.train.ticket.model.TicketUser;
import pers.train.ticket.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;

	@RequestMapping("/login")
	public String toLogin() {
		return "login.jsp";
	}

	@RequestMapping(value = "/toindex", method = RequestMethod.POST)
	@ResponseBody
	public String toindex(HttpSession session, @RequestParam String account, @RequestParam String password) {
		String msgCode = "200";
		JSONObject msg = new JSONObject();
		TicketUser user = null;
		try {
			user = loginService.login(account, password);
		} catch (Exception e) {
			e.printStackTrace();
			msgCode = "500";
		}
		if (user != null) {
			session.setAttribute("currentUser", user);
		} else {
			msgCode = "601";
		}
		msg.put("msgCode", msgCode);
		return msg.toString();
	}
}
