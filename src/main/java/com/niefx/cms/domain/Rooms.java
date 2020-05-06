package com.niefx.cms.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
/**
 * 
 * @ClassName: Room 
 * @Description: 预订房间类
 * @author: X
 * @date: 2020年5月6日 上午9:44:13
 */
public class Rooms implements Serializable{
	/**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private int tid;
	private BigInteger phone;
	private Date riqi;
	private String beiz;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public BigInteger getPhone() {
		return phone;
	}
	public void setPhone(BigInteger phone) {
		this.phone = phone;
	}
	public Date getRiqi() {
		return riqi;
	}
	public void setRiqi(Date riqi) {
		this.riqi = riqi;
	}
	public String getBeiz() {
		return beiz;
	}
	public void setBeiz(String beiz) {
		this.beiz = beiz;
	}

	public Rooms(int id, String name, int tid, BigInteger phone, Date riqi, String beiz) {
		super();
		this.id = id;
		this.name = name;
		this.tid = tid;
		this.phone = phone;
		this.riqi = riqi;
		this.beiz = beiz;
	}
	public Rooms() {
		super();
	}
	

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((beiz == null) ? 0 : beiz.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + ((riqi == null) ? 0 : riqi.hashCode());
		result = prime * result + tid;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rooms other = (Rooms) obj;
		if (beiz == null) {
			if (other.beiz != null)
				return false;
		} else if (!beiz.equals(other.beiz))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (riqi == null) {
			if (other.riqi != null)
				return false;
		} else if (!riqi.equals(other.riqi))
			return false;
		if (tid != other.tid)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Rooms [id=" + id + ", name=" + name + ", tid=" + tid + ", phone=" + phone + ", riqi=" + riqi + ", beiz="
				+ beiz + "]";
	}
	
	
	
}
