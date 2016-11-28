package pers.train.ticket.dao;

import java.util.List;

import pers.train.ticket.model.TicketDetail;

public interface TicketDetailMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(TicketDetail record);

	int insertSelective(TicketDetail record);

	TicketDetail selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(TicketDetail record);

	int updateByPrimaryKey(TicketDetail record);

	List<TicketDetail> getAllTicket(String date, String startCity, String endCity);
}