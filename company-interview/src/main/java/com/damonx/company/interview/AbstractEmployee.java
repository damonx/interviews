package com.damonx.company.interview;

import java.util.Objects;

/**
 * Abstract class represents an employee;
 *
 * @author damonx
 *
 */

public abstract class AbstractEmployee {

	protected Employee immediateManager;

	public abstract void addManager(Employee manager);

	public abstract void removeManager();

	public abstract void print();

	/**
	 * Prints arrows recursively.
	 */
	protected void printArrow() {
		System.out.print("->");
		if (!Objects.isNull(this.immediateManager)) {
			this.immediateManager.printArrow();
		}
	}

}
