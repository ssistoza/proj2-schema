package com.revature.ScrumHub.bean;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="SCRUMHUB_USER")
public class ScrumUser implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@SequenceGenerator(sequenceName="FILL_SEQ", name="FILL_SEQ")
	@GeneratedValue(generator="FILL_SEQ", strategy=GenerationType.SEQUENCE)
	@Column(name="U_ID", nullable=false)
	private int uId;
	
	@Column(name="USERNAME",unique=true,nullable=false)
	private String username;
	
	@Column(nullable=false)
	private String password;
	
	@Column(name="EMAIL", nullable=false)
	private String email;
	
	@Column(name="FIRSTNAME")
	private String firstname;
	
	@Column(name="LASTNAME")
	private String lastname;
	
	@OneToMany(mappedBy="boardMemberId", fetch=FetchType.EAGER)
	@OrderBy("sboard")
	private Set<BoardMember> associatedBoards = new HashSet<>();
	
	public ScrumUser() {}

	public ScrumUser(int uId, String username, String password, String email, String firstname, String lastname) {
		super();
		this.uId = uId;
		this.username = username;
		this.password = password;
		this.email = email;
		this.firstname = firstname;
		this.lastname = lastname;
	}

	public int getuId() {
		return uId;
	}


	public void setuId(int uId) {
		this.uId = uId;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public Set<BoardMember> getAssociatedBoards() {
		return associatedBoards;
	}

	public void setAssociatedBoards(Set<BoardMember> associatedBoards) {
		this.associatedBoards = associatedBoards;
	}

	@Override
	public String toString() {
		return "ScrumUser [uId=" + uId + ", username=" + username + ", email=" + email + ", firstname=" + firstname
				+ ", lastname=" + lastname + "]";
	}
	
}
