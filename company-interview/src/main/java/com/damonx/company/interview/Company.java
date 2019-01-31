package com.damonx.company.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Container class which represents an org which consists of group of employees.
 *
 * @author damonx
 */
public class Company {
	List<Employee> employees = new ArrayList<>();

	public Company(final List<Employee> employees) {
		this.employees = employees;
	}

	public List<Employee> getEmployees() {
		return Collections.unmodifiableList(this.employees);
	}

	public void setEmployees(final List<Employee> employees) {
		this.employees = employees;
	}

	public Employee findEmployeById(final int id) {
		return this.employees.stream().filter(e -> e.getId() == id).findFirst().orElse(null);
	}

	/**
	 * Given an employee Id, find the sub-employee of this employee.
	 *
	 * @param id - employee's id
	 * @return a List of Employees
	 */
	public List<Employee> findSubEmployeesById(final int id) {
		final List<Employee> list = this.employees.stream().filter(e -> e.getManagerId() == id).collect(Collectors.toList());
		list.sort((e1, e2) -> e1.getName().compareTo(e2.getName()));
		return list;
	}

}
