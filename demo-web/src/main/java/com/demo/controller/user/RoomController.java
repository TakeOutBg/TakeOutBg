package com.demo.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.entity.Address;
import com.demo.entity.Room;
import com.demo.inner.base.controller.BaseController;
import com.demo.inner.dto.AjaxResult;
import com.demo.mapper.RoomMapper;
import com.demo.service.RoomService;

@Controller
@ResponseBody
@RequestMapping(value = "/room")
public class RoomController extends BaseController<Room, RoomMapper, RoomService> {

	
	@RequestMapping(value = "/getAddressByUserID.do",method = RequestMethod.GET)
	public AjaxResult<Address> getAddressByUserID(String userID){
		
		AjaxResult<Address> result = new AjaxResult<Address>();
		
//		result.setResult(service.selecOrdersByUserID(userID));
		
		result.setStatus("202");
		
		return result;
	}


	
	
}
