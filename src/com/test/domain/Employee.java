package com.test.domain;

public class Employee {
	private int empId;
	private String name;
	private String deptCode;
	private double salary;
	private int mgrId;
	public Employee(int empId, String name, String deptCode, double salary, int mgrId) {
		super();
		this.empId = empId;
		this.name = name;
		this.deptCode = deptCode;
		this.salary = salary;
		this.mgrId = mgrId;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDeptCode() {
		return deptCode;
	}
	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getMgrId() {
		return mgrId;
	}
	public void setMgrId(int mgrId) {
		this.mgrId = mgrId;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", deptCode=" + deptCode + ", salary=" + salary
				+ ", mgrId=" + mgrId + "]";
	}
	
	

}
