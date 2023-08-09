package com.vignan.empployee;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class employee {
	 	 
	@Id
	int id;
	private String firsname,lastname;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirsname() {
		return firsname;
	}
	public void setFirsname(String firsname) {
		this.firsname = firsname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public employee(int id, String firsname, String lastname) {
		super();
		this.id = id;
		this.firsname = firsname;
		this.lastname = lastname;
	}
	public employee() {
		super();
		// TODO Auto-generated constructor stub
	}

}
