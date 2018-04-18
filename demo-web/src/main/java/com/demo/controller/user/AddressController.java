package com.demo.controller.user;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.entity.Address;
import com.demo.inner.dto.AjaxResult;
import com.demo.mapper.AddressMapper;
import com.demo.service.AddressService;

@Controller
@ResponseBody
@RequestMapping(value = "/address")
public class AddressController extends BaseController<Address, AddressMapper, AddressService> {

	@Autowired
	private AddressService addressService;
	
	@RequestMapping(value = "/insertSelective.do",method={RequestMethod.POST})
	@ResponseBody
	public AjaxResult<Address> insertSelective(@RequestBody Address record){
		AjaxResult<Address> ajax = new AjaxResult<Address>();
		
		record.setId(UUID.randomUUID().toString());
		if("true".equals(record.getAddIsDefault())){
			Address address = new Address();
			address.setAddIsDefault("false");
			Address address2 = new Address();
			address2.setUserid(record.getUserid());
			addressService.updateByExampleSelective(address,address2);
		}
		int flag = addressService.insertSelective(record);
		if(flag == 0){
			ajax.setStatus("500");
			ajax.setMessage("插入失败");
		}else{
			ajax.setStatus("200");
			ajax.setMessage("插入成功");
			ajax.setObject(service.selectByPrimaryKey(record.getId()));
		}
		return ajax;
	}
	
	@RequestMapping(value = "/update.do",method={RequestMethod.POST})
	@ResponseBody
	public AjaxResult<Address> update(@RequestBody Address record){
		AjaxResult<Address> ajax = new AjaxResult<Address>();
		if("true".equals(record.getAddIsDefault())){
			Address address = new Address();
			address.setAddIsDefault("false");
			Address address2 = new Address();
			address2.setUserid(record.getUserid());
			addressService.updateByExampleSelective(address,address2);
		}
		int flag = service.updateByPrimaryKey(record);
		if(flag == 0){
			ajax.setStatus("500");
			ajax.setMessage("更新失败");
		}else{
			ajax.setStatus("200");
			ajax.setMessage("更新成功");
			ajax.setObject(service.selectByPrimaryKey(record.getId()));
		}
		return ajax;
	}
	
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
