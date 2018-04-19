package com.demo.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Table;

import com.demo.base.entity.BaseEntity;

@Table(name = "orders")
public class Order extends BaseEntity{
	@Column(name = "userid")
    private String userid;
	
	@Column(name = "user_name")
    private String userName;

	@Column(name = "appointment_Time")
    private String appointmentTime;

	@Column(name = "create_Time")
    private Date createTime;

	@Column(name = "money")
    private Short money;

	@Column(name = "phone")
    private String phone;

	@Column(name = "remark")
    private String remark;

	@Column(name = "address")
	private String address;
	
	@Column(name = "user_sex")
	private String userSex;
	
	@Column(name = "doc_status")
	private String docStatus;
	
	private List<OrderDtl> orderDtls;
	
    public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(String appointmentTime) {
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getUserSex() {
		return userSex;
	}

	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}

	public String getDocStatus() {
		return docStatus;
	}

	public void setDocStatus(String docStatus) {
		this.docStatus = docStatus;
	}
 
    
}