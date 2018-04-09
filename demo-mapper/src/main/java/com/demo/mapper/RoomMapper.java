package com.demo.mapper;

import java.util.Date;
import java.util.List;

import com.demo.entity.Room;
import com.demo.inner.base.mapper.BaseMapper;

public interface RoomMapper extends BaseMapper<Room>{

	public List<Room> selecRoomsByUserID(String userID);

	public Room selectRoomByTime(String roomName, Date roomDate, String roomTime);
    
}