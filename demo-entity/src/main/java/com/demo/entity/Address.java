package com.demo.entity;

import javax.persistence.Column;
import javax.persistence.Table;

import com.demo.base.entity.BaseEntity;
import com.demo.base.entity.annotation.EnableExample;

@Table(name = "address")
public class Address extends BaseEntity{
    

	@Column(name = "userid")
	@EnableExample
    private String userid;
	
	@Column(name = "phone")
	@EnableExample
    private String phone;

	@Column(name = "address")
	@EnableExample
    private String address;
    
	@Column(name = "user_name")
	@EnableExample
	private String userName;
	
	@Column(name = "user_sex")
	@EnableExample
	private String userSex;
	
	@Column(name = "add_is_default")
	@EnableExample
	private String addIsDefault;
	
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserSex() {
		return userSex;
	}

	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}

	public String getAddIsDefault() {
		return addIsDefault;
	}

	public void setAddIsDefault(String addIsDefault) {
		this.addIsDefault = addIsDefault;
	}
    
}