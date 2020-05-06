package com.niefx.cms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.niefx.cms.domain.Room;
import com.niefx.cms.domain.RoomType;
import com.niefx.cms.domain.Rooms;
import com.niefx.cms.vo.RoomVO;

public interface RoomMapper {
	
	/**
	 * 
	 * @Title: select 
	 * @Description: 房间订单分页+条件查询
	 * @param roomVO
	 * @return
	 * @return: List<Room>
	 */
	List<Room> select(RoomVO roomVO);
	
	/**
	 * 
	 * @Title: insertRoom 
	 * @Description: 批量添加数据
	 * @param list
	 * @return
	 * @return: int
	 */
	int insertRooms(List<Rooms> list);
	
	/**
	 * 
	 * @Title: insertOnr 
	 * @Description: 房间预订单条新增
	 * @param rooms
	 * @return
	 * @return: int
	 */
	int insertOne(Rooms rooms);
	
	/**
	 * 
	 * @Title: seleRoomType 
	 * @Description: 查询所有房型
	 * @return
	 * @return: List<RoomType>
	 */
	List<RoomType> seleRoomType();
	
	/**
	 * 
	 * @Title: seleOneRoomType 
	 * @Description: 根据tid查询单个的房间类型
	 * @return
	 * @return: RoomType
	 */
	RoomType seleOneRoomType(@Param("tid")Integer tid);
}
