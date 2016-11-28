package pers.train.ticket.model;

import java.io.Serializable;
import java.math.BigDecimal;

import org.springframework.format.annotation.NumberFormat;

public class TicketResidue implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5589473556579752963L;

	private Integer id;

	private Integer ticId;

	@NumberFormat(pattern="####.##")
	private BigDecimal price;

	private Integer type;

	private Integer residue;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getTicId() {
		return ticId;
	}

	public void setTicId(Integer ticId) {
		this.ticId = ticId;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getResidue() {
		return residue;
	}

	public void setResidue(Integer residue) {
		this.residue = residue;
	}
}