package com.demo.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.entity.Room;
import com.demo.inner.base.serviceimpl.BaseServiceImpl;
import com.demo.mapper.RoomMapper;
import com.demo.service.RoomService;

@Service
public class RoomServiceImpl extends BaseServiceImpl<Room, RoomMapper> implements RoomService{

	@Override
	public List<Room> selecRoomsByUserID(String userID) {
		return mapper.selecRoomsByUserID(userID);
	}

	@Override
	public Room selectRoomByTime(String roomName, Date roomDate, String roomTime) {
		return mapper.selectRoomByTime(roomName,roomDate,roomTime);
	}

}
