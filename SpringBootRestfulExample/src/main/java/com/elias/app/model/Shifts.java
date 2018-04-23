/**
 * 
 */
package com.elias.app.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author ADMIN
 *
 */
@Entity
public class Shifts implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6069415273060262052L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long shiftId;
	private String shiftName;
	private Date modifiedTimeStamp;
	private String modifiedBy;
	
	public Shifts(String shiftName, Date modifiedTimeStamp, String modifiedBy) {
		super();
		this.shiftName = shiftName;
		this.modifiedTimeStamp = modifiedTimeStamp;
		this.modifiedBy = modifiedBy;
	}
	public Shifts() {
	}
	public Long getShiftId() {
		return shiftId;
	}
	public void setShiftId(Long shiftId) {
		this.shiftId = shiftId;
	}
	public String getShiftName() {
		return shiftName;
	}
	public void setShiftName(String shiftName) {
		this.shiftName = shiftName;
	}
	public Date getModifiedTimeStamp() {
		return modifiedTimeStamp;
	}
	public void setModifiedTimeStamp(Date modifiedTimeStamp) {
		this.modifiedTimeStamp = modifiedTimeStamp;
	}
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "ShiftEntity [shiftId=" + shiftId + ", shiftName=" + shiftName + ", modifiedTimeStamp="
				+ modifiedTimeStamp + ", modifiedBy=" + modifiedBy + "]";
	}
	
	
}
