package com.demo.service;

import java.util.List;

import com.demo.entity.Coupon;
import com.demo.entity.UserCoupou;
import com.demo.inner.base.service.BaseService;
import com.demo.mapper.CouponMapper;

public interface CouponService extends BaseService<Coupon,CouponMapper>{
	public List<UserCoupou> getAvaliableList();
	
	public List<UserCoupou> getDateoutList(String userId);
	
	public List<UserCoupou> getUnuseList(String userId);
	
	public List<UserCoupou> getUsedList(String userId);
}