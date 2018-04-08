package com.demo.entity;

import javax.persistence.Column;
import javax.persistence.Table;

import com.demo.base.entity.BaseEntity;

@Table(name = "order_dtl")
public class OrderDtl extends BaseEntity{

	@Column(name = "itemName")
    private String itemName;

	@Column(name = "itemNum")
    private Short itemNum;

	@Column(name = "itemMoney")
    private String itemMoney;

	@Column(name = "orderId")
    private String orderId;

	
	public OrderDtl() {
		
	}
	
	public OrderDtl(String ID) {
		this.id = ID;
	}
	
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName == null ? null : itemName.trim();
    }

    public Short getItemNum() {
        return itemNum;
    }

    public void setItemNum(Short itemNum) {
        this.itemNum = itemNum;
    }

    public String getItemMoney() {
        return itemMoney;
    }

    public void setItemMoney(String itemMoney) {
        this.itemMoney = itemMoney == null ? null : itemMoney.trim();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }
}