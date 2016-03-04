/*
*Copyright (c) 2016, gp.inc and/or its affiliates. All rights reserved.
*/
package com.pattern.fyweight;

import java.util.HashMap;

import com.pattern.fyweight.impl.Circle;

public class ShapeFactory {
	private static final HashMap<String, Shape> circleMap = new HashMap();

	public static Shape getCircle(String color) {
		Circle circle = (Circle) circleMap.get(color);

		if (circle == null) {
			circle = new Circle(color);
			circleMap.put(color, circle);
			System.out.println("Creating circle of color : " + color);
		}
		return circle;
	}
}
