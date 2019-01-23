/*
 * Copyright (c) Fisher and Paykel Appliances.
 *
 * This document is copyright. Except for the purpose of fair reviewing, no part
 * of this publication may be reproduced or transmitted in any form or by any
 * means, electronic or mechanical, including photocopying, recording, or any
 * information storage and retrieval system, without permission in writing from
 * the publisher. Infringers of copyright render themselves liable for
 * prosecution.
 */
package com.damonx.kiwiplan.interview;

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
