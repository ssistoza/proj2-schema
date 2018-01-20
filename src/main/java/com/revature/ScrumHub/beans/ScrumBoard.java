package com.revature.ScrumHub.beans;

import javax.persistence.Entity;

@Entity
@Table(name="BOARD")
public class ScrumBoard {
	
	@Id
	@SequenceGenerator(name="B_SEQ", sequenceName="B_SEQ", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="B_SEQ")
	@Column(name="B_ID")
	private int bId;

	private String bName;

	
}
