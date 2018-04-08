package com.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.entity.Address;
import com.demo.inner.base.serviceimpl.BaseServiceImpl;
import com.demo.mapper.AddressMapper;
import com.demo.service.AddressService;

@Service
public class AddressServiceImpl extends BaseServiceImpl<Address, AddressMapper> implements AddressService {

	@Override
	public List<Address> selecOrdersByUserID(String userID) {
		
		
		
		return mapper.selecOrdersByUserID(userID);
	}


	
}
