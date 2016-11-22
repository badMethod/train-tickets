package pers.train.ticket.model;

import java.math.BigDecimal;

public class TicketResidue {
    private Integer id;

    private Integer ticId;

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