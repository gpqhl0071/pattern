/*
*Copyright (c) 2016, gp.inc and/or its affiliates. All rights reserved.
*/
package com.pattern.bridge.impl;

import com.pattern.bridge.DrawAPI;
import com.pattern.bridge.Shape;

public class Circle extends Shape {

	private int x, y, radius;

	public Circle(int x, int y, int radius, DrawAPI drawAPI) {
		super(drawAPI);
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public void draw() {
		drawAPI.drawCircle(radius, x, y);
	}

}
