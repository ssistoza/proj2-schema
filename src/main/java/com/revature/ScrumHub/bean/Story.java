package com.revature.ScrumHub.bean;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="STORIES")
public class Story implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(sequenceName="STORY_SEQ", name="STORY_SEQ", allocationSize=1)
	@GeneratedValue(generator="STORY_SEQ", strategy=GenerationType.SEQUENCE)
	@Column(name="STORY_ID", nullable=false)
	private int storyId;
	
	@Column(name="STORY_NAME", nullable=false)
	private String storyName;	
	
	private int points;
	
	@Column(name="CHECKLIST_NAME")
	private String checklistName;
	
	@Column(name="DONE_STORY_TIMESTAMP")
	private Timestamp doneStoryTimestamp;
	
	@Column(name="STORY_ORDER")
	private int storyOrder;
	
//	@ManyToOne(fetch=FetchType.EAGER)
//	@JoinColumn(name="SL_ID")
//	private int slId;
	
	public Story() {}

	public Story(int storyId, String storyName, int points, String checklistName, Timestamp doneStoryTimestamp,
			int storyOrder) {
		this.storyId = storyId;
		this.storyName = storyName;
		this.points = points;
		this.checklistName = checklistName;
		this.doneStoryTimestamp = doneStoryTimestamp;
		this.storyOrder = storyOrder;
	}
	
	

	public int getStoryId() {
		return storyId;
	}

	public void setStoryId(int storyId) {
		this.storyId = storyId;
	}

	public String getStoryName() {
		return storyName;
	}

	public void setStoryName(String storyName) {
		this.storyName = storyName;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public String getChecklistName() {
		return checklistName;
	}

	public void setChecklistName(String checklistName) {
		this.checklistName = checklistName;
	}

	public Date getDoneStoryTimestamp() {
		return doneStoryTimestamp;
	}

	public void setDoneStoryTimestamp(Timestamp doneStoryTimestamp) {
		this.doneStoryTimestamp = doneStoryTimestamp;
	}

	public int getStoryOrder() {
		return storyOrder;
	}

	public void setStoryOrder(int storyOrder) {
		this.storyOrder = storyOrder;
	}

	@Override
	public String toString() {
		return "StoriesModel [storyId=" + storyId + ", storyName=" + storyName + ", points=" + points
				+ ", checklistName=" + checklistName + ", doneStoryTimestamp=" + doneStoryTimestamp + ", storyOrder="
				+ storyOrder + "]";
	}	
}
