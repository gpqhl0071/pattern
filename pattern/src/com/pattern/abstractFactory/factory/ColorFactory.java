/*
*Copyright (c) 2016, gp.inc and/or its affiliates. All rights reserved.
*/
package com.pattern.abstractFactory.factory;

import com.pattern.abstractFactory.Color;
import com.pattern.abstractFactory.Shape;
import com.pattern.abstractFactory.impl.Blue;
import com.pattern.abstractFactory.impl.Green;
import com.pattern.abstractFactory.impl.Red;

public class ColorFactory extends AbstractFactory {
	@Override
	public Shape getShape(String shapeType) {
		return null;
	}

	@Override
	public Color getColor(String color) {
		if (color == null) {
			return null;
		}
		if (color.equalsIgnoreCase("RED")) {
			return new Red();
		} else if (color.equalsIgnoreCase("GREEN")) {
			return new Green();
		} else if (color.equalsIgnoreCase("BLUE")) {
			return new Blue();
		}
		return null;
	}
}
