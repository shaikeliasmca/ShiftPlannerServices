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
public class Resources implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8078915306498790034L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long resourceId;
	
	private String resourceName;
	
	private Date modifiedTimeStamp;

	private String modifiedBy;

	public Resources(String resourceName, Date modifiedTimeStamp, String modifiedBy) {
		super();
		this.resourceName = resourceName;
		this.modifiedTimeStamp = modifiedTimeStamp;
		this.modifiedBy = modifiedBy;
	}

	public Resources() {
	}

	public Long getResourceId() {
		return resourceId;
	}

	public void setResourceId(Long resourceId) {
		this.resourceId = resourceId;
	}

	public String getResourceName() {
		return resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
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
		return "ResourceEntity [resourceId=" + resourceId + ", resourceName=" + resourceName + ", modifiedTimeStamp="
				+ modifiedTimeStamp + ", modifiedBy=" + modifiedBy + "]";
	}
	
}
