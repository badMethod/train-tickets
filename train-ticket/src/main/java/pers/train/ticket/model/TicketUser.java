package pers.train.ticket.model;

import java.io.Serializable;

public class TicketUser implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6368802513063993395L;

	private Integer userId;

	private String account;

	private String password;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account == null ? null : account.trim();
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password == null ? null : password.trim();
	}
}