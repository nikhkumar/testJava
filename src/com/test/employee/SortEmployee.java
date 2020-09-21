package com.test.employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.test.domain.Employee;

public class SortEmployee {

	List<Employee> empList = new ArrayList<Employee>();
	
	public static void main(String[] args) {
		new SortEmployee().start();
	}

	private void start() {
		populateEmpData();
		/*
		 * Two ways to sort Object by specific field
		 * 
		 * 1) By implementing Comparator in Employee class
		 * 2) Using sort directly on list, by passing custom Comparator
		 */
		
		empList.sort(new Comparator<Employee>() {
		    @Override
		    public int compare(Employee m1, Employee m2) {
		    	return m1.getName().compareTo(m2.getName());
		     }
		});
		empList.forEach(System.out::println);
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
