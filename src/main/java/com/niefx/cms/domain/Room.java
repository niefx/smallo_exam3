package com.niefx.cms.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
/**
 * 
 * @ClassName: Room 
 * @Description: 预订房间类
 * @author: X
 * @date: 2020年5月6日 上午9:44:13
 */
public class Room implements Serializable{
	/**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private Integer tid;
	private String tname;
	private BigDecimal tprice;
	private Integer phone;
	private Date riqi;
	private String beiz;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public BigDecimal getTprice() {
		return tprice;
	}
	public void setTprice(BigDecimal tprice) {
		this.tprice = tprice;
	}
	public Integer getPhone() {
		return phone;
	}
	public void setPhone(Integer phone) {
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
	public Room(Integer id, String name, Integer tid, String tname, BigDecimal tprice, Integer phone, Date riqi,
			String beiz) {
		super();
		this.id = id;
		this.name = name;
		this.tid = tid;
		this.tname = tname;
		this.tprice = tprice;
		this.phone = phone;
		this.riqi = riqi;
		this.beiz = beiz;
	}
	public Room() {
		super();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((beiz == null) ? 0 : beiz.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + ((riqi == null) ? 0 : riqi.hashCode());
		result = prime * result + ((tid == null) ? 0 : tid.hashCode());
		result = prime * result + ((tname == null) ? 0 : tname.hashCode());
		result = prime * result + ((tprice == null) ? 0 : tprice.hashCode());
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
		Room other = (Room) obj;
		if (beiz == null) {
			if (other.beiz != null)
				return false;
		} else if (!beiz.equals(other.beiz))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
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
		if (tid == null) {
			if (other.tid != null)
				return false;
		} else if (!tid.equals(other.tid))
			return false;
		if (tname == null) {
			if (other.tname != null)
				return false;
		} else if (!tname.equals(other.tname))
			return false;
		if (tprice == null) {
			if (other.tprice != null)
				return false;
		} else if (!tprice.equals(other.tprice))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Room [id=" + id + ", name=" + name + ", tid=" + tid + ", tname=" + tname + ", tprice=" + tprice
				+ ", phone=" + phone + ", riqi=" + riqi + ", beiz=" + beiz + "]";
	}
	
	
}
