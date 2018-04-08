package com.demo.mapper;

import java.util.List;

import com.demo.entity.Address;
import com.demo.inner.base.mapper.BaseMapper;

public interface AddressMapper extends BaseMapper<Address>{

	public List<Address> selecOrdersByUserID(String userID);
    
}