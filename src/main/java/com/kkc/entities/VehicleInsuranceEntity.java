package com.kkc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "VehicleInsurance")
public class VehicleInsuranceEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int policyid;

	@Column(name = "name")
	private String name;

	@Column(name = "email")
	private String email;

	@Column(name = "make")
	private String make;

	@Column(name = "model")
	private String model;

	@Column(name = "year")
	private int year;

	@Column(name = "type")
	private String type;

	public int getPolicyid() {
		return policyid;
	}

	public void setPolicyid(int policyid) {
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

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
