package com.revature.ScrumHub.bean;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="USER_BOARD_ROLE_JUNCTION")
public class BoardMember implements Serializable {
	
	@Id
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private Board sboard;
	
	@Id
	private int boardMemberId;
	
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private Role memberRole;
	
	public BoardMember() { }

	public Board getSboard() {
		return sboard;
	}

	public void setSboard(Board sboard) {
		this.sboard = sboard;
	}

	public int getBoardMember() {
		return boardMemberId;
	}

	public void setBoardMember(int boardMember) {
		this.boardMemberId = boardMember;
	}

	public Role getMemberRole() {
		return memberRole;
	}

	public void setMemberRole(Role memberRole) {
		this.memberRole = memberRole;
	}

	@Override
	public String toString() {
		return "BoardMember [currentBoard=" + sboard + ", boardMember=" + boardMemberId
				+ ", memberRole=" + memberRole + "]";
	}
	
}
