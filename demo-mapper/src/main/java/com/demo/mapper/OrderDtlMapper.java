package com.demo.mapper;

import java.util.List;

import com.demo.entity.OrderDtl;
import com.demo.inner.base.mapper.BaseMapper;

public interface OrderDtlMapper extends BaseMapper<OrderDtl>{

	public List<OrderDtl> selectDtlByOrderID(String orderID) ;
    
}