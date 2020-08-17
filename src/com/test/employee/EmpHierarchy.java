package com.test.employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.test.domain.Employee;

public class EmpHierarchy {
	List<Employee> empList = new ArrayList<Employee>();

	public static void main(String[] args) {
		new EmpHierarchy().test();
	}

	private void test() {
		populateEmpData();
		
		int empId = 8;
		printEmpHierarchy(empId);
		System.out.println("--------------------------");
		empId = 1;
		printEmpHierarchy(empId);
		System.out.println("--------------------------");
		empId = 10;
		printEmpHierarchy(empId);
		System.out.println("--------------------------");
		empId = 2;
		printEmpHierarchy(empId);
		System.out.println("--------------------------");
	}

	private void printEmpHierarchy(int empId) {
		
		Map<Integer, Employee> empMap = new HashMap<Integer, Employee>();
		empList.stream().forEach(e -> empMap.put(e.getEmpId(),e));
		
		Employee tmpE = empMap.get(empId);
		if(tmpE != null) {
			System.out.println(tmpE.toString());
			while(tmpE.getMgrId() != 0) {
				tmpE = empMap.get(tmpE.getMgrId());
				System.out.println(tmpE.toString());
			}
		}
	}

	private void populateEmpData() {
		empList.add(new Employee(1, "Abir Mehta", "CEO", 10000.00, 0));
		empList.add(new Employee(2, "Shantantu Mitra", "HR", 5000.00, 1));
		empList.add(new Employee(3, "Somit Namata", "HR", 5000.00, 1));

		empList.add(new Employee(4, "Pradhuman Singh", "PROD", 7000.00, 2));
		empList.add(new Employee(5, "Pankaj Sahi", "PROD", 7000.00, 2));
		empList.add(new Employee(6, "Shyam M", "PROD", 7000.00, 3));

		empList.add(new Employee(7, "Bijay Dubey", "MNT", 5000.00, 6));
		empList.add(new Employee(8, "Bharath Bhushan", "MNT", 50000.00, 5));

		empList.add(new Employee(9, "Rupesh Prasad", "SALES", 8000.00, 4));
		empList.add(new Employee(10, "Srinivas Reddy", "SALES", 8000.00, 4));
	}

}
