package com.demo.service;

import java.util.Date;
import java.util.List;

import com.demo.entity.Room;
import com.demo.inner.base.service.BaseService;
import com.demo.mapper.RoomMapper;

public interface RoomService extends BaseService<Room, RoomMapper>{

	public List<Room> selecRoomsByUserID(String userID);

	public Room selectRoomByTime(String roomName, Date roomDate, String roomTime);


}
