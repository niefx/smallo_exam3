package com.niefx.cms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niefx.cms.dao.RoomMapper;
import com.niefx.cms.domain.Room;
import com.niefx.cms.domain.RoomType;
import com.niefx.cms.domain.Rooms;
import com.niefx.cms.service.RoomService;
import com.niefx.cms.vo.RoomVO;
@Service
public class RoomServiceImpl implements RoomService{

	@Autowired
	private RoomMapper dao;

	@Override
	public List<Room> select(RoomVO roomVO) {
		// TODO Auto-generated method stub
		return dao.select(roomVO);
	}

	@Override
	public int insertRooms(List<Rooms> list) {
		// TODO Auto-generated method stub
		return dao.insertRooms(list);
	}

	@Override
	public List<RoomType> seleRoomType() {
		// TODO Auto-generated method stub
		return dao.seleRoomType();
	}

	@Override
	public RoomType seleOneRoomType(Integer tid) {
		// TODO Auto-generated method stub
		return dao.seleOneRoomType(tid);
	}

	@Override
	public int insertOne(Rooms rooms) {
		// TODO Auto-generated method stub
		return dao.insertOne(rooms);
	}
	
	
}
