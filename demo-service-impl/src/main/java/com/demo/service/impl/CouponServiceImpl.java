package com.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.entity.Coupon;
import com.demo.entity.UserCoupou;
import com.demo.inner.base.serviceimpl.BaseServiceImpl;
import com.demo.mapper.CouponMapper;
import com.demo.service.CouponService;

@Service
public class CouponServiceImpl extends BaseServiceImpl<Coupon, CouponMapper> implements CouponService{
	@Override
	public List<UserCoupou> getAvaliableList() {
		return mapper.getAvaliableList();
	}

	@Override
	public List<UserCoupou> getDateoutList(String userId) {
		return mapper.getDateoutList(userId);
	}

	@Override
	public List<UserCoupou> getUnuseList(String userId) {
		return mapper.getUnuseList(userId);
	}

	@Override
	public List<UserCoupou> getUsedList(String userId) {
		return mapper.getUsedList(userId);
	}

}
