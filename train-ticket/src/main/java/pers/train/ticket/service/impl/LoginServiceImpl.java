package pers.train.ticket.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pers.train.ticket.dao.TicketUserMapper;
import pers.train.ticket.model.TicketUser;
import pers.train.ticket.service.LoginService;

@Transactional(rollbackFor = Exception.class)
@Service("loginService")
public class LoginServiceImpl implements LoginService {

	@Autowired
	private TicketUserMapper ticketUserMapper;

	@Override
	public TicketUser login(String account, String password) throws Exception {
		return ticketUserMapper.login(account, password);
	}

}
