package com.niefx.cms.service.impl;

import static org.junit.Assert.*;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bw.niefx.util.DateUtil;
import com.bw.niefx.util.RandomUtil;
import com.bw.niefx.util.StringUtil;
import com.niefx.cms.domain.Room;
import com.niefx.cms.domain.Rooms;
import com.niefx.cms.service.RoomService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-beans.xml")
public class RoomServiceImplTest {

	@Autowired
	private RoomService service;
	
	
	@Test
	public void testRooms() {
		
		List<Rooms> list = new ArrayList<Rooms>();
		for(int i=1;i<=100;i++) {
			Rooms r = new Rooms();
			
			//预订日期   模拟从2020年5月1日至今任意随机日期（4分） 
			Calendar calendar = Calendar.getInstance();
			calendar.set(2020, 5, 1);
			r.setRiqi(DateUtil.random(calendar.getTime(), new Date()));
			//姓名       调用StringUtil.generateChineseName()创建（4分）
			r.setName(StringUtil.generateChineseName());
			//手机       11位数字（4分）
			r.setPhone(BigInteger.valueOf(Long.valueOf("1234567899"+i)));
			
			//房型id    来自房型类型表（4分）
			r.setTid(RandomUtil.random(1, 4));
			//备注       随机汉字（4分）
			r.setBeiz(StringUtil.randomChineseString());
			r.setId(i);
			list.add(r);
			System.out.println(r);
		}
		
		service.insertRooms(list);
	}

}
