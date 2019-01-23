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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

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

	public List<Employee> findSubEmployeesById(final int id) {
		final List<Employee> list = this.employees.stream().filter(e -> e.getManagerId() == id).collect(Collectors.toList());
		list.sort((e1, e2) -> e1.getName().compareTo(e2.getName()));
		return list;
	}

}
