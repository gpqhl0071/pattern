/*
*Copyright (c) 2016, gp.inc and/or its affiliates. All rights reserved.
*/
package com.pattern.facade.impl;

import com.pattern.facade.Shape;

public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Square::draw()");
	}

}
