
package com.damonx.kiwiplan.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

/**
 * Client class to print out the management tree.
 *
 * @author damonx
 */
public class OrganisationClient {

	public static void main(final String[] args) {
		displayManagementTree​();
	}

//	     Id   |   Name   |  Manager Id
//        1   |   Tom    |         0
//        2   |   Mickey |         1
//        3   |   Jerry  |         2
//        4   |   John   |         2
//        5   |   Sarah  |         1

	/**
	 * Stub method given by the assignment.
	 *
	 */
	public static void displayManagementTree​() {

		final List<Employee> employeeTable = new ArrayList<>();
		final AtomicInteger index = new AtomicInteger();
		Stream.of("Tom", "Mickey", "Jerry", "John", "Sahra").forEach(person -> {
			employeeTable.add(new Employee(index.incrementAndGet(), person));
		});
		final Company company = new Company(employeeTable);
		index.set(0);
		Stream.of(2, 3, 0, 2, 1).forEach(managerId -> {
			final int idx = index.getAndIncrement();
			final Employee employee = employeeTable.get(idx);
			employee.setManagerId(managerId);
			employee.addManager(company.findEmployeById(managerId));
		});

		System.out.println("Here is the management tree:");
		System.out.println("============================");
		printEmployeeList(company,
				employeeTable.stream().sorted((e1, e2) -> e1.getManagerId().compareTo(e2.getManagerId())).findFirst().get());

		System.out.println("============================");
	}

	/**
	 * Recursively prints out the employ list, making sure: 1. The tree must start from the root manager. The root manager will have a
	 * manager ID equal to 0. There is only 1 root manager. 2. The root manager must have 1 set of indentation characters, ‘->’. For
	 * example, ->Tom 3. If an employee has a manager, then they must be displayed below their manager. 4. For every level management, they
	 * must be another set of indentation characters, ‘->’.
	 *
	 * @param company
	 * @param employee
	 */
	public static void printEmployeeList(final Company company, final Employee employee) {
		employee.print();
		final List<Employee> subEmployees = company.findSubEmployeesById(employee.getId());
		subEmployees.stream().forEach(e -> printEmployeeList(company, e));
	}

}
