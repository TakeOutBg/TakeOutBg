package com.demo.entity;

import javax.persistence.Column;
import javax.persistence.Table;

import com.demo.base.entity.BaseEntity;
import com.demo.base.entity.annotation.EnableExample;

@Table(name = "user_coupou")
public class UserCoupou extends BaseEntity{
	
	@Column(name = "user_id")
	@EnableExample
    private String userId;

	@Column(name = "coupon_id")
	@EnableExample
    private String couponId;
	
	@Column(name = "type")
	@EnableExample
	private String type;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId == null ? null : couponId.trim();
    }

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}