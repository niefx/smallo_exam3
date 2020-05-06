package com.niefx.cms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.niefx.cms.domain.Room;
import com.niefx.cms.domain.RoomType;
import com.niefx.cms.domain.Rooms;
import com.niefx.cms.service.RoomService;
import com.niefx.cms.vo.RoomVO;

@Controller
public class RoomController {
	
	@Autowired
	private RoomService service;
	
	@RequestMapping("select")
	public String select(@RequestParam(defaultValue = "1")Integer pageNum,RoomVO roomVO,Model model) {
		PageHelper.startPage(pageNum, 3);
		List<Room> list = service.select(roomVO);
		PageInfo<Room> info = new PageInfo<Room>(list);
		model.addAttribute("list", list);
		model.addAttribute("info", info);
		model.addAttribute("roomVO", roomVO);
		return "select";
	}
	
	@RequestMapping("seleroomtype")
	@ResponseBody
	public List seleroomtype(){
		return service.seleRoomType();
	}
	
	@RequestMapping("seleoneroomtype")
	@ResponseBody
	public RoomType seleoneroomtype(Integer tid) {
		
		return service.seleOneRoomType(tid);
	}
	
	@RequestMapping("add")
	public String add(Rooms rooms) {
		service.insertOne(rooms);
		return "redirect:select";
		
	}
	
}
