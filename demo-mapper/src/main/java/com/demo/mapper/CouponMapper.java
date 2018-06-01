package com.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.demo.entity.Coupon;
import com.demo.entity.UserCoupou;
import com.demo.inner.base.mapper.BaseMapper;

public interface CouponMapper extends BaseMapper<Coupon>{

	public List<UserCoupou> getAvaliableList();

	public List<UserCoupou> getDateoutList(@Param("userId") String userId);
	
	public List<UserCoupou> getUnuseList(@Param("userId") String userId);
	
	public List<UserCoupou> getUsedList(@Param("userId") String userId);
}