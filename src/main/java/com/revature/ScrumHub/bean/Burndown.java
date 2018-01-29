package com.revature.ScrumHub.bean;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="BURNDOWN")
public class Burndown {
	
	@Id
	@SequenceGenerator(name="BURN_SEQ", sequenceName="BURN_SEQ", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="BURN_SEQ")
	@Column(name="BURN_ID")
	private int burnId;

	@Column(name="BURN_DATE")
	private Date burnDate;
	
	@Column(name="B_ID")
	private int boardId;

	@Column(name="BURN_POINT")
	private int burnedPoint;

	public Burndown() {  }
	
	public Burndown(int burnId, Date burnDate, int boardId, int burnedPoint) {
		super();
		this.burnId = burnId;
		this.burnDate = burnDate;
		this.boardId = boardId;
		this.burnedPoint = burnedPoint;
	}

	public int getBurnId() {
		return burnId;
	}

	public void setBurnId(int burnId) {
		this.burnId = burnId;
	}

	public Date getBurnDate() {
		return burnDate;
	}

	public void setBurnDate(Date burnDate) {
		this.burnDate = burnDate;
	}

	public int getBoardId() {
		return boardId;
	}

	public void setBoardId(int boardId) {
		this.boardId = boardId;
	}

	public int getBurnedPoint() {
		return burnedPoint;
	}

	public void setBurnedPoint(int burnedPoint) {
		this.burnedPoint = burnedPoint;
	}

	@Override
	public String toString() {
		return "Burndown [burnId=" + burnId + ", burnDate=" + burnDate + ", boardId=" + boardId + ", burnedPoint="
				+ burnedPoint + "]";
	}
	
	
}
