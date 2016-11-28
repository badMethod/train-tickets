package pers.train.ticket.service;

import java.util.List;

import pers.train.ticket.model.TicketDetail;
import pers.train.ticket.model.TicketResidue;

public interface TicketDetailService {

	/**
	 * 根据日期和车站查出当天的全部车票
	 * 
	 * @param date
	 *            日期
	 * @param startCity
	 * @param endCity
	 * @return
	 * @throws Exception
	 */
	public List<TicketDetail> getAllTicket(String date, String startCity, String endCity) throws Exception;
	
	/**
	 * 根据车次id查出车次信息
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public TicketDetail getTicketDetail(int id) throws Exception;

	/**
	 * 根据车次id查出余票信息
	 * 
	 * @param ticId
	 * @return
	 * @throws Exception
	 */
	public List<TicketResidue> getResidueResidue(int ticId) throws Exception;
}
