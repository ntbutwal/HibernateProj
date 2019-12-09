package com.kkc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "insurance")
public class InsuranceEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long policyid;

	@Column(name = "name")
	private String name;

	@Column(name = "email")
	private String email;

	@Column(name = "phno")
	private long phno;

	public long getPolicyid() {
		return policyid;
	}

	public void setPolicyid(long policyid) {
		this.policyid = policyid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhno() {
		return phno;
	}

	public void setPhno(long phno) {
		this.phno = phno;
	}

	}
