package pers.train.ticket.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import pers.train.ticket.model.TicketDetail;
import pers.train.ticket.model.TicketResidue;
import pers.train.ticket.service.TicketDetailService;
import pers.train.ticket.utils.DateJsonValueProcessor;

@Controller
public class TicketDetailController {

	@Autowired
	private TicketDetailService ticketDetailService;

	@RequestMapping(value = "/getAllTicket", method = RequestMethod.POST)
	@ResponseBody
	public String getAllTicket(HttpSession session, @RequestParam String date, @RequestParam String startCity,
			@RequestParam String endCity) {
		String msgCode = "200";
		JSONObject msg = new JSONObject();
		try {
			List<TicketDetail> list = ticketDetailService.getAllTicket(date, startCity, endCity);
			JsonConfig config = new JsonConfig();
			config.registerJsonValueProcessor(Date.class, new DateJsonValueProcessor("yyyy-MM-dd hh:mm:ss"));
			String ticketDetail = JSONArray.fromObject(list, config).toString();
			msg.put("ticketDetail", ticketDetail);
		} catch (Exception e) {
			e.printStackTrace();
			msgCode = "500";
		}
		msg.put("msgCode", msgCode);
		return msg.toString();
	}

	@RequestMapping(value = "/getTicketDetail", method = RequestMethod.POST)
	@ResponseBody
	public String getTicketDetail(HttpSession session, @RequestParam Integer id) {
		String msgCode = "200";
		JSONObject msg = new JSONObject();
		try {
			List<TicketResidue> residues = ticketDetailService.getResidueResidue(id);
			JSONArray result = JSONArray.fromObject(residues);
			msg.put("result", result);
		} catch (Exception e) {
			e.printStackTrace();
			msgCode = "500";
		}
		msg.put("msgCode", msgCode);
		return msg.toString();
	}
}
