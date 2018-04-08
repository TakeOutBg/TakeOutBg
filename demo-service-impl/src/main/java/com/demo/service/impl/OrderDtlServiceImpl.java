package com.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.entity.OrderDtl;
import com.demo.inner.base.serviceimpl.BaseServiceImpl;
import com.demo.mapper.OrderDtlMapper;
import com.demo.service.OrderDtlService;

@Service
public class OrderDtlServiceImpl extends BaseServiceImpl<OrderDtl, OrderDtlMapper> implements OrderDtlService {

	@Override
	public List<OrderDtl> selectDtlByOrderID(String orderID) {
		return mapper.selectDtlByOrderID(orderID);
	}

}
