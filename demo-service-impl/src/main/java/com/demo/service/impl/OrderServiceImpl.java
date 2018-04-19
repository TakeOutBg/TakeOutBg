package com.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.entity.Order;
import com.demo.inner.base.serviceimpl.BaseServiceImpl;
import com.demo.mapper.OrderMapper;
import com.demo.service.OrderService;

@Service
public class OrderServiceImpl extends BaseServiceImpl<Order, OrderMapper> implements OrderService {

	@Override
	public List<Order> selecOrdersByUserID(String userID) {
		return mapper.selectOrderByUserID(userID);
	}

	
}
