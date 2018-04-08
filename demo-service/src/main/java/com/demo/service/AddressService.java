package com.demo.service;

import java.util.List;

import com.demo.entity.Address;
import com.demo.inner.base.service.BaseService;
import com.demo.mapper.AddressMapper;

public interface AddressService extends BaseService<Address, AddressMapper>{

	public List<Address> selecOrdersByUserID(String userID);
	

}
