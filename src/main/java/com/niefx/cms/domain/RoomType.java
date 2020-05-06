package com.niefx.cms.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
/**
 * 
 * @ClassName: RoomType 
 * @Description: 返回数据的房间类型类
 * @author: X
 * @date: 2020年5月6日 上午9:44:32
 */
public class RoomType implements Serializable{
	/**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = 1L;
	private BigInteger tid;
	private String tname;
	private BigDecimal tprice;
	public BigInteger getTid() {
		return tid;
	}
	public void setTid(BigInteger tid) {
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
	public RoomType(BigInteger tid, String tname, BigDecimal tprice) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.tprice = tprice;
	}
	public RoomType() {
		super();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		RoomType other = (RoomType) obj;
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
		return "RoomType [tid=" + tid + ", tname=" + tname + ", tprice=" + tprice + "]";
	}
	
}
