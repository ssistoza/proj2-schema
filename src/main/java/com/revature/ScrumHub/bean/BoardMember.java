package com.revature.ScrumHub.bean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="USER_BOARD_ROLE_JUNCTION")
@IdClass(BoardMemberId.class)
public class BoardMember {
	
	@Id
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="B_ID")
	private Board sboard;
	
	@Id
	@Column(name="U_ID")
	private int boardMemberId;
	
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="R_ID")
	private Role memberRole;
	
	public BoardMember() {}

	public BoardMember(Board sboard, int boardMemberId, Role memberRole) {
		super();
		this.sboard = sboard;
		this.boardMemberId = boardMemberId;
		this.memberRole = memberRole;
	}

	public Board getSboard() {
		return sboard;
	}

	public void setSboard(Board sboard) {
		this.sboard = sboard;
	}

	public int getBoardMemberId() {
		return boardMemberId;
	}

	public void setBoardMemberId(int boardMemberId) {
		this.boardMemberId = boardMemberId;
	}

	public Role getMemberRole() {
		return memberRole;
	}

	public void setMemberRole(Role memberRole) {
		this.memberRole = memberRole;
	}

	@Override
	public String toString() {
		return "BoardMember [sboard=" + sboard + ", boardMemberId=" + boardMemberId + ", memberRole=" + memberRole
				+ "]";
	}
	
}
