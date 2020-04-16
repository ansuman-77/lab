package com.cg.iter.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Aut_hib")
public class Author {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int authorId;
	private String firstName;
	private String middleName;
	private String lastName;
	private long phoneNo;

	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Author(String firstName, String middleName, String lastName, long phoneNo) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;	
		this.phoneNo = phoneNo;
	}


	public Author(int authorId, String firstName, String middleName, String lastName, long phoneNo) {
		this.authorId = authorId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;	
		this.phoneNo = phoneNo;
	}


	@Override
	public String toString() {
		return "AuthorEntity [authorId=" + authorId + ", firstName=" + firstName + ", middleName="
				+ middleName + ",lastName=" + lastName + ", phoneNo=" + phoneNo + "]";
	}

	public int getAuthorId() {
		return authorId;
	}

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

}