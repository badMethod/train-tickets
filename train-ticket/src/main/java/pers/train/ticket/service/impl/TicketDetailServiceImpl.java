package pers.train.ticket.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pers.train.ticket.dao.TicketDetailMapper;
import pers.train.ticket.dao.TicketResidueMapper;
import pers.train.ticket.model.TicketDetail;
import pers.train.ticket.model.TicketResidue;
import pers.train.ticket.service.TicketDetailService;

@Transactional(rollbackFor = Exception.class)
@Service("ticketDetailService")
public class TicketDetailServiceImpl implements TicketDetailService {

	@Autowired
	private TicketDetailMapper ticketDetailMapper;
	@Autowired
	private TicketResidueMapper ticketResidueMapper;

	@Override
	public List<TicketDetail> getAllTicket(String date, String startCity, String endCity) throws Exception {
		List<TicketDetail> list = null;
		try {
			list = ticketDetailMapper.getAllTicket(date, startCity, endCity);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public TicketDetail getTicketDetail(int id) throws Exception {
		TicketDetail ticketDetail = null;
		try {
			ticketDetail = ticketDetailMapper.selectByPrimaryKey(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ticketDetail;
	}

	@Override
	public List<TicketResidue> getResidueResidue(int ticId) throws Exception {
		List<TicketResidue> ticketResidues = null;
		try {
			ticketResidues = ticketResidueMapper.getDetailByticId(ticId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ticketResidues;
	}
}
