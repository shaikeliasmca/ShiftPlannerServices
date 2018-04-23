/**
 * 
 */
package com.elias.app.view;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author ADMIN
 *
 */
public class ShiftPlannerView {

	
	private Date shiftPlannerDate;
	private String resourceName;
	private String shiftName;
	
	
	public Date getShiftPlannerDate() {
		return shiftPlannerDate;
	}
	public void setShiftPlannerDate(Date shiftPlannerDate) {
		this.shiftPlannerDate = shiftPlannerDate;
	}
	public String getResourceName() {
		return resourceName;
	}
	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}
	public String getShiftName() {
		return shiftName;
	}
	public void setShiftName(String shiftName) {
		this.shiftName = shiftName;
	}

	
}
