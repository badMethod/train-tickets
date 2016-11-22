package pers.train.ticket.model;

import java.util.Date;

public class TicketOrder {
    private Integer id;

    private Integer userId;

    private Integer ticId;

    private Integer ticNo;

    private Date createDate;

    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getTicId() {
        return ticId;
    }

    public void setTicId(Integer ticId) {
        this.ticId = ticId;
    }

    public Integer getTicNo() {
        return ticNo;
    }

    public void setTicNo(Integer ticNo) {
        this.ticNo = ticNo;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}