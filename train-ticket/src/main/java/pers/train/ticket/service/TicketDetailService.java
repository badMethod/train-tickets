package pers.train.ticket.service;

import java.util.List;

import pers.train.ticket.model.TicketDetail;

public interface TicketDetailService {

	public List<TicketDetail> getAllTicket(String date) throws Exception;
}
