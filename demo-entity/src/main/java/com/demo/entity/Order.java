package com.demo.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Table;

import com.demo.base.entity.BaseEntity;

@Table(name = "order")
public class Order extends BaseEntity{
	@Column(name = "userid")
    private String userid;

	@Column(name = "appointmentTime")
    private Date appointmentTime;

	@Column(name = "createTime")
    private Date createTime;

	@Column(name = "money")
    private Short money;

	@Column(name = "phone")
    private String phone;

	@Column(name = "remark")
    private String remark;

	
	private List<OrderDtl> orderDtls;
	

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public Date getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(Date appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Short getMoney() {
        return money;
    }

    public void setMoney(Short money) {
        this.money = money;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

	public List<OrderDtl> getOrderDtls() {
		return orderDtls;
	}

	public void setOrderDtls(List<OrderDtl> orderDtls) {
		this.orderDtls = orderDtls;
	}
 
    
}