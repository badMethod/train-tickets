package pers.train.ticket.dao;

import pers.train.ticket.model.TicketOrder;

public interface TicketOrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TicketOrder record);

    int insertSelective(TicketOrder record);

    TicketOrder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TicketOrder record);

    int updateByPrimaryKey(TicketOrder record);
}