package com.cognizant;
import java.util.Date;

public class CustomerDetails {
	private int id;
	private String name;
	private String email;
	private long mobile;
	private Date entryDate;
	private String location;
	
	public CustomerDetails(int id2, String email2) {
		super();
		this.id=id2;
		this.email=email2;
	}

	public CustomerDetails(int id, String name, String email, long mobile, Date entryDate, String location) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.entryDate = entryDate;
		this.location= location;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public Date getEntryDate() {
		return entryDate;
	}
	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "CustomerDetails [id=" + id + ", name=" + name + ", email=" + email + ", mobile=" + mobile
				+ ", entryDate=" + entryDate + ", location=" + location + "]";
	}

}
