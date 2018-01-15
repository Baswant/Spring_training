package com.test.employee;

public class Employee {

	private int eno;

	private String ename;
	
	private Address eaddress;

	public Address getEaddress() {
		return eaddress;
	}

	public void setEaddress(Address eaddress) {
		this.eaddress = eaddress;
	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", eaddress=" + eaddress + "]";
	}
 
	public Employee() {
		
	}
	public Employee(int eno, String ename, Address eaddress) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.eaddress = eaddress;
	}

	

}
