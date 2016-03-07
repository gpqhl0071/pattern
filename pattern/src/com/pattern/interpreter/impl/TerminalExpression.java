/*
*Copyright (c) 2016, gp.inc and/or its affiliates. All rights reserved.
*/
package com.pattern.interpreter.impl;

import com.pattern.interpreter.Expression;

public class TerminalExpression implements Expression {

	private String data;

	public TerminalExpression(String data) {
		this.data = data;
	}

	@Override
	public boolean interpret(String context) {
		if (context.contains(data)) {
			return true;
		}
		return false;
	}

}
