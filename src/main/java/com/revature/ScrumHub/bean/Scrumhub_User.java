package com.revature.ScrumHub.bean;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="SCRUMHUB_USER")
public class Scrumhub_User implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@SequenceGenerator(name="U_SEQ", sequenceName="U_SEQ", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="U_SEQ")
	@Column(name="U_ID", nullable=false)
	private int u_id;
	
	@Column(name="USERNAME",unique=true,nullable=false)
	private String username;
	
	@Column(nullable=false)
	private transient String password;
	
	@Column(name="EMAIL", nullable=false)
	private String email;
	
	@Column(name="FIRSTNAME")
	private String firstname;
	
	@Column(name="LASTNAME")
	private String lastname;
	
	@OneToMany(mappedBy="boardMemberId", cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private Set<BoardMember> associatedBoards = new HashSet<>();
	
	public Scrumhub_User() {}

	
	
	public Scrumhub_User(int u_id, String username, String password, String email, String firstname, String lastname) {
		super();
		this.u_id = u_id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.firstname = firstname;
		this.lastname = lastname;
	}



	public int getU_id() {
		return u_id;
	}


	public void setU_id(int u_id) {
		this.u_id = u_id;
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

	public void addAssociatedBoards(BoardMember bm) {
		this.associatedBoards.add(bm);
	}

	@Override
	public String toString() {
		return "Scrumhub_User [u_id=" + u_id + ", username=" + username + ", email=" + email + ", firstname="
				+ firstname + ", lastname=" + lastname + ", associatedBoards=" + associatedBoards + "]";
	}


	
	
}
