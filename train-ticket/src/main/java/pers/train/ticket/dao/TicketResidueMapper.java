package pers.train.ticket.dao;

import pers.train.ticket.model.TicketResidue;

public interface TicketResidueMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TicketResidue record);

    int insertSelective(TicketResidue record);

    TicketResidue selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TicketResidue record);

    int updateByPrimaryKey(TicketResidue record);
}