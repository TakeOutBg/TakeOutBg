package com.demo.service;

import java.util.List;

import com.demo.entity.OrderDtl;
import com.demo.inner.base.service.BaseService;
import com.demo.mapper.OrderDtlMapper;

public interface OrderDtlService extends BaseService<OrderDtl,OrderDtlMapper>{

	public List<OrderDtl> selectDtlByOrderID(String orderID);

}
