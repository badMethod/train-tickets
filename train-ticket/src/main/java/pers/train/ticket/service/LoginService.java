package pers.train.ticket.service;

import pers.train.ticket.model.TicketUser;

public interface LoginService {

	public TicketUser login(String userName,String password) throws Exception;
}