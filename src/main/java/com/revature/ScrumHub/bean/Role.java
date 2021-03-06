package com.revature.ScrumHub.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "ROLE")
public class Role implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(sequenceName="ROLE_SEQ", name="ROLE_SEQ")
	@GeneratedValue(generator="ROLE_SEQ", strategy=GenerationType.SEQUENCE)
	@Column(name = "R_ID", nullable=false)
	private int roleId;

	@Column(name = "BOARD_ROLE_TYPE")
	private String roleType;
	
	public Role() {
	}

	public Role(int roleId, String roleType) {
		super();
		this.roleId = roleId;
		this.roleType = roleType;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getRoleType() {
		return roleType;
	}

	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}

	@Override
	public String toString() {
		return "Roles [roleId=" + roleId + ", roleType=" + roleType + "]";
	}
}
