/*
*Copyright (c) 2016, gp.inc and/or its affiliates. All rights reserved.
*/
package com.pattern.observer;

public abstract class Observer {
	protected Subject subject;

	public abstract void update();
}
