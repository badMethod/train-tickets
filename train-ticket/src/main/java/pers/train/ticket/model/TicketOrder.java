package pers.train.ticket.model;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class TicketOrder implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1228954935711374387L;

	private Integer id;

	private Integer userId;

	private Integer ticId;

	private Integer ticNo;

	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
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