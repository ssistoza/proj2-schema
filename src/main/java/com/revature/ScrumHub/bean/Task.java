package com.revature.ScrumHub.bean;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.CascadeType;
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

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name="TASKS")
public class Task implements Serializable
{

	private static final long serialVersionUID = 6922604428131738764L;
	
	@Id
	@SequenceGenerator(sequenceName="TASK_SEQ", name="TASK_SEQ", allocationSize=1)
	@GeneratedValue(generator="TASK_SEQ", 
		strategy=GenerationType.SEQUENCE)
	@Column(name="TASK_ID")
	private int taskId;
	
	@Column(name="TASK_DESCRIPTION")
	private String taskDescription;
	
	@CreationTimestamp
	@Column(name="TASK_TIMESTAMP")
	private Timestamp taskTimestamp;
	
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="STORY_ID")
	private Story story;
	
	public Task()
	{
		
	}
	
	public Task(String taskDescription, Timestamp taskTimestamp) {
		super();
		this.taskDescription = taskDescription;
		this.taskTimestamp = taskTimestamp;
	}
	
	public Task(int taskId, String taskDescription, Timestamp taskTimestamp) {
		super();
		this.taskId = taskId;
		this.taskDescription = taskDescription;
		this.taskTimestamp = taskTimestamp;
	}	
	
	public Task(int taskId, String taskDescription, Timestamp taskTimestamp, Story story) {
		super();
		this.taskId = taskId;
		this.taskDescription = taskDescription;
		this.taskTimestamp = taskTimestamp;
		this.story = story;
	}
	
	

	public int getTaskId() {
		return taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public String getTaskDescription() {
		return taskDescription;
	}

	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}

	public Timestamp getTaskTimestamp() {
		return taskTimestamp;
	}

	public void setTaskTimestamp(Timestamp taskTimestamp) {
		this.taskTimestamp = taskTimestamp;
	}
	

	public Story getStory() {
		return story;
	}

	public void setStory(Story story) {
		this.story = story;
	}

	@Override
	public String toString() {
		return "Task [taskId=" + taskId + ", taskDescription=" + taskDescription + ", taskTimestamp=" + taskTimestamp
				+ ", story=" + story + "]";
	}
	
	
}
