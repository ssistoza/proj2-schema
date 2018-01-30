package com.revature.ScrumHub.bean;

import java.io.Serializable;

public class BoardMemberId implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private int sboard;
	
	private int boardMemberId;
	
	public BoardMemberId() { }

	public BoardMemberId(int sboard, int boardMemberId) {
		super();
		this.sboard = sboard;
		this.boardMemberId = boardMemberId;
	}

	public int getSboard() {
		return sboard;
	}

	public void setSboard(int sboard) {
		this.sboard = sboard;
	}

	public int getBoardMemberId() {
		return boardMemberId;
	}

	public void setBoardMemberId(int boardMemberId) {
		this.boardMemberId = boardMemberId;
	}

	@Override
	public String toString() {
		return "BoardMemberId [sboard=" + sboard + ", boardMemberId=" + boardMemberId + "]";
	}
	
	
}
