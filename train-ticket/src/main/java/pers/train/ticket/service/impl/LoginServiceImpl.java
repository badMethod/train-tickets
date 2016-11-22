package pers.train.ticket.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pers.train.ticket.dao.TicketDetailMapper;
import pers.train.ticket.model.TicketUser;
import pers.train.ticket.service.LoginService;

@Transactional(rollbackFor = Exception.class)
@Service("loginService")
public class LoginServiceImpl implements LoginService {

	@Autowired
	private TicketDetailMapper ticketDetailMapper;
	
	@Override
	public TicketUser login(String userName, String password) throws Exception {
		return null;
	}

}
