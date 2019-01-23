package com.damonx.kiwiplan.interview;

/**
 * Self-explainable class
 * 
 * @author damonx
 */
public class Employee extends AbstractEmployee {
	private final int Id;
	private final String name;
	private int managerId;

	public Employee(final int id, final String name) {
		this.Id = id;
		this.name = name;
	}

	public void setManagerId(final int manager_id) {
		this.managerId = manager_id;
	}

	public int getManagerId() {
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
		printArrow();
		System.out.println(getName());
	}

	@Override
	public String toString() {
		return "Employee [Id=" + this.Id + ", name=" + this.name + "]";
	}

}
