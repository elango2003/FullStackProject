package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name="houseowners")
public class UserDataModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer Id;
	@Column(name="ownername",length=30)
	private String Owner;
	@Column(name="doorno",length=6)
	private Integer DoorNo;
	public UserDataModel(Integer id,String owner, Integer doorNo) {
		super();
		this.Id = id;
		this.Owner = owner;
		this.DoorNo = doorNo;
	}
	public UserDataModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		this.Id = id;
	}
	public String getOwner() {
		return Owner;
	}
	public void setOwner(String owner) {
		this.Owner = owner;
	}
	public Integer getDoorNo() {
		return DoorNo;
	}
	public void setDoorNo(Integer doorNo) {
		this.DoorNo = doorNo;
	}
	@Override
	public String toString() {
		return "UserDataModel [Id=" + Id + ", Owner=" + Owner + ", DoorNo=" + DoorNo + "]";
	}
	
		
}
