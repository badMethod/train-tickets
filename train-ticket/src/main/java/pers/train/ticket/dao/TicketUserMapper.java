package pers.train.ticket.dao;

import pers.train.ticket.model.TicketUser;

public interface TicketUserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(TicketUser record);

    int insertSelective(TicketUser record);

    TicketUser selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(TicketUser record);

    int updateByPrimaryKey(TicketUser record);
}