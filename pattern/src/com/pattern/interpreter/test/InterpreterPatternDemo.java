/*
*Copyright (c) 2016, gp.inc and/or its affiliates. All rights reserved.
*/
package com.pattern.interpreter.test;

import com.pattern.interpreter.Expression;
import com.pattern.interpreter.impl.AndExpression;
import com.pattern.interpreter.impl.OrExpression;
import com.pattern.interpreter.impl.TerminalExpression;

public class InterpreterPatternDemo {
	// 规则：Robert 和 John 是男性
	public static Expression getMaleExpression() {
		Expression robert = new TerminalExpression("Robert");
		Expression john = new TerminalExpression("John");
		return new OrExpression(robert, john);
	}

	// 规则：Julie 是一个已婚的女性
	public static Expression getMarriedWomanExpression() {
		Expression julie = new TerminalExpression("Julie");
		Expression married = new TerminalExpression("Married");
		return new AndExpression(julie, married);
	}

	public static void main(String[] args) {
		Expression isMale = getMaleExpression();
		Expression isMarriedWoman = getMarriedWomanExpression();

		System.out.println("John is male? " + isMale.interpret("John"));
		System.out.println("Julie is a married women? " + isMarriedWoman.interpret("Married Julie"));
	}
}
