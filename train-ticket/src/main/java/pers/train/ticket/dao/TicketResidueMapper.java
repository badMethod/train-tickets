package pers.train.ticket.dao;

import java.util.List;

import pers.train.ticket.model.TicketResidue;

public interface TicketResidueMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TicketResidue record);

    int insertSelective(TicketResidue record);

    TicketResidue selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TicketResidue record);

    int updateByPrimaryKey(TicketResidue record);
    
    List<TicketResidue> getDetailByticId(int ticId);
}