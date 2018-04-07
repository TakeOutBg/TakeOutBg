package com.demo.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import com.demo.base.entity.BaseEntity;

@Table(name = "user")
public class User extends BaseEntity{
	@Id
    private String id;

	@Column(name = "username")
    private String username;

	@Column(name = "phone")
    private String phone;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }
}