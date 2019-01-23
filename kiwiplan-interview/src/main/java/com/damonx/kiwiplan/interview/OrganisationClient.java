
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
//        3   |   Jerry  |         1
//        4   |   John   |         2
//        5   |   Sarah  |         1

	public static void displayManagementTree​() {

		final List<Employee> employeeTable = new ArrayList<>();
		final AtomicInteger index = new AtomicInteger();
		Stream.of("Tom", "Mickey", "Jerry", "John", "Sahra").forEach(person -> {
			employeeTable.add(new Employee(index.incrementAndGet(), person));
		});
		final Company company = new Company(employeeTable);
		index.set(0);
		Stream.of(0, 1, 1, 2, 1).forEach(managerId -> {
			final int idx = index.getAndIncrement();
			final Employee employee = employeeTable.get(idx);
			employee.setManagerId(managerId);
			employee.addManager(company.findEmployeById(managerId));
		});
		System.out.println("Here is the management tree:");
		System.out.println("============================");

		printEmployeeList(company, employeeTable.get(0));

		System.out.println("============================");
	}

	public static void printEmployeeList(final Company company, final Employee employee) {
		employee.print();
		final List<Employee> subEmployees = company.findSubEmployeesById(employee.getId());
		subEmployees.stream().forEach(e -> printEmployeeList(company, e));
	}

}
