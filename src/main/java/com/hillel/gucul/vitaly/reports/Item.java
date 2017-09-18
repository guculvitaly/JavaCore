package com.hillel.gucul.vitaly.reports;

import java.math.BigDecimal;

/**
 * Created by insomnia on 21.07.17.
 */
public class Item {

    private String description;
    private Integer quantity;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(BigDecimal unitprice) {
        this.unitprice = unitprice;
    }

    private BigDecimal unitprice;
}
