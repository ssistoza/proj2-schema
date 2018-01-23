package com.revature.ScrumHub.bean;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
		
	@OneToMany(mappedBy="slStatus", fetch=FetchType.EAGER)
	private Set<Swimlane> statuses = new HashSet<Swimlane>();

	
	public SlStatus() {}	
	
	public SlStatus(int slStatusId, String statusType, Set<Swimlane> statuses) {
		this.slStatusId = slStatusId;
		this.statusType = statusType;
		this.statuses = statuses;
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
	
	public Set<Swimlane> getStatuses() {
		return statuses;
	}
	public void setStatuses(Set<Swimlane> statuses) {
		this.statuses = statuses;
	}

	
	@Override
	public String toString() {
		return "SlStatus [slStatusId=" + slStatusId + ", statusType=" + statusType + ", statuses=" + statuses + "]";
	}	
}
