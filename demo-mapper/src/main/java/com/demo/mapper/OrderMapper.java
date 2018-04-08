package com.demo.mapper;

import java.util.List;

import com.demo.entity.Order;
import com.demo.inner.base.mapper.BaseMapper;

public interface OrderMapper extends BaseMapper<Order>{
	
	
	public List<Order> selectOrderByUserID(String userId);
	
}