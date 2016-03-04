/*
*Copyright (c) 2016, gp.inc and/or its affiliates. All rights reserved.
*/
package com.pattern.bridge.test;

import com.pattern.bridge.Shape;
import com.pattern.bridge.impl.Circle;
import com.pattern.bridge.impl.GreenCircle;
import com.pattern.bridge.impl.RedCircle;

public class BridgePatternDemo {
	public static void main(String[] args) {
		Shape redCircle = new Circle(100, 100, 10, new RedCircle());
		Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());

		redCircle.draw();
		greenCircle.draw();
	}
}
