package com.example.demo.dto;

public class UserDataDTO {
	private Integer Id;
	private String Owner;
	private Integer DoorNo;
	public UserDataDTO(Integer id, String owner, Integer doorNo) {
		super();
		this.Id = id;
		this.Owner = owner;
		this.DoorNo = doorNo;
	}
	public UserDataDTO() {
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
		return "UserDataDTO [Id=" + Id + ", Owner=" + Owner + ", DoorNo=" + DoorNo + "]";
	}
	
}
