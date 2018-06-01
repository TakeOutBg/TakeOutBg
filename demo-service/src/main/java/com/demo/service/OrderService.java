package com.demo.service;

import java.util.List;

import com.demo.entity.Order;
import com.demo.inner.base.service.BaseService;
import com.demo.mapper.OrderMapper;

public interface OrderService extends BaseService<Order, OrderMapper>{

	public List<Order> selecOrdersByUserID(String userID);

	public List<Order> selecAllOrders();

}
