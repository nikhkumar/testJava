package com.test.domain;

import java.util.List;

public class Department {

	private String deptCode;
	private String deptName;
	private List<Employee> empList;
	public Department(String deptCode, String deptName, List<Employee> empList) {
		super();
		this.deptCode = deptCode;
		this.deptName = deptName;
		this.empList = empList;
	}
	public String getDeptCode() {
		return deptCode;
	}
	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public List<Employee> getEmpList() {
		return empList;
	}
	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}
	
	
	
}
