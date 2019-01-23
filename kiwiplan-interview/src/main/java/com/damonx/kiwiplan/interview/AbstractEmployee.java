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

	// prints arrows recursively.
	protected void printArrow() {
		System.out.print("->");
		if (!Objects.isNull(this.immediateManager)) {
			this.immediateManager.printArrow();
		}
	}

}
