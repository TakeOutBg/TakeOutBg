package com.demo.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.demo.entity.Room;
import com.demo.inner.base.mapper.BaseMapper;

public interface RoomMapper extends BaseMapper<Room>{

	public List<Room> selecRoomsByUserID(String userID);

	public Room selectRoomByTime(@Param("roomName")String roomName, @Param("roomDate")String roomDate, @Param("roomTime")String roomTime);
    
}