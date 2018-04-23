/**
 * 
 */
package com.elias.app.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SqlResultSetMapping;

import com.elias.app.ShiftPlannerConstants;
import com.elias.app.view.ShiftPlannerView;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author ADMIN
 *
 */
@Entity
//@SqlResultSetMapping(
//	    name="shiftPlannerResult",
//	    classes={
//	        @ConstructorResult(
//	            targetClass=ShiftPlannerView.class,
//	            columns={
//	                @ColumnResult(name="shift_planner_date",type=Date.class),
//	                @ColumnResult(name="resource_name",type=String.class),
//	                @ColumnResult(name="shift_name",type=String.class)
//	            }
//	        )
//	    }
//	)
@NamedNativeQuery(name = "fetchByShiftPlannerThisWeek",
query = ShiftPlannerConstants.THISWEEKSHIFTPLANQUERY
//resultSetMapping ="shiftPlannerResult"
)
public class ShiftPlanner implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5306911443303471456L;
	/**
	 * 
	 */
	public ShiftPlanner() {
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long shiftPlannerId;
	private Date shiftPlannerDate;
	private Date modifiedTimeStamp;
	private String modifiedBy;
	private Boolean isWFH;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="resourceId")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Resources resourceEntity;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="shiftId")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Shifts shiftEntity;
	
	public ShiftPlanner(Date shiftPlannerDate, Date modifiedTimeStamp, String modifiedBy, Boolean isWFH,
			List<Resources> resourceEntity, List<Shifts> shiftEntity) {
		super();
		this.shiftPlannerDate = shiftPlannerDate;
		this.modifiedTimeStamp = modifiedTimeStamp;
		this.modifiedBy = modifiedBy;
		this.isWFH = isWFH;
	}
	
	
	
	public ShiftPlanner(Date shiftPlannerDate, Date modifiedTimeStamp, String modifiedBy, Boolean isWFH) {
		super();
		this.shiftPlannerDate = shiftPlannerDate;
		this.modifiedTimeStamp = modifiedTimeStamp;
		this.modifiedBy = modifiedBy;
		this.isWFH = isWFH;
	}


	public Boolean getIsWFH() {
		return isWFH;
	}



	public void setIsWFH(Boolean isWFH) {
		this.isWFH = isWFH;
	}



	public Resources getResourceEntity() {
		return resourceEntity;
	}



	public void setResourceEntity(Resources resourceEntity) {
		this.resourceEntity = resourceEntity;
	}



	public Shifts getShiftEntity() {
		return shiftEntity;
	}



	public void setShiftEntity(Shifts shiftEntity) {
		this.shiftEntity = shiftEntity;
	}



	public ShiftPlanner(Date shiftPlannerDate, Date modifiedTimeStamp, String modifiedBy, Boolean isWFH,
			Resources resourceEntity, Shifts shiftEntity) {
		super();
		this.shiftPlannerDate = shiftPlannerDate;
		this.modifiedTimeStamp = modifiedTimeStamp;
		this.modifiedBy = modifiedBy;
		this.isWFH = isWFH;
		this.resourceEntity = resourceEntity;
		this.shiftEntity = shiftEntity;
	}



	public Long getShiftPlannerId() {
		return shiftPlannerId;
	}
	public void setShiftPlannerId(Long shiftPlannerId) {
		this.shiftPlannerId = shiftPlannerId;
	}
	public Date getShiftPlannerDate() {
		return shiftPlannerDate;
	}
	public void setShiftPlannerDate(Date shiftPlannerDate) {
		this.shiftPlannerDate = shiftPlannerDate;
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



	@Override
	public String toString() {
		return "ShiftPlanner [shiftPlannerId=" + shiftPlannerId + ", shiftPlannerDate=" + shiftPlannerDate
				+ ", modifiedTimeStamp=" + modifiedTimeStamp + ", modifiedBy=" + modifiedBy + ", isWFH=" + isWFH
				+ ", resourceEntity=" + resourceEntity + ", shiftEntity=" + shiftEntity + "]";
	}
	

	
}
