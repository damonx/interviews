package com.damonx.kiwiplan.interview;

/**
 * Self-explainable class
 *
 * @author damonx
 */
public class Employee extends AbstractEmployee {
	private final int Id;
	private final String name;
	private Integer managerId;

	public Employee(final int id, final String name) {
		this.Id = id;
		this.name = name;
	}

	public void setManagerId(final Integer manager_id) {
		this.managerId = manager_id;
	}

	public Integer getManagerId() {
		return this.managerId;
	}

	public int getId() {
		return this.Id;
	}

	public String getName() {
		return this.name;
	}

	@Override
	public void addManager(final Employee manager) {
		this.immediateManager = manager;

	}

	@Override
	public void removeManager() {
		this.immediateManager = null;

	}

	@Override
	public void print() {
		Employee tempEmployee = this.immediateManager;
		System.out.print("->");
		while (tempEmployee != null) {
			System.out.print("->");
			tempEmployee = tempEmployee.immediateManager;

		}
		System.out.println(getName());
	}

	@Override
	public String toString() {
		return "Employee [Id=" + this.Id + ", name=" + this.name + "]";
	}

}
