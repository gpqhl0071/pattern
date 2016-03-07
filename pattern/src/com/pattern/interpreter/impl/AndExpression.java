/*
*Copyright (c) 2016, gp.inc and/or its affiliates. All rights reserved.
*/
package com.pattern.interpreter.impl;

import com.pattern.interpreter.Expression;

public class AndExpression implements Expression {

	private Expression expr1 = null;
	private Expression expr2 = null;

	public AndExpression(Expression expr1, Expression expr2) {
		this.expr1 = expr1;
		this.expr2 = expr2;
	}

	@Override
	public boolean interpret(String context) {
		return expr1.interpret(context) && expr2.interpret(context);
	}

}
