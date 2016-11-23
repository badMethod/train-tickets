package pers.train.ticket.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pers.train.ticket.dao.TicketDetailMapper;
import pers.train.ticket.model.TicketDetail;
import pers.train.ticket.service.TicketDetailService;

@Transactional(rollbackFor = Exception.class)
@Service("ticketDetailService")
public class TicketDetailServiceImpl implements TicketDetailService {

	@Autowired
	private TicketDetailMapper ticketDetailMapper;

	@Override
	public List<TicketDetail> getAllTicket(String date) throws Exception {
		List<TicketDetail> list = null;
		try {
			list = ticketDetailMapper.getAllTicket(date);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

}
