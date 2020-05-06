package com.niefx.cms.vo;

import java.math.BigDecimal;
import java.util.Date;
/**
 * 
 * @ClassName: RoomVO 
 * @Description: 条件查询类
 * @author: X
 * @date: 2020年5月6日 上午9:48:10
 */
public class RoomVO {
	private String name;
	private BigDecimal p1;
	private BigDecimal p2;
	private String beiz;
	private Date t1;
	private Date t2;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getP1() {
		return p1;
	}
	public void setP1(BigDecimal p1) {
		this.p1 = p1;
	}
	public BigDecimal getP2() {
		return p2;
	}
	public void setP2(BigDecimal p2) {
		this.p2 = p2;
	}
	public String getBeiz() {
		return beiz;
	}
	public void setBeiz(String beiz) {
		this.beiz = beiz;
	}
	public Date getT1() {
		return t1;
	}
	public void setT1(Date t1) {
		this.t1 = t1;
	}
	public Date getT2() {
		return t2;
	}
	public void setT2(Date t2) {
		this.t2 = t2;
	}
	public RoomVO(String name, BigDecimal p1, BigDecimal p2, String beiz, Date t1, Date t2) {
		super();
		this.name = name;
		this.p1 = p1;
		this.p2 = p2;
		this.beiz = beiz;
		this.t1 = t1;
		this.t2 = t2;
	}
	public RoomVO() {
		super();
	}
	
	
	
}
