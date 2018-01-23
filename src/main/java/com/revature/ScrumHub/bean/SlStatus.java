package com.revature.ScrumHub.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SWIMLANE_STATUS")
public class SlStatus implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="SL_STATUS_ID", nullable=false)
	private int slStatusId;
	@Column(name="STATUS_TYPE")
	private String statusType;
		
	
	public SlStatus() {}	
	
	public SlStatus(int slStatusId, String statusType) {
		this.slStatusId = slStatusId;
		this.statusType = statusType;
	}
	

	public int getSlStatusId() {
		return slStatusId;
	}
	public void setSlStatusId(int slStatusId) {
		this.slStatusId = slStatusId;
	}
	
	public String getStatusType() {
		return statusType;
	}
	public void setStatusType(String statusType) {
		this.statusType = statusType;
	}	

	
	@Override
	public String toString() {
		return "SlStatus [slStatusId=" + slStatusId + ", statusType=" + statusType + "]";
	}	
}
