package com.demo.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.entity.Address;
import com.demo.inner.base.controller.BaseController;
import com.demo.inner.dto.AjaxResult;
import com.demo.mapper.AddressMapper;
import com.demo.service.AddressService;

@Controller
@ResponseBody
@RequestMapping(value = "/adress")
public class AddressController extends BaseController<Address, AddressMapper, AddressService> {

	
	@RequestMapping(value = "/getAddressByUserID.do",method = RequestMethod.GET)
	public AjaxResult<Address> getAddressByUserID(String userID){
		
		AjaxResult<Address> result = new AjaxResult<Address>();
		
		result.setResult(service.selecOrdersByUserID(userID));
		
		result.setStatus("202");
		
		return result;
	}

	@RequestMapping(value = "/updateAddress.do",method = RequestMethod.GET)
	public AjaxResult<Address> updateAddress(Address address){
		
		AjaxResult<Address> result = new AjaxResult<Address>();
		
		service.updateByPrimaryKey(address);
		
		result.setObject(address);
		result.setStatus("202");
		
		return result;
	}
	
	@RequestMapping(value = "/createAddress.do",method = RequestMethod.GET)
	public AjaxResult<Address> createAddress(Address address){
		
		AjaxResult<Address> result = new AjaxResult<Address>();
		
		service.insert(address);
		
		result.setObject(address);
		result.setStatus("202");
		
		return result;
	}
	
	@RequestMapping(value = "/deleteAddress.do",method = RequestMethod.GET)
	public AjaxResult<Address> deleteAddress(Address address){
		
		AjaxResult<Address> result = new AjaxResult<Address>();
		
		service.delete(address);
		
		result.setStatus("202");
		
		return result;
	}
	
	
}
