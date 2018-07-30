package com.graduate.training.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "strategy")

public class Strategy {
    private int id;
    private String type;
    private String ticker;
    private Boolean active;
    private Integer quantity;

    public void runStrategy(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}