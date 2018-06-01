package com.demo.controller.user;

import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.entity.Room;
import com.demo.inner.dto.AjaxResult;
import com.demo.mapper.RoomMapper;
import com.demo.service.RoomService;

@Controller
@ResponseBody
@RequestMapping(value = "/room")
public class RoomController extends BaseController<Room, RoomMapper, RoomService> {

	
	@RequestMapping(value = "/getRoomByUserID.do",method = RequestMethod.GET)
	public AjaxResult<Room> getRoomByUserID(String userID){
		
		AjaxResult<Room> result = new AjaxResult<Room>();
		
		result.setResult(service.selecRoomsByUserID(userID));
		
		result.setStatus("202");
		
		return result;
	}
	
	@RequestMapping(value = "/getAllRoom.do",method = RequestMethod.GET)
	public AjaxResult<Room> getAllRoom(){
		
		AjaxResult<Room> result = new AjaxResult<Room>();
		
		result.setResult(service.getAllRoom());
		
		result.setStatus("202");
		
		return result;
	}
	
	@RequestMapping(value = "/getRoom.do",method = RequestMethod.GET)
	public AjaxResult<Room> getRoomID(String id){
		
		AjaxResult<Room> result = new AjaxResult<Room>();
		
		result.setObject(service.selectByPrimaryKey(id));
		
		result.setStatus("202");
		
		return result;
	}

	//根据roomid和userid来取消已经预约的房间。
	@RequestMapping(value = "/cancleRoom.do",method = RequestMethod.GET)
	public AjaxResult<Room> cancleRoom(String roomID, String userID){
		
		
		AjaxResult<Room> result = new AjaxResult<Room>();
		
		if(userID == null) {
			result.setStatus("404");
			result.setMessage("请先关注");
		}else {
			Room room = service.selectByPrimaryKey(roomID);
			if(userID.equals(room.getUserid())) {
				room.setRoomIsNow("no");//设置取消
				service.updateByPrimaryKey(room);
				result.setStatus("202");
				result.setMessage("取消成功");
			}else {
				result.setStatus("404");
				result.setMessage("您还未订该房间");
			}
		}
		return result;
	}

	@RequestMapping(value = "/orderRoom.do",method = RequestMethod.GET)
	public AjaxResult<Room> orderRoom(Room room,String userID){
		AjaxResult<Room> result = new AjaxResult<Room>();
		
		Room room1 = service.selectRoomByTime(room.getRoomName(),room.getRoomDate(),room.getRoomTime());
		
		if(room1!=null) {
			if("no".equals(room1.getRoomIsNow())) {
				room1.setUserid(userID);
				room1.setUserName(room.getUserName());
				room1.setUserPhone(room.getUserPhone());
				room1.setRoomNum(room.getRoomNum());
				room1.setRoomRemark(room.getRoomRemark());
				room1.setRoomIsNow("yes");
				service.updateByPrimaryKeySelective(room1);
				result.setStatus("202");
				result.setMessage("订单成功");
			}else {
				result.setStatus("404");
				result.setMessage("该房间已被预定");
			}
		}else {
			room.setUserid(userID);
			room.setId(UUID.randomUUID().toString());
			room.setRoomIsNow("yes");
			service.insertSelective(room);
			result.setStatus("202");
			result.setMessage("订单成功");
		}

		return result;
	}
	
	@RequestMapping(value = "/updateRoom.do",method = RequestMethod.GET)
	public AjaxResult<Room> updateRoom(Room room,String userID){
		AjaxResult<Room> result = new AjaxResult<Room>();
		
		//要修改的目标时间段的房间。
		Room room1 = service.selectRoomByTime(room.getRoomName(),room.getRoomDate(),room.getRoomTime());
		
		if(room1!=null) {
			if("no".equals(room1.getRoomIsNow())) {//如果这个房间没有被预约
				
				service.deleteByPrimaryKey(room1);
				
				room.setUserid(userID);
				room.setRoomIsNow("yes");
				service.updateByPrimaryKey(room);
				
				result.setStatus("202");
				result.setMessage("order success");
			}else {
				result.setStatus("404");
				result.setMessage("this room has ordered");
			}
		}else {
			
			room.setUserid(userID);
			room.setRoomIsNow("yes");
			service.updateByPrimaryKey(room);
			
			result.setStatus("202");
			result.setMessage("order success");
		}

		return result;
	}
	
	
}
